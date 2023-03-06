package ScrapWala.ScrapWala.services;

import java.util.List;

import ScrapWala.ScrapWala.entities.Employee;

public interface EmployeeService {
		public List<Employee> getEmployees();
		
		public Employee getEmployee(Integer employeeId);
		
		public Employee addEmployee(Employee employee);
		
		public Employee updateEmployee(Employee employee);
		
		public void deleteEmployee(Integer employeeId);
		
}
