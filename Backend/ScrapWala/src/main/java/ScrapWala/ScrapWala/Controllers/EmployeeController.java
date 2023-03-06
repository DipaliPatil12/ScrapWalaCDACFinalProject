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
import org.springframework.web.bind.annotation.RestController;

import ScrapWala.ScrapWala.entities.Employee;
import ScrapWala.ScrapWala.services.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employees")
	public List<Employee> getEmployees()
	{
		return this.employeeService.getEmployees();
	}
	
	@GetMapping("/employees/{employeeId}")
	public Employee getEmployee(@PathVariable Integer employeeId)
	{
		return this.employeeService.getEmployee(employeeId);
	}
	
//	@PostMapping(path = "/employees", consumes="application/json")
//	public Employee addEmployee(@RequestBody Employee employee)
//	{
//		return this.addEmployee(employee);
//	}
	
	@PostMapping(path="/employees", consumes="application/json")
	public Employee addEmployee(@RequestBody Employee employee)
	{
		return this.employeeService.addEmployee(employee);
	}
	
	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee employee)
	{
		return this.employeeService.updateEmployee(employee);
	}
	
	@DeleteMapping("/employees/{employeeId}")
	public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable Integer employeeId)
	{
		try
		{
			this.employeeService.deleteEmployee(employeeId);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
