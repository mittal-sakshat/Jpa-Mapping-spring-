package com.hibernate.project.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import org.springframework.boot.autoconfigure.kafka.DefaultKafkaProducerFactoryCustomizer;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Categories {
    @Id
    private int categoryId;
    private String categoryName;

    @ManyToMany(mappedBy = "categories", cascade = CascadeType.ALL)
    private List<Products> products = new ArrayList<>();

    public Categories() {
    }



    public Categories(int categoryId, String categoryName, List<Products> products) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.products = products;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<Products> getProducts() {
        return products;
    }

    public void setProducts(List<Products> products) {
        this.products = products;
    }
}
