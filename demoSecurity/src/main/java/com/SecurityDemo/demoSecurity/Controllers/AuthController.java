package com.SecurityDemo.demoSecurity.Controllers;

import com.SecurityDemo.demoSecurity.Model.dao.services.AuthService;
import com.SecurityDemo.demoSecurity.Model.pojo.AuthRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public String login(@RequestBody AuthRequest authRequest) {
        // Authenticate user and generate JWT token
        String token = authService.authenticateUser(authRequest.getEmail(), authRequest.getPassword());
        if (token != null) {
            return token; // Return the generated JWT token
        }
        return "Invalid email or password"; // Handle failed login attempt
    }
}
