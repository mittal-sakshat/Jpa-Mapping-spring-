package com.hibernate.project.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Products {
    @Id
    private int ProductId;
    private String ProductName;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "product_category")
    private List<Categories> categories = new ArrayList<>();

    public Products(List<Categories> categories, int productId, String productName) {
        this.categories = categories;
        ProductId = productId;
        ProductName = productName;
    }

    public Products() {
    }

    public List<Categories> getCategories() {
        return categories;
    }

    public void setCategories(List<Categories> categories) {
        this.categories = categories;
    }

    public int getProductId() {
        return ProductId;
    }

    public void setProductId(int productId) {
        ProductId = productId;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }
}
