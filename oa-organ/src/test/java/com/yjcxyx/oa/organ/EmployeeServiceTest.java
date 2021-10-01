package com.yjcxyx.oa.organ;

import com.yjcxyx.oa.organ.model.Employee;
import com.yjcxyx.oa.organ.service.EmployeeService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = {"classpath:application-organ.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class EmployeeServiceTest {
    
    @Autowired
    private EmployeeService employeeService;
    
    @Test
    public void testAddEmployee(){
        Employee employee = new Employee();
        employee.setName("多尔衮");
        employee.setAge(26);
        employeeService.addEmployee(employee);
    }
    
    @Test
    public void testFindEmployeeById(){
        Long id = 1L;
        Employee employee = employeeService.findEmployeeById(id);
        Assert.assertEquals("多尔衮",employee.getName());
    }
    
}
