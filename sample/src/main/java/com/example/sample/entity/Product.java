package com.example.sample.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String title;

    @Column
    private String description;

    //todo add image

    @Column
    private String tecnical;

    @Column
    // ? String or other
    private String price;

    @Column
    private int disCount;

    @ManyToMany
    @JoinTable(name = "product_category",
            joinColumns = {@JoinColumn(name = "product_id")},
            inverseJoinColumns = {@JoinColumn(name = "category_id")})
    private List<Category> categories;

    public Product() {
    }

    public Product(String title, String description, String tecnical, String price, int disCount, List<Category> categories) {
        this.title = title;
        this.description = description;
        this.tecnical = tecnical;
        this.price = price;
        this.disCount = disCount;
        this.categories = categories;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTecnical() {
        return tecnical;
    }

    public void setTecnical(String tecnical) {
        this.tecnical = tecnical;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getDisCount() {
        return disCount;
    }

    public void setDisCount(int disCount) {
        this.disCount = disCount;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }
}
