package tech.portfolio.portfolio.model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Project implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;

    private String name;
    private String company;
    private String aboutProject;
    private String yearInc;
    private String yearGra;
    private String country;
    private String status;
    private String projectUrl;

    public Project() {
    }

    public Project(Long id, String name, String company, String aboutProject, String yearInc, String yearGra, String country, String status, String projectUrl) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.aboutProject = aboutProject;
        this.yearInc = yearInc;
        this.yearGra = yearGra;
        this.country = country;
        this.status = status;
        this.projectUrl = projectUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getAboutProject() {
        return aboutProject;
    }

    public void setAboutProject(String aboutProject) {
        this.aboutProject = aboutProject;
    }

    public String getYearInc() {
        return yearInc;
    }

    public void setYearInc(String yearInc) {
        this.yearInc = yearInc;
    }

    public String getYearGra() {
        return yearGra;
    }

    public void setYearGra(String yearGra) {
        this.yearGra = yearGra;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getProjectUrl() {
        return projectUrl;
    }

    public void setProjectUrl(String projectUrl) {
        this.projectUrl = projectUrl;
    }

    @Override
    public String toString() {
        return "Project{"
                + "id=" + id
                + ", name=" + name
                + ", company=" + company
                + ", aboutProject=" + aboutProject
                + ", yearInc=" + yearInc
                + ", yearGra=" + yearGra
                + ", country=" + country
                + ", status=" + status
                + ", projectUrl=" + projectUrl
                + '}';
    }
}
