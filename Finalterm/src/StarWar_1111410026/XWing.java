package StarWar_1111410026;

public class XWing {
	public class xWing extends AirCraft{
		
		
		static final String [] Weapon={
				"Taim & Bak KX9 雷射加農炮","Taim & Bak KX9 雷射加農炮",
				"Taim & Bak KX9 雷射加農炮","Taim & Bak KX9 雷射加農炮",
				"Krupx MG7 質子魚雷發射器", "Krupx MG7 質子魚雷發射器"
				};
		static final Double[] Weapon_power={1000.0,1000.0,1000.0,1000.0,5.0,5.0};
		
		public xWing() {
			
		}
		public xWing(String Manufacturer,String Model,double Length,double AirSpeed,String SpaceSpeed,String StdanderEngine,String HyperSpaceEngine,String[] Weapon,double Weapon_power,int Passenger,String[] Shield,double[] ShiedPower) {
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
		
	}
}
