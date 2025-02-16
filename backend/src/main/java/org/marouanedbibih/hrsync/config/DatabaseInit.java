package org.marouanedbibih.hrsync.config;

import org.marouanedbibih.hrsync.user.User;
import org.marouanedbibih.hrsync.user.UserRepository;
import org.marouanedbibih.hrsync.user.UserRole;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
public class DatabaseInit implements CommandLineRunner{

    private final String PASSWORD = "Password";

    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
        initAdmin();
        initManager();
        initUser(10);
    }

    private void initAdmin(){
        User admin = User.builder()
            .username("admin")
            .password(passwordEncoder.encode(PASSWORD))
            .role(UserRole.ADMIN)
            .build();
        userRepository.save(admin);
    }

    private void initManager(){
        User manager = User.builder()
            .username("manager")
            .password(passwordEncoder.encode(PASSWORD))
            .role(UserRole.MANAGER)
            .build();
        userRepository.save(manager);
    }

    private void initUser(int numbersOfUsers){
        for(int i = 0; i < numbersOfUsers; i++){
            User user = User.builder()
                .username("user" + i)
                .password(passwordEncoder.encode(PASSWORD))
                .role(UserRole.USER)
                .build();
            userRepository.save(user);
        }
    }
    
}
