package org.temkinda.cvision.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.temkinda.cvision.model.Employee;

import java.util.Date;
import java.util.List;

@Mapper
@Component
public interface EmployeeMapper {
    Employee selectBossOfDepartment(long id);
    int countEmployeesFromDepartment(long id);

    int getSalaryFundOfDepartment(long id);

    List<Employee> getEmployeesOfDepartment(long id);

    void insertEmployee(String surname, String  name, String patronymic, int idGender, Date birthday, String phoneNumber, String email, Date employmentDate, int idPosition, int payment, boolean isManager, Long idDepartment);

    void updateEmployee(long id, String surname, String name, String patronymic, int idGender, Date birthday, String phoneNumber, String email, Date employmentDate, int idPosition, int payment, boolean isManager, Long idDepartment);

    void dismissEmployee(long id, Date dismissalDate);

    Employee getEmployeeInfo(Long id);

    void transfereEmployeeToAnotherDepartment(Long id, Long idDepartment);
}
