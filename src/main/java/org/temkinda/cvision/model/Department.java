package org.temkinda.cvision.model;

import java.util.Date;

public class Department {
    private Long id;
    private String depName;
    private Date creationDate;
    private Long idParentDepartment;

    public Department() {
    }

    public Department(Long id, String depName, Date creationDate, Long idParentDepartment) {
        this.id = id;
        this.depName = depName;
        this.creationDate = creationDate;
        this.idParentDepartment = idParentDepartment;
    }

    public Long getId() {
        return id;
    }

    public void setId(long id) {
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

    public Long getIdParentDepartment() {
        return idParentDepartment;
    }

    public void setIdParentDepartment(Long idParentDepartment) {
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
