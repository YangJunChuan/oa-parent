package com.yjcxyx.oa.organ.service;

import com.yjcxyx.oa.organ.model.Employee;


public interface EmployeeService {
    
    public void addEmployee(Employee employee);
    
    public Employee findEmployeeById(Long id);
}
