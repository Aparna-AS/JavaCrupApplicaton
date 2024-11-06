// EmployeeService.java

package com.crudapplication.emproject;

import java.util.List;

public interface EmployeeService {
    Employee createEmployee(Employee employee);
    List<Employee> readEmployees();
    boolean deleteEmployee(Long id);
}
