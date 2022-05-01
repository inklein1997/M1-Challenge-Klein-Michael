package com.company;

public class Constable extends Role {

    public Constable(String name) {
        this.name = name;
    }

    protected String name;
    protected int stamina = 60;
    protected int speed = 20;
    protected int attackPower = 5;

    // what is jurisdiction?

    protected void arrestCharacter(Role enemy) {
        enemy.setArrested(true);
        System.out.println(name + " arrested " + enemy.getName());
    }

}
