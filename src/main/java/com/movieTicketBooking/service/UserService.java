package com.movieTicketBooking.service;

import java.util.List;
import com.movieTicketBooking.model.User;
public interface UserService {
//	public void registerUser(User user);
	void registerUser(User user);
    boolean loginUser(String username, String password);
    User createUser(User user);
    User updateUser(int id, User user);
    void deleteUser(int id);
    User getUserById(int id);
    List<User> getAllUsers();
	User getUserByUsername(String username);
}
