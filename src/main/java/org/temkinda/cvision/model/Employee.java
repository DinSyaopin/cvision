package org.temkinda.cvision.model;

import java.util.Date;

public class Employee {

    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private int id_gender;
    private Date birthday;
    private String phone_number;
    private String email;
    private Date employment_date;
    private Date dismissal_date;
    private int id_position;
    private int payment;
    private boolean is_manager;
    private int id_department;

    public Employee(int id, String surname, String name, String patronymic, int id_gender, Date birthday, String phone_number, String email, Date employment_date, Date dismissal_date, int id_position, int payment, boolean is_manager, int id_department) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.id_gender = id_gender;
        this.birthday = birthday;
        this.phone_number = phone_number;
        this.email = email;
        this.employment_date = employment_date;
        this.dismissal_date = dismissal_date;
        this.id_position = id_position;
        this.payment = payment;
        this.is_manager = is_manager;
        this.id_department = id_department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getId_gender() {
        return id_gender;
    }

    public void setId_gender(int id_gender) {
        this.id_gender = id_gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getEmployment_date() {
        return employment_date;
    }

    public void setEmployment_date(Date employment_date) {
        this.employment_date = employment_date;
    }

    public Date getDismissal_date() {
        return dismissal_date;
    }

    public void setDismissal_date(Date dismissal_date) {
        this.dismissal_date = dismissal_date;
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

    public boolean isIs_manager() {
        return is_manager;
    }

    public void setIs_manager(boolean is_manager) {
        this.is_manager = is_manager;
    }

    public int getId_department() {
        return id_department;
    }

    public void setId_department(int id_department) {
        this.id_department = id_department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", id_gender=" + id_gender +
                ", birthday=" + birthday +
                ", phone_number='" + phone_number + '\'' +
                ", email='" + email + '\'' +
                ", employment_date=" + employment_date +
                ", dismissal_date=" + dismissal_date +
                ", id_position=" + id_position +
                ", payment=" + payment +
                ", is_manager=" + is_manager +
                ", id_department=" + id_department +
                '}';
    }
}
