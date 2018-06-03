package org.temkinda.cvision;


import org.springframework.stereotype.Component;
import org.temkinda.cvision.mapper.DepartmentMapper;
import org.temkinda.cvision.mapper.EmployeeMapper;
import org.temkinda.cvision.model.Department;
import org.temkinda.cvision.model.DepartmentInfo;
import org.temkinda.cvision.model.Employee;

import java.util.Date;
import java.util.List;


@Component
public class Service {

    private final DepartmentMapper departmentMapper;
    private final EmployeeMapper employeeMapper;

    public Service(DepartmentMapper departmentMapper, EmployeeMapper employeeMapper) {
        this.departmentMapper = departmentMapper;
        this.employeeMapper = employeeMapper;
    }

    public Employee selectEmployeeById(Long id) {
        return employeeMapper.selectEmployeeById(id);
    }

    public Employee selectBossOfDepartment(Long id) {
        return employeeMapper.selectBossOfDepartment(id);
    }
    public int countEmployeesFromDepartment(Long id) {
        return employeeMapper.countEmployeesFromDepartment(id);
    }
    public Department selectDepartmentById(Long id) {
        return departmentMapper.selectDepartmentById(id);
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

    //D4. Takes info about department, boss of this department and quantity of employees.
    public DepartmentInfo showDepartmentInfo(Long id) {
        Employee boss = employeeMapper.selectBossOfDepartment(id);
        Department department = departmentMapper.selectDepartmentById(id);
        int quantityOfEmployees = employeeMapper.countEmployeesFromDepartment(id);
        return new DepartmentInfo(department, boss, quantityOfEmployees);
    }

    //D5. Takes child departments of current department.
    public List<Department> selectChildDepartments(Long id) {
        return departmentMapper.selectChildDepartments(id);
    }
}
