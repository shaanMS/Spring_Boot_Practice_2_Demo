package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface EmpRepo extends CrudRepository<Employee,Integer> {
}
