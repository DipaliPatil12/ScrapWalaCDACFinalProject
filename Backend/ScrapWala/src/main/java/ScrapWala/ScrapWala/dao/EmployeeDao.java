package ScrapWala.ScrapWala.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ScrapWala.ScrapWala.entities.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}
