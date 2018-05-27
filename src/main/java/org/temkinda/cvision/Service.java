package org.temkinda.cvision;


import org.springframework.stereotype.Component;
import org.temkinda.cvision.mapper.DepartmentMapper;
import org.temkinda.cvision.model.Department;

import java.util.Date;


@Component
public class Service {

    private final DepartmentMapper departmentMapper;

    public Service(DepartmentMapper departmentMapper) {
        this.departmentMapper = departmentMapper;
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
}
