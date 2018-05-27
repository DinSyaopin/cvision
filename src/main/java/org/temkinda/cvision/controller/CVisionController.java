package org.temkinda.cvision.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import org.temkinda.cvision.Service;
import org.temkinda.cvision.model.Department;

import java.util.Date;

@RestController
@RequestMapping("/cvision")
public class CVisionController {

    @Autowired
    private Service service;

    public void setService(Service service) {
        this.service = service;
    }

    @RequestMapping("/{id}")
    public Department selectDepartmentById(@PathVariable Long id) {
       return service.selectDepartmentById(id);
    }

    /*@RequestMapping("/")//почитать про post
    public Department selectDepartmentById1(@RequestParam("id") Long id) {
        return service.selectDepartmentById(id);
    }
    */
    @RequestMapping(value = "/insertDepartment")
    public void insertDepartment(@RequestParam("depName") String depName, @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) @RequestParam("creationDate") Date creationDate,
                                 @RequestParam("idParentDepartment") long idParentDepartment) {
        //SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        //Date creationDate = simpleDateFormat.parse(creationDateString);
        service.insertDepartment(depName, creationDate, idParentDepartment);
    }
}
