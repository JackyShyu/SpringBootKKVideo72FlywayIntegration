package org.shyu.springboot;

import org.shyu.springboot.model.Employee;
import org.shyu.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootKkVideo72FlywayIntegrationApplication implements CommandLineRunner{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootKkVideo72FlywayIntegrationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee("Mike", "mike@gmail.com", 3000);
		employeeRepository.save(employee);
	}
}
