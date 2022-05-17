package com.springboot.service;

import com.springboot.entity.User;
import com.springboot.exception.entity.EmailExistException;
import com.springboot.exception.entity.EmailNotFoundException;
import com.springboot.exception.entity.UserNotFoundException;
import com.springboot.exception.entity.UsernameExistException;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface UserService {
    User findByUsername(String username);
    User findByEmail(String email);
    void deleteUser(String username) throws IOException;

    void resetPassword(String email) throws EmailNotFoundException;

    List<User> getAll();
    User register(String firstName, String lastName, String username, String email, String password) throws UserNotFoundException, EmailExistException, UsernameExistException;

    User addNewUser(String firstName, String lastName, String username, String email, String password, String role, boolean isNonLocked, boolean isActive, MultipartFile profileImage) throws UserNotFoundException, EmailExistException, UsernameExistException, IOException;
    User updateUser(String currentUsername, String firstName, String lastName, String username, String email, String role, boolean isNonLocked, boolean isActive, MultipartFile profileImage) throws UserNotFoundException, EmailExistException, UsernameExistException, IOException;
    User updateProfileImage(String username, MultipartFile profileImage) throws UserNotFoundException, EmailExistException, UsernameExistException, IOException;
    void saveProfileImage(User user, MultipartFile profileImage) throws IOException;
}
