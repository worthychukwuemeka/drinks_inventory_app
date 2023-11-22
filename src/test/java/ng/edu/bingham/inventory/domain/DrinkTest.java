package ng.edu.bingham.inventory.domain;

import jakarta.persistence.*;
import java.util.List;

@Entity(name = "drink")
class Drink {
    @Id
    private Long id;
    private String name;
    private int capacity;
    private String color;
    private String type;
    private String company;

    @OneToMany(mappedBy = "drink", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Ingredient> ingredientList;

    @ElementCollection
    private List<Double> priceList;

    public Drink() {
        this.ingredientList = List.of();
        this.priceList = List.of();
    }

    public Drink(Long id, String name, int capacity, String color, String type, String company, List<Ingredient> ingredientList, List<Double> priceList) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.color = color;
        this.type = type;
        this.company = company;
        this.ingredientList = ingredientList;
        this.priceList = priceList;
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

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public List<Ingredient> getIngredientList() {
        return ingredientList;
    }

    public void setIngredientList(List<Ingredient> ingredientList) {
        this.ingredientList = ingredientList;
    }

    public List<Double> getPriceList() {
        return priceList;
    }

    public void setPriceList(List<Double> priceList) {
        this.priceList = priceList;
    }
}
