package com.SecurityDemo.demoSecurity.Model.dao.services;

import com.SecurityDemo.demoSecurity.Model.pojo.OurUsers;
import com.SecurityDemo.demoSecurity.repositories.UserRepo;
import com.SecurityDemo.demoSecurity.Model.pojo.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    // Authenticate user and generate JWT token
    public String authenticateUser(String email, String password) {
        Optional<OurUsers> user = userRepo.findByEmail(email);

        if (user.isPresent() && passwordEncoder.matches(password, user.get().getPassword())) {
            // Generate JWT token if authentication is successful
            return jwtTokenUtil.generateToken(email, user.get().getRoles());
        }
        return null; // Authentication failed
    }
}
