package tech.portfolio.portfolio.model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Skill implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;

    private String name;
    private Long percentage;
    private String imageUrl;

    public Skill() {
    }

    public Skill(Long id, String name, Long percentage, String imageUrl) {
        this.id = id;
        this.name = name;
        this.percentage = percentage;
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

    public Long getPercentage() {
        return percentage;
    }

    public void setPercentage(Long percentage) {
        this.percentage = percentage;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Skill{"
                + "id=" + id
                + ", name=" + name
                + ", percentage=" + percentage
                + ", imageUrl=" + imageUrl
                + '}';
    }
}
