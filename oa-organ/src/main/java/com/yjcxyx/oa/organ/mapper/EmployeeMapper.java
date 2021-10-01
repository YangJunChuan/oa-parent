package com.yjcxyx.oa.organ.mapper;

import com.yjcxyx.oa.organ.model.Employee;

public interface EmployeeMapper {
    
    public void addEmployee(Employee employee);
    
    public Employee findEmployeeById(Long id);
    
}
