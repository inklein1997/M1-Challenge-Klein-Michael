package com.company.pointofsale;

import java.util.Objects;

public class IceCream {
    private String flavor;
    private double pricePerScoop;
    private int numberOfScooper;

    public IceCream(String flavor, double pricePerScoop, int numberOfScooper) {
        this.flavor = flavor;
        this.pricePerScoop = pricePerScoop;
        this.numberOfScooper = numberOfScooper;
    }

    // BEHAVIOR
    public void scoopIceCream() {
        System.out.println("Scooping ice cream for customer");
    }

    public void chargeCustomer() {
        System.out.println("Charging customer $" + getPricePerScoop() + " per scoop");
    }

    // GETTERS AND SETTERS
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPricePerScoop() {
        return pricePerScoop;
    }

    public void setPricePerScoop(double price) {
        this.pricePerScoop = price;
    }

    public int getNumberOfScooper() {
        return numberOfScooper;
    }

    public void setNumberOfScooper(int quantity) {
        this.numberOfScooper = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IceCream iceCream = (IceCream) o;
        return Double.compare(iceCream.pricePerScoop, pricePerScoop) == 0 && numberOfScooper == iceCream.numberOfScooper && Objects.equals(flavor, iceCream.flavor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavor, pricePerScoop, numberOfScooper);
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "flavor='" + flavor + '\'' +
                ", pricePerScoop=" + pricePerScoop +
                ", numberOfScooper=" + numberOfScooper +
                '}';
    }
}
