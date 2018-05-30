package org.temkinda.cvision;


import org.springframework.stereotype.Component;
import org.temkinda.cvision.mapper.DepartmentMapper;
import org.temkinda.cvision.mapper.EmployeeMapper;
import org.temkinda.cvision.model.Department;
import org.temkinda.cvision.model.Employee;

import java.util.Date;


@Component
public class Service {

    private final DepartmentMapper departmentMapper;
    private final EmployeeMapper employeeMapper;

    public Service(DepartmentMapper departmentMapper, EmployeeMapper employeeMapper) {
        this.departmentMapper = departmentMapper;
        this.employeeMapper = employeeMapper;
    }

    public Employee selectEmployeeById(Long id) {
        return employeeMapper.get(id);
    }

    public Department selectDepartmentById(Long id) {
        return departmentMapper.get(id);
    }

    public void insertDepartment(String depName, Date creationDate, long idParentDepartment) {
        departmentMapper.insertDepartment(depName, creationDate, idParentDepartment);
    }

    public void changeNameDepartment(String depName, String depNameNew) {
        departmentMapper.changeNameDepartment(depName, depNameNew);
    }

    public void deleteDepartment(String depName) {
        departmentMapper.deleteDepartment(depName);
    }
}
