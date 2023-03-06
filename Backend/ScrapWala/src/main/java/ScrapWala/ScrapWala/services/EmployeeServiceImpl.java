package ScrapWala.ScrapWala.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ScrapWala.ScrapWala.dao.EmployeeDao;
import ScrapWala.ScrapWala.entities.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	
	public EmployeeServiceImpl() {
		super();

	}

	@Override
	public List<Employee> getEmployees() {

		
		return employeeDao.findAll();
		
	}

	@Override
	public Employee getEmployee(Integer employeeId) {
		
		return employeeDao.getOne(employeeId);
	}

	@Override
	public Employee addEmployee(Employee employee) {
		
		employeeDao.save(employee);
		 return employee;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
	
		employeeDao.save(employee);
		return employee;
	}

	@Override
	public void deleteEmployee(Integer employeeId) {
		
		Employee entity = employeeDao.getOne(employeeId);
		employeeDao.delete(entity);
	}

}
