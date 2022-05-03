package com.company.factory;

import java.util.ArrayList;
import java.util.List;

public class IceCream {
    private String flavor;
    private double salePrice;
    private double productionCost;
    private double productionTime;
    private List<String> ingredients;

    public IceCream(String flavor, double salePrice, double productionCost, double productionTime, List<String> ingredients) {
        this.flavor = flavor;
        this.salePrice = salePrice;
        this.productionCost = productionCost;
        this.productionTime = productionTime;
        this.ingredients = ingredients;
    }

    // Behavior
    public void makeIceCreamBulk() {
        System.out.println("Created " + getFlavor() + " in bulk.");
    }

    public void shipIceCreamToStore() {
        System.out.println("Shipping ice cream to store.");
    }


    // Getters and Setters
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public double getProductionCost() {
        return productionCost;
    }

    public void setProductionCost(double productionCost) {
        this.productionCost = productionCost;
    }

    public double getProductionTime() {
        return productionTime;
    }

    public void setProductionTime(double productionTime) {
        this.productionTime = productionTime;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }
}
