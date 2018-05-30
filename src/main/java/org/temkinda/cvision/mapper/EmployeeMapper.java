package org.temkinda.cvision.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.temkinda.cvision.model.Employee;

@Mapper
@Component
public interface EmployeeMapper {
    Employee get(long id);
}
