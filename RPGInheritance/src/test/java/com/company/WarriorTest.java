package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WarriorTest {

    Warrior warrior;

    @Before
    public void setUp() {
        warrior = new Warrior("Hiccup Horrendous the III");
    }

    @Test
    public void shouldCreateWarriorWithDefaultCharacteristics() {
        assertEquals("Hiccup Horrendous the III", warrior.getName());
        assertEquals(100, warrior.getStamina());
        assertEquals(50, warrior.getSpeed());
        assertEquals(10, warrior.getAttackPower());
        assertEquals(75, warrior.getStrength());
        assertEquals(100, warrior.getHealth());
        assertEquals(false, warrior.isRunning());
        assertEquals(false, warrior.isArrested());
    }

    @Test
    public void shouldAttackAnotherCharacter() {
        Warrior warriorEnemy = new Warrior("Erik of Halfdan");
        warrior.attackCharacter(warriorEnemy);

        assertEquals(90, warriorEnemy.getHealth());
    }

}