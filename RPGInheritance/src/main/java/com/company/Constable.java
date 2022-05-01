package com.company;

public class Constable extends Role {

    public Constable(String name) {
        this.name = name;
        setStamina(60);
        setSpeed(20);
        setAttackPower(5);
        setStrength(60);
    }

    // what is jurisdiction?

    protected void arrestCharacter(Role enemy) {
        enemy.setArrested(true);
        System.out.println(name + " arrested " + enemy.getName());
    }

}
