package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FarmerTest {

    Farmer farmer;

    @Before
    public void setUp() {
        farmer = new Farmer("Arthur Hogget");
    }

    @Test
    public void shouldCreateFarmerWithDefaultCharacteristics() {
        assertEquals("Arthur Hogget", farmer.getName());
        assertEquals(75, farmer.getStamina());
        assertEquals(10, farmer.getSpeed());
        assertEquals(1, farmer.getAttackPower());
        assertEquals(75, farmer.getStrength());
        assertEquals(100, farmer.getHealth());
        assertEquals(false, farmer.isRunning());
        assertEquals(false, farmer.isArrested());
        assertEquals(false, farmer.isPlowing());
        assertEquals(false, farmer.isHarvesting());
    }

    @Test
    public void shouldAttackAnotherCharacter() {
        Constable constable = new Constable("Lt. Lee Brice", "Precinct 2314");
        farmer.attackCharacter(constable);

        assertEquals(99, constable.getHealth());
    }

}