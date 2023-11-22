package ng.edu.bingham.inventory.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "ingredient")
public class Ingredient {
    @Id
    private Long id;
    private String name;

    public Ingredient() {
        // Default constructor
    }

    public Ingredient(String name) {
        this.name = name;
    }

    // Getter and setter for 'id'
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter and setter for 'name'
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
