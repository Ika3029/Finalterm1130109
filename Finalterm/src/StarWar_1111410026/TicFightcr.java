package StarWar_1111410026;

import java.util.Arrays;

public class TicFightcr {

	public class ticFightcr extends AirCraft{
           public ticFightcr() {
			
		}
           public ticFightcr(String Manufacturer,String Model,double Length,double AirSpeed,String SpaceSpeed,String StdanderEngine,String HyperSpaceEngine,String []Weapon,double Weapon_power,int Passenger,String[] Shield,double[] ShiedPower) {
       		this.setManufacturer(Manufacturer);
       		this.setModel(Model);
       		this.setLength(Length);
       		this.setAirSpeed(AirSpeed);
       		this.setSpaceSpeed(SpaceSpeed);
       		this.setStdanderEngine(StdanderEngine);
       		this.setHyperSpaceEngine(HyperSpaceEngine);
       		this.setWeapon(Weapon);
       		this.setWeapon_power(Weapon_power);
       		this.setPassenger(Passenger);
       		this.setShield(Shield);
       		this.setShiedPower(ShiedPower);
       		
       	}
           static final String []Weapon={"SFS L-s1 型雷射加農炮","SFS L-s1 型雷射加農炮"};
           static final Double[]Weapon_power={1000.0,1000.0};
	}
}