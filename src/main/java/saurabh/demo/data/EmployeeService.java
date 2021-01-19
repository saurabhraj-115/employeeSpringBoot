package saurabh.demo.data;

import java.util.ArrayList;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

	public String baseLine() {
		return "Welcome to the API";
	}

	public List<Employee> getAllEmployees() {

        List<Employee> employee = new ArrayList<Employee>();

        employeeRepository.findAll().forEach(employee::add);

		return employee;
	}

	public void addEmployee(Employee employee) {
        employeeRepository.save(employee);
	}

	public void updateEmployee(Employee employee) {
        employeeRepository.save(employee);
	}


    
}
