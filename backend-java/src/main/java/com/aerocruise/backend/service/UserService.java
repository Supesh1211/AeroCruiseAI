package com.aerocruise.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aerocruise.backend.entity.User;
import com.aerocruise.backend.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    @Autowired
    private JwtService jwtService;   // ✅ ADD THIS

    public User register(User user) {
        return repo.save(user);
    }

    public String login(String email, String password) {
        User user = repo.findByEmail(email).orElse(null);

        if (user != null && user.getPassword().equals(password)) {
            return jwtService.generateToken(email);  // 🔥 RETURN TOKEN
        }
        return "Invalid Credentials";
    }
}