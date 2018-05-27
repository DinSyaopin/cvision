package org.temkinda.cvision;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.temkinda.cvision.mapper.DepartmentMapper;
import org.temkinda.cvision.model.Department;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@SpringBootApplication
@ComponentScan
@MapperScan("org.temkinda.cvision.mapper")
public class CvisionApplication implements CommandLineRunner {

    private final DepartmentMapper departmentMapper;

    public CvisionApplication(DepartmentMapper departmentMapper) {
        this.departmentMapper = departmentMapper;
    }

    public static void main(String[] args) {
        SpringApplication.run(CvisionApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //Department department = departmentMapper.get(1);
        //System.out.println(department.toString());
        /*
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = "2018-10-04";
        Date parsingDate;
        parsingDate = simpleDateFormat.parse(dateString);
        departmentMapper.insertDepartment("департамент вставки", parsingDate, 1);
        */
    }
}