package com.company;

public class Farmer extends Role {

    public Farmer(String name) {
        this.name = name;
        setStamina(75);
        setStrength(75);
        setSpeed(10);
        setAttackPower(1);
    }

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
