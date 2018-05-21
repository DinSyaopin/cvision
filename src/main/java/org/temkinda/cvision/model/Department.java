package org.temkinda.cvision.model;

import java.util.Date;

public class Department {
    private int id;
    private String dep_name;
    private Date creation_date;
    private int id_parent_department;

    public Department(int id, String dep_name, Date creation_date, int id_parent_department) {
        this.id = id;
        this.dep_name = dep_name;
        this.creation_date = creation_date;
        this.id_parent_department = id_parent_department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDep_name() {
        return dep_name;
    }

    public void setDep_name(String dep_name) {
        this.dep_name = dep_name;
    }

    public Date getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(Date creation_date) {
        this.creation_date = creation_date;
    }

    public int getId_parent_department() {
        return id_parent_department;
    }

    public void setId_parent_department(int id_parent_department) {
        this.id_parent_department = id_parent_department;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", dep_name='" + dep_name + '\'' +
                ", creation_date=" + creation_date +
                ", id_parent_department=" + id_parent_department +
                '}';
    }
}
