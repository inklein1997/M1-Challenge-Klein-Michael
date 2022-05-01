package com.company;

public class Warrior extends Role {

    public Warrior(String name) {
        this.name = name;
    }

    protected String name;
    protected int strength = 75;
    protected int stamina = 100;
    protected int speed = 50;
    protected int attackPower = 10;
    protected int shieldStrength = 100;

}
