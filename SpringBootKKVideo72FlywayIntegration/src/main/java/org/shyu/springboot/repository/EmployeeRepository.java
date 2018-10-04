package org.shyu.springboot.repository;

import org.shyu.springboot.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
