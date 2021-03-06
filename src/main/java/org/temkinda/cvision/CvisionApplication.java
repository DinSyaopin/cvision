package org.temkinda.cvision;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.temkinda.cvision.mapper.DepartmentMapper;
import org.temkinda.cvision.mapper.EmployeeMapper;
import org.temkinda.cvision.model.Department;
import org.temkinda.cvision.model.Employee;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

@SpringBootApplication
@ComponentScan
@MapperScan("org.temkinda.cvision.mapper")
public class CvisionApplication implements CommandLineRunner {

    private final DepartmentMapper departmentMapper;
    private final EmployeeMapper employeeMapper;

    public CvisionApplication(DepartmentMapper departmentMapper, EmployeeMapper employeeMapper) {
        this.departmentMapper = departmentMapper;
        this.employeeMapper = employeeMapper;
    }

    public static void main(String[] args) {
        SpringApplication.run(CvisionApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        employeeMapper.insertEmployee("Рыбин", "Михаил", "Валерьевич", 1,
                new SimpleDateFormat("yyyy-MM-dd").parse("1964-06-4"), "89021526644", "rybinmv@company.com",
                new SimpleDateFormat("yyyy-MM-dd").parse("2018-06-4"), 4, 40000, false, Long.parseLong("4"));
        /*Department department = departmentMapper.selectDepartmentById(1);
        System.out.print("Дата создания департамента: ");
        System.out.println(department.getCreationDate());
        System.out.print("Название департамента: ");
        System.out.println(department.getDepName());
        int salaryFund = employeeMapper.getSalaryFundOfDepartment(1);
        System.out.println(salaryFund);
        /*Employee employee = employeeMapper.selectEmployeeById(2);
        System.out.print("Фамилия сотрудника: ");
        System.out.println(employee.getSurname());
        System.out.print("Имя сотрудника: ");
        System.out.println(employee.getName());
        ArrayList<Department> departments = departmentMapper.selectChildDepartments(1);
        for (Department dep:
             departments) {
            System.out.println(dep.toString());
        }*/
        /*ArrayList<Department> departments = departmentMapper.searchDepartment("деп");
        for (Department dep:
             departments) {
            System.out.println(dep.toString());
        }*/

        //Department department1 = departmentMapper.showDepartmentInfo("департамент управления");
        //System.out.println(department1.toString());
        /*
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = "2018-10-04";
        Date parsingDate;
        parsingDate = simpleDateFormat.parse(dateString);
        departmentMapper.insertDepartment("департамент вставки", parsingDate, 1);
        */
    }
}