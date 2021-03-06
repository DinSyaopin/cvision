package org.temkinda.cvision.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import org.temkinda.cvision.Service;
import org.temkinda.cvision.model.Department;
import org.temkinda.cvision.model.DepartmentInfo;
import org.temkinda.cvision.model.Employee;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/cvision")
public class CVisionController {

    @Autowired
    private Service service;

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

    @RequestMapping("/showDepartmentInfo/{id}")
    public DepartmentInfo showDepartmentInfo(@PathVariable Long id) {
        return service.showDepartmentInfo(id);
    }

    @RequestMapping("/showChildDepartments/{idOfParent}")
    public List<Department> showChildDepartments(@PathVariable Long idOfParent) {
        return service.selectChildDepartments(idOfParent);
    }
    @RequestMapping("/showSubordinateDepartments")
    public List<Department> showSubordinateDepartments(@RequestParam Long id) {
        return service.showSubordinateDepartments(id);
    }

    @RequestMapping("/transfereDepartment")
    public void transfereDepartment(@RequestParam("idOfParentDepartment") Long idOfParentDepartment,
                                    @RequestParam("depName") String depName) {
        service.transfereDepartment(idOfParentDepartment, depName);
    }

    @RequestMapping("/showParentDepartments")
    public List<Department> showParentDepartments(@RequestParam Long id) {
        return service.showParentDepartments(id);
    }

    @RequestMapping("/searchDepartment/{depName}")
    public ArrayList<Department> searchDepartment(@PathVariable String depName) {
        return service.searchDepartment(depName);
    }

    @RequestMapping("/getSalaryFundOfDepartment")
    public int getSalaryFundOfDepartment(@RequestParam("idOfDepartment") Long idOfDepartment) {
        return service.getSalaryFundOfDepartment(idOfDepartment);
    }

    @RequestMapping("/getEmployeesOfDepartment")
    public List<Employee> getEmployeesOfDepartment(@RequestParam("idOfDepartment") Long idOfDepartment) {
        return service.getEmployeesOfDepartment(idOfDepartment);
    }

    @RequestMapping("/insertEmployee")
    public void insertEmployee(@RequestParam("surname") String surname, @RequestParam("name") String name, @RequestParam("patronymic") String patronymic,
                                   @RequestParam("idGender") int idGender, @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) @RequestParam("birthday") Date birthday,
                                   @RequestParam("phoneNumber") String phoneNumber, @RequestParam("email") String email, @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) @RequestParam("employmentDate") Date employmentDate,
                                   @RequestParam("idPosition") int idPosition, @RequestParam("payment") int payment, @RequestParam("isManager") boolean isManager,
                                   @RequestParam("idDepartment") Long idDepartment) {
        service.insertEmployee(surname, name, patronymic, idGender, birthday, phoneNumber, email, employmentDate, idPosition, payment, isManager, idDepartment);
    }
    @RequestMapping("/updateEmployee")
    public void updateEmployee(@RequestParam("id") Long id, @RequestParam("surname") String surname, @RequestParam("name") String name, @RequestParam("patronymic") String patronymic,
                               @RequestParam("idGender") int idGender, @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) @RequestParam("birthday") Date birthday,
                               @RequestParam("phoneNumber") String phoneNumber, @RequestParam("email") String email, @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) @RequestParam("employmentDate") Date employmentDate,
                               @RequestParam("idPosition") int idPosition, @RequestParam("payment") int payment, @RequestParam("isManager") boolean isManager,
                               @RequestParam("idDepartment") Long idDepartment) {
        service.updateEmployee(id, surname, name, patronymic, idGender, birthday, phoneNumber, email, employmentDate, idPosition, payment, isManager, idDepartment);
    }
    @RequestMapping("/dismissEmployee")
    public void dismissEmployee(@RequestParam("id") Long id, @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) @RequestParam("dismissalDate") Date dismissalDate) {
        service.dismissEmployee(id, dismissalDate);
    }
    @RequestMapping("/getEmployeeInfo")
    public Employee getEmployeeInfo(@RequestParam("id") Long id) {
        return service.getEmployeeInfo(id);
    }

    @RequestMapping("/transfereEmployeeToAnotherDepartment")
    public void transfereEmployeeToAnotherDepartment(@RequestParam("id") Long id, @RequestParam("idDepartment") Long idDepartment) {
        service.transfereEmployeeToAnotherDepartment(id, idDepartment);
    }
    @RequestMapping("/transfereAllEmployeesOfDepartmentToAnotherDepartment")
    public void transfereAllEmployeesOfDepartmentToAnotherDepartment(@RequestParam("idDepartmentFrom") Long idDepartment,
                                                                     @RequestParam("idDepartmentFromTo") Long idDepartmentTo) {
        service.transfereAllEmployeesOfDepartmentToAnotherDepartment(idDepartment, idDepartmentTo);
    }
    @RequestMapping("/showBossOfEmployee")
    public Employee showBossOfEmployee(@RequestParam("id") Long id) {
        return service.showBossOfEmployee(id);
    }

    @RequestMapping("/searchEmployeeBySurnameDepartment")
    public Employee searchEmployeeBySurnameDepartment(@RequestParam("surname") String surname, @RequestParam("depName") String depName) {
        return service.searchEmployeeBySurnameDepartment(surname, depName);
    }
}