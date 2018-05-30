package org.temkinda.cvision.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import org.temkinda.cvision.Service;
import org.temkinda.cvision.model.Department;
import org.temkinda.cvision.model.Employee;

import java.util.Date;

@RestController
@RequestMapping("/cvision")
public class CVisionController {

    @Autowired
    private Service service;

    /*public void setService(Service service) {
        this.service = service;
    }*/


    @RequestMapping("/selectEmployeeById/{id}")
    public Employee selectEmployeeById(@PathVariable Long id) {
        return service.selectEmployeeById(id);
    }
    @RequestMapping("/selectDepartmentById/{id}")
    public Department selectDepartmentById(@PathVariable Long id) {
       return service.selectDepartmentById(id);
    }

    /*@RequestMapping("/")//почитать про post
    public Department selectDepartmentById1(@RequestParam("id") Long id) {
        return service.selectDepartmentById(id);
    }
    */
    @RequestMapping("/insertDepartment")
    public void insertDepartment(@RequestParam("depName") String depName, @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) @RequestParam("creationDate") Date creationDate,
                                 @RequestParam("idParentDepartment") long idParentDepartment) {
        //SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        //Date creationDate = simpleDateFormat.parse(creationDateString);
        service.insertDepartment(depName, creationDate, idParentDepartment);
    }

    @RequestMapping("/changeNameDepartment")
    public void changeNameDepartment(@RequestParam("depName") String depName,
                                     @RequestParam("depNameNew") String depNameNew) {
        service.changeNameDepartment(depName, depNameNew);
    }

    @RequestMapping("/deleteDepartment")
    public void deleteDepartment(@RequestParam("depName") String depName) {
        service.deleteDepartment(depName);
    }
}
