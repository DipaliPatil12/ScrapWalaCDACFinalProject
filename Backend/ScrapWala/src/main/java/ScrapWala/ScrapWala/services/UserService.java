package ScrapWala.ScrapWala.services;

import java.util.List;

import ScrapWala.ScrapWala.entities.User;

public interface UserService {
	public List<User> getUsers();
	
	public User getUser(long userId);
	
	public User addUser(User user);
	
	public User updateUser(User user);
	
	public void deleteUser(long parseLong);
}
