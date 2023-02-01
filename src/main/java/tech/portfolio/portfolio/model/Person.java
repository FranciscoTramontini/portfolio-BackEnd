package tech.portfolio.portfolio.model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Person implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;

    private String name;
    private String lastName;

    @Column(length = 2500)
    private String aboutMe;

    private String jobTitle;
    private String country;
    private String imageUrl;

    public Person() {
    }

    public Person(Long id, String name, String lastName, String aboutMe, String jobTitle, String country, String imageUrl) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.aboutMe = aboutMe;
        this.jobTitle = jobTitle;
        this.country = country;
        this.imageUrl = imageUrl;
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAboutMe() {
        return aboutMe;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
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
        return "Person{"
                + "id=" + id
                + ", name=" + name
                + ", lastName=" + lastName
                + ", aboutMe=" + aboutMe
                + ", jobTitle=" + jobTitle
                + ", country=" + country
                + ", imageUrl=" + imageUrl
                + '}';
    }

}
