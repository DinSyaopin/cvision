package org.temkinda.cvision.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.temkinda.cvision.model.Employee;

@Mapper
@Component
public interface EmployeeMapper {
    Employee selectEmployeeById(long id);
    Employee selectBossOfDepartment(long id);
    int countEmployeesFromDepartment(long id);

    int getSalaryFundOfDepartment(long id);
}
