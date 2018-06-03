package org.temkinda.cvision.model;

public class DepartmentInfo {
    private Department department;
    private Employee boss;
    private int countEmployeesFromDepartment;

    public DepartmentInfo(Department department, Employee boss, int countEmployeesFromDepartment) {
        this.department = department;
        this.boss = boss;
        this.countEmployeesFromDepartment = countEmployeesFromDepartment;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Employee getBoss() {
        return boss;
    }

    public void setBoss(Employee boss) {
        this.boss = boss;
    }

    public int getCountEmployeesFromDepartment() {
        return countEmployeesFromDepartment;
    }

    public void setCountEmployeesFromDepartment(int countEmployeesFromDepartment) {
        this.countEmployeesFromDepartment = countEmployeesFromDepartment;
    }
}
