package org.temkinda.cvision.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.temkinda.cvision.model.Department;

import java.util.ArrayList;
import java.util.Date;

@Mapper
@Component
public interface DepartmentMapper {

    Department selectDepartmentById(long id);
    //void insertDepartment(long id, String depName, Date creationDate, long idParentDepartment);
    void insertDepartment(String depName, Date creationDate, long idParentDepartment);
    void changeNameDepartment(String depName, String depNameNew);
    void deleteDepartment(String depName);
    ArrayList<Department> selectChildDepartments(long id);
    void transfereDepartment(Long id, String depName);
    ArrayList<Department> searchDepartment(String depName);
}
