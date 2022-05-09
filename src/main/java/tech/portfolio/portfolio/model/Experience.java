package tech.portfolio.portfolio.model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Experience implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;

    private String company;
    private String aboutJob;
    private String yearInc;
    private String yearGra;
    private String duration;
    private String country;
    private String imageUrl;

    public Experience() {
    }

    public Experience(Long id, String company, String aboutJob, String yearInc, String yearGra, String duration, String country, String imageUrl) {
        this.id = id;
        this.company = company;
        this.aboutJob = aboutJob;
        this.yearInc = yearInc;
        this.yearGra = yearGra;
        this.duration = duration;
        this.country = country;
        this.imageUrl = imageUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getAboutJob() {
        return aboutJob;
    }

    public void setAboutJob(String aboutJob) {
        this.aboutJob = aboutJob;
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

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Experience{"
                + "id=" + id
                + ", company=" + company
                + ", aboutJob=" + aboutJob
                + ", yearInc=" + yearInc
                + ", yearGra=" + yearGra
                + ", duration=" + duration
                + ", country=" + country
                + ", imageUrl=" + imageUrl
                + '}';
    }
}
