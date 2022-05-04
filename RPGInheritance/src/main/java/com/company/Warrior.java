package com.company;

public class Warrior extends Role {

    public Warrior(String name) {
        this.name = name;
        setStamina(100);
        setStrength(75);
        setSpeed(50);
        setAttackPower(10);
    }

    protected int shieldStrength = 100;

    public int getShieldStrength() {
        return shieldStrength;
    }

    public void setShieldStrength(int shieldStrength) {
        this.shieldStrength = shieldStrength;
    }
}
