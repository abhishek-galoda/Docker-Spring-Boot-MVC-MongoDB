package com.nevado.persistence;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nevado.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, String> {

}
