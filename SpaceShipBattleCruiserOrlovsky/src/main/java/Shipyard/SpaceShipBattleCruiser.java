package Shipyard;

public class SpaceShipBattleCruiser implements SpaceShipable {
	
	/* (non-Javadoc)
	 * @see Shipyard.SpaceShipable#getAmountOfEngines()
	 */
	@Override
	public Integer getAmountOfEngines() {
	// TODO Auto-generated method stub
		return 4;
	}

	/* (non-Javadoc)
	 * @see Shipyard.SpaceShipable#getCurrentWeaponType()
	 */
	@Override
	public SpaceShipWeapon getCurrentWeaponType() {
	
		return SpaceShipWeapon.AntimatterCannon;
	}

	public Boolean hasSpaceShipAHangar() {
		return true;
	}
	
}
