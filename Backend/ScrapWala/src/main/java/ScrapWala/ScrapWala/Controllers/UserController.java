package ScrapWala.ScrapWala.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ScrapWala.ScrapWala.entities.User;
import ScrapWala.ScrapWala.services.UserService;

@RestController
//@RequestMapping("/api/dips/")
public class UserController {
	
	@Autowired
	private UserService userService;// = new UserServiceImpl();	
	
	@GetMapping("/users")
	public List<User> getUsers()
	{
		return this.userService.getUsers();
	}
	
	@GetMapping("/users/{userId}")
	public User getUser(@PathVariable String userId)
	{
		return this.userService.getUser(Long.parseLong(userId));
	}
	
	@PostMapping(path="/users", consumes="application/json")
	public User addUser(@RequestBody User user)
	{
		return this.userService.addUser(user);
	}
	
	@PutMapping("/users")
	public User updateUser(@RequestBody User user)
	{
		return this.userService.updateUser(user);
	}
	
	@DeleteMapping("/users/{userId}")
	public ResponseEntity<HttpStatus> deleteUser(@PathVariable String userId)
	{
		try
		{
			this.userService.deleteUser(Long.parseLong(userId));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
