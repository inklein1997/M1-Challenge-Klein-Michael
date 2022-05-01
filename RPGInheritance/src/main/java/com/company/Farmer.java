package com.company;

public class Farmer extends Role {

    public Farmer(String name) {
        this.name = name;
    }

    protected String name;
    protected int strength = 75;
    protected int stamina = 75;
    protected int speed = 10;
    protected int attackPower = 1;

    boolean plowing = false;
    boolean harvesting = false;

    public boolean isPlowing() {
        return plowing;
    }

    public void setPlowing(boolean plowing) {
        this.plowing = plowing;
    }

    public boolean isHarvesting() {
        return harvesting;
    }

    public void setHarvesting(boolean harvesting) {
        this.harvesting = harvesting;
    }
}
