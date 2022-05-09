package tech.portfolio.portfolio.model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Education implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;

    private String title;
    private String yearInc;
    private String yearGra;
    private String level;
    private String country;
    private String imageUrl;

    public Education() {
    }

    public Education(Long id, String title, String yearInc, String yearGra, String level, String country, String imageUrl) {
        this.id = id;
        this.title = title;
        this.yearInc = yearInc;
        this.yearGra = yearGra;
        this.level = level;
        this.country = country;
        this.imageUrl = imageUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
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
        return "Education{"
                + "id=" + id
                + ", title=" + title
                + ", yearInc=" + yearInc
                + ", yearGra=" + yearGra
                + ", level=" + level
                + ", country=" + country
                + ", imageUrl=" + imageUrl
                + '}';
    }
}
