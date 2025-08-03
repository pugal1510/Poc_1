
package com.example.RedLeger.Service;

import com.example.RedLeger.Entity.Role;
import com.example.RedLeger.Entity.User;
import com.example.RedLeger.Repository.RoleRepository;
import com.example.RedLeger.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.*;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    public User createUser(User user) {
        user.setCreatedAt(new Timestamp(System.currentTimeMillis()));
        user.setUpdatedAt(new Timestamp(System.currentTimeMillis()));
        user.setRoles(fetchRolesFromDb(user.getRoles()));
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserByName(String username) {
        return userRepository.findByUsername(username);
    }

    public User updateUserByName(String username, User userDetails) {
        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("User not found: " + username));
        user.setEmail(userDetails.getEmail());
        user.setUpdatedAt(new Timestamp(System.currentTimeMillis()));
        user.setRoles(fetchRolesFromDb(userDetails.getRoles()));
        // set other fields as needed
        return userRepository.save(user);
    }

    public void deleteUserByName(String username) {
        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("User not found: " + username));
        userRepository.delete(user);
    }

    private Set<Role> fetchRolesFromDb(Set<Role> roles) {
        Set<Role> rolesFromDb = new HashSet<>();
        for (Role role : roles) {
            Role roleEntity = roleRepository.findByName(role.getName());
            if (roleEntity == null) {
                throw new RuntimeException("Role not found: " + role.getName());
            }
            rolesFromDb.add(roleEntity);
        }
        return rolesFromDb;
    }
}