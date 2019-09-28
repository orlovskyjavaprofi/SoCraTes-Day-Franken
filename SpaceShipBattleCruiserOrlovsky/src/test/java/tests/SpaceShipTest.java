package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Shipyard.SpaceShipBattleCruiser;
import Shipyard.SpaceShipWeapon;
import Shipyard.SpaceShipable;

class SpaceShipTest {

	SpaceShipable spaceShipBattleCruiser;
	
	@BeforeEach
	public void setUp() {
		spaceShipBattleCruiser = new SpaceShipBattleCruiser();
	}
	
	@Test
	public void checkIfSpaceShipCanBeCreated() {
		assertNotNull(spaceShipBattleCruiser);
	}
	
	@Test
	public void checkIfMainEnginesExist() {
		Integer expectedAmountOfEngines = 4;
		
		assertEquals(expectedAmountOfEngines,
				spaceShipBattleCruiser.getAmountOfEngines(),"Amount of Engines not set!");
		
	}

	@Test
	public void checkifWeaponTypeIsSet() {
		SpaceShipWeapon expectedWeaponType= SpaceShipWeapon.AntimatterCannon;
		
		assertEquals(expectedWeaponType, 
				spaceShipBattleCruiser.getCurrentWeaponType());
	}
	
	@Test
	public void checkIfSpaceShipHasHangar() {
		
		Boolean expectedHangarState = true;
		
		assertEquals(expectedHangarState,spaceShipBattleCruiser.hasSpaceShipAHangar() );
	}
}
