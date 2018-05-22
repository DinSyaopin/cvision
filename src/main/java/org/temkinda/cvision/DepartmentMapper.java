package org.temkinda.cvision;


import org.temkinda.cvision.model.Department;

public interface DepartmentMapper {
    Department get(long id);
    int insert(Department department);
    void updateDepartment(String depName);
}
