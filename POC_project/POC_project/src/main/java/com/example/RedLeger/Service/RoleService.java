package com.example.RedLeger.Service;

import com.example.RedLeger.Entity.Role;
import com.example.RedLeger.Repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {
    @Autowired
    private RoleRepository roleRepository;

    public Role create(Role role) {
        return roleRepository.save(role);
    }

    public List<Role> getAll() {
        return roleRepository.findAll();
    }

    public Role getByName(String name) {
        Role role = roleRepository.findByName(name);
        if (role == null) throw new RuntimeException("Role not found: " + name);
        return role;
    }

    public Role updateByName(String name, Role roleDetails) {
        Role role = getByName(name);
        role.setName(roleDetails.getName());
        // set other fields as needed
        return roleRepository.save(role);
    }

    public void deleteByName(String name) {
        Role role = getByName(name);
        roleRepository.delete(role);
    }
}