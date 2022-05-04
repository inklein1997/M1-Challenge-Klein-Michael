package com.company;

public class Constable extends Role {

    public Constable(String name, String jurisdiction) {
        this.name = name;
        this.jurisdiction = jurisdiction;
        setStamina(60);
        setSpeed(20);
        setAttackPower(5);
        setStrength(60);
    }

    private String jurisdiction;

    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    protected void arrestCharacter(Role enemy) {
        enemy.setArrested(true);
        System.out.println(name + " arrested " + enemy.getName());
    }

}
