package com.webservices.moviemanagement.movieservice.services;

import com.webservices.moviemanagement.movieservice.Repositories.EmployeeRepository;
import com.webservices.moviemanagement.movieservice.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private EmployeeRepository repository;

    @Autowired
    public EmployeeService(EmployeeRepository repository ) {
        this.repository = repository;
    }

    public List<Employee> get() {
        return repository.get();
    }

    public Employee  add(Employee employee) {
        return repository.add(employee);
    }
}
