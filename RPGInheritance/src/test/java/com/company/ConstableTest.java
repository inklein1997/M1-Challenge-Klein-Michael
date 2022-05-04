package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConstableTest {

    Constable constable;

    @Before
    public void setUp() {
        constable = new Constable("Frank Columbo", "Precinct 23");
    }

    @Test
    public void shouldCreateConstableWithDefaultCharacteristics() {
        assertEquals("Frank Columbo", constable.getName());
        assertEquals(60, constable.getStamina());
        assertEquals(20, constable.getSpeed());
        assertEquals(5, constable.getAttackPower());
        assertEquals(60, constable.getStrength());
        assertEquals(100, constable.getHealth());
        assertEquals(false, constable.isRunning());
        assertEquals(false, constable.isArrested());
    }

    @Test
    public void shouldArrestAnotherCharacter() {
        Farmer farmer = new Farmer("Oliver Wendell Douglass");
        constable.arrestCharacter(farmer);

        assertEquals(true, farmer.isArrested());
    }

    @Test
    public void shouldAttackAnotherCharacter() {
        Warrior warrior = new Warrior("Erik of Halfdan");
        constable.attackCharacter(warrior);

        assertEquals(95, warrior.getHealth());
    }
}