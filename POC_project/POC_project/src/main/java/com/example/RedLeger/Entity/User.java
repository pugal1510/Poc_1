package com.example.RedLeger.Entity;

    import com.fasterxml.jackson.annotation.JsonManagedReference;
    import jakarta.persistence.*;
    import java.sql.Timestamp;
    import java.util.HashSet;
    import java.util.Set;

    @Entity
    @Table(name = "users")
    public class User {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "ID")
        private Long id;

        @Column(name = "USERNAME", nullable = false, length = 50, unique = true)
        private String username;

        @Column(name = "EMAIL", nullable = false, length = 100, unique = true)
        private String email;

        @Column(name = "PASSWORD", nullable = false, length = 255)
        private String password;

        @Column(name = "CREATED_AT", nullable = false)
        private Timestamp createdAt;

        @Column(name = "UPDATED_AT")
        private Timestamp updatedAt;

        @Column(name = "STATUS")
        private String status;

        @ManyToMany(fetch = FetchType.LAZY)
        @JoinTable(
                name = "USER_ROLES",
                joinColumns = @JoinColumn(name = "USER_ID"),
                inverseJoinColumns = @JoinColumn(name = "ROLE_ID")
        )
        @JsonManagedReference
        private Set<Role> roles = new HashSet<>();


        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public Timestamp getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(Timestamp createdAt) {
            this.createdAt = createdAt;
        }

        public Timestamp getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(Timestamp updatedAt) {
            this.updatedAt = updatedAt;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public Set<Role> getRoles() {
            return roles;
        }

        public void setRoles(Set<Role> roles) {
            this.roles = roles;
        }
    }