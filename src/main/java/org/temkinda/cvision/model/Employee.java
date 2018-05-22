package org.temkinda.cvision.model;

import java.util.Date;

public class Employee {

    private long id;
    private String surname;
    private String name;
    private String patronymic;
    private int idGender;
    private Date birthday;
    private String phoneNumber;
    private String email;
    private Date employmentDate;
    private Date dismissalDate;
    private int id_position;
    private int payment;
    private boolean isManager;
    private long idDepartment;

    public Employee(long id, String surname, String name, String patronymic, int idGender, Date birthday, String phoneNumber, String email, Date employmentDate, Date dismissalDate, int id_position, int payment, boolean isManager, long idDepartment) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.idGender = idGender;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.employmentDate = employmentDate;
        this.dismissalDate = dismissalDate;
        this.id_position = id_position;
        this.payment = payment;
        this.isManager = isManager;
        this.idDepartment = idDepartment;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getIdGender() {
        return idGender;
    }

    public void setIdGender(int idGender) {
        this.idGender = idGender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getEmploymentDate() {
        return employmentDate;
    }

    public void setEmploymentDate(Date employmentDate) {
        this.employmentDate = employmentDate;
    }

    public Date getDismissalDate() {
        return dismissalDate;
    }

    public void setDismissalDate(Date dismissalDate) {
        this.dismissalDate = dismissalDate;
    }

    public int getId_position() {
        return id_position;
    }

    public void setId_position(int id_position) {
        this.id_position = id_position;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    public boolean isManager() {
        return isManager;
    }

    public void setManager(boolean manager) {
        this.isManager = manager;
    }

    public long getIdDepartment() {
        return idDepartment;
    }

    public void setIdDepartment(long idDepartment) {
        this.idDepartment = idDepartment;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", idGender=" + idGender +
                ", birthday=" + birthday +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", employmentDate=" + employmentDate +
                ", dismissalDate=" + dismissalDate +
                ", id_position=" + id_position +
                ", payment=" + payment +
                ", isManager=" + isManager +
                ", idDepartment=" + idDepartment +
                '}';
    }
}
