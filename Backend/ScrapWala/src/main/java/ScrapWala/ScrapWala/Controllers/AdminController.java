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

import ScrapWala.ScrapWala.entities.Admin;
import ScrapWala.ScrapWala.services.AdminService;

@RestController
public class AdminController {
	@Autowired
	private AdminService adminService;
	
	@GetMapping("/admins")
	public List<Admin> getUsers()
	{
		return this.adminService.getAdmins();
	}
	
	@GetMapping("/admins/{userId}")
	public Admin getAdmin(@PathVariable Integer adminId)
	{
		return this.adminService.getAdmin(adminId);
	}
	
	@PostMapping(path="/admins", consumes="application/json")
	public Admin addAdmin(@RequestBody Admin admin)
	{
		return this.adminService.addAdmin(admin);
	}
	
	@PutMapping("/admins")
	public Admin updateUser(@RequestBody Admin admin)
	{
		return this.adminService.updateAdmin(admin);
	}
	
	@DeleteMapping("/admins/{adminId}")
	public ResponseEntity<HttpStatus> deleteAdmin(@PathVariable Integer adminId)
	{
		try
		{
			this.adminService.deleteAdmin(adminId);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
