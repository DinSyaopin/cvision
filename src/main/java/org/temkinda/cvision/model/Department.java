package org.temkinda.cvision.model;

import java.util.Date;

public class Department {
    private long id;
    private String depName;
    private Date creationDate;
    private long idParentDepartment;

    public Department() {
    }

    public Department(long id, String depName, Date creationDate, long idParentDepartment) {
        this.id = id;
        this.depName = depName;
        this.creationDate = creationDate;
        this.idParentDepartment = idParentDepartment;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public long getIdParentDepartment() {
        return idParentDepartment;
    }

    public void setIdParentDepartment(long idParentDepartment) {
        this.idParentDepartment = idParentDepartment;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", depName='" + depName + '\'' +
                ", creationDate=" + creationDate +
                ", idParentDepartment=" + idParentDepartment +
                '}';
    }
}
