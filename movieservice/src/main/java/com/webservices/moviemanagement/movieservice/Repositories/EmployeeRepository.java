package com.webservices.moviemanagement.movieservice.Repositories;

import com.webservices.moviemanagement.movieservice.model.Employee;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

@Configuration
public class EmployeeRepository {
    List<Employee> employees = new ArrayList<>(asList(new Employee("1", "tanmay Goyal"), new Employee("2", "Prachi Jain")));

    public List<Employee> get() {
        return employees;
    }

    public Employee add(Employee employee) {
         employees.add(employee);
         return  employee;
    }
}
