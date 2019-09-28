package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Shipyard.SpaceShipBuilder;
import Shipyard.SpaceShipable;

class SpaceShipBuilderTest {

	SpaceShipBuilder spaceShipBuilderObj;
	
	@BeforeEach
	public void setUp() {
		spaceShipBuilderObj = new SpaceShipBuilder();
	}
	
	@Test
	public void checkIfSpaceShipCanBeCreated() {
		assertNotNull(spaceShipBuilderObj);
	}

	@Test
	public void checkIfSpaceShipBattleCruiserCanBeCreated() {
		SpaceShipable actualSpaceShip= spaceShipBuilderObj.build();
		
		assertNotNull(actualSpaceShip );
	}
}
