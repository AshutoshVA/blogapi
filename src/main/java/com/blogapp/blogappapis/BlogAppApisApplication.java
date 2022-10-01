package com.blogapp.blogappapis;

import com.blogapp.blogappapis.config.AppConstants;
import com.blogapp.blogappapis.entities.Role;
import com.blogapp.blogappapis.repositories.RoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

@SpringBootApplication
public class BlogAppApisApplication implements CommandLineRunner {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private RoleRepo roleRepo;

    public static void main(String[] args) {
        SpringApplication.run(BlogAppApisApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(this.passwordEncoder.encode("123"));

        try {
            Role role = new Role();
            role.setRoleId(AppConstants.ADMIN_USER);
            role.setName("ADMIN_USER");

            Role role1 = new Role();
            role1.setRoleId(AppConstants.NORMAL_USER);
            role1.setName("NORMAL_USER");

            List<Role> roles = List.of(role, role1);

            List<Role> result = this.roleRepo.saveAll(roles);

            result.forEach(r -> {
                System.out.println(r.getName());
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
