package com.yjcxyx.oa.organ.service.impl;

import com.yjcxyx.oa.organ.mapper.EmployeeMapper;
import com.yjcxyx.oa.organ.model.Employee;
import com.yjcxyx.oa.organ.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yang
 */
@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;
    
    public void addEmployee(Employee employee) {
        employeeMapper.addEmployee(employee);
    }

    public Employee findEmployeeById(Long id) {
        return employeeMapper.findEmployeeById(id);
    }
}
