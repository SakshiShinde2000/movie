package com.movieTicketBooking.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.movieTicketBooking.model.User;
import com.movieTicketBooking.repository.UserRepository;
import com.movieTicketBooking.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void registerUser(User user) {
        userRepository.save(user);
    }

    @Override
    public boolean loginUser(String username, String password) {
        User user = userRepository.findByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            return true;
        }
        return false;
    }
    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(int id, User user) {
        User existingUser = userRepository.findById(id).orElse(null);
        if (existingUser != null) {
            existingUser.setPassword(user.getPassword());
       //     existingUser.setRole(user.getRole());
            existingUser.setUsername(user.getUsername());
            return userRepository.save(existingUser);
        }
        return null;
    }

    @Override
    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }

    @Override
    public User getUserById(int id) {
        return userRepository.findById(id).orElse(null);
    }
    
	
	  @Override public User getUserByUsername(String username) { return
	  userRepository.findByUsername(username); }
	 
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
	/*
	 * @Override public void registerUser(User user) { // TODO Auto-generated method
	 * stub userRepository.save(user);
	 * 
	 * }
	 */
}
