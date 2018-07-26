package com.webservices.moviemanagement.movieservice.controller;

import com.webservices.moviemanagement.movieservice.model.Employee;
import com.webservices.moviemanagement.movieservice.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    public List<Employee> employee(){
        return employeeService.get();
    }
    @RequestMapping(value = "/employees", method = RequestMethod.POST)
    public Employee addEmployee(@RequestBody  Employee employee){
        return employeeService.add(employee);
    }
}
