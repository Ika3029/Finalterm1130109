package StarWar_1111410026;

import java.util.Arrays;

public class AirCraft {
	
	@Override
	public String toString() {
		return "飛行器 [製造商=" + Manufacturer + ", 型號=" + Model + ", 長度(公尺)=" + Length + ", 大氣中飛行速度(公里/小時)="
				+ AirSpeed + ", 宇宙空間加速度=" + SpaceSpeed + ", 標準引擎資料=" + StdanderEngine + ", 超空間引擎="
				+ HyperSpaceEngine + ", 武器裝備名=" + Arrays.toString(Weapon) + ", 武器裝備能量=" + Weapon_power
				+ ", 乘坐人員=" + Passenger + ", 防護罩=" + Arrays.toString(Shield) + ", 防護罩能量值="
				+ Arrays.toString(ShiedPower) + "]";
	}
	
	private String Manufacturer;
	private String Model;
	private double Length;
	private double AirSpeed;
	private String SpaceSpeed;
	private String StdanderEngine;
	private String HyperSpaceEngine;
	private String[] Weapon;
	private double Weapon_power;
	private int Passenger;
	private String[] Shield;
	private double[] ShiedPower;
	
	public String getManufacturer() {
		return Manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		Manufacturer = manufacturer;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public double getLength() {
		return Length;
	}
	public void setLength(double length) {
		Length = length;
	}
	public double getAirSpeed() {
		return AirSpeed;
	}
	public void setAirSpeed(double airSpeed) {
		AirSpeed = airSpeed;
	}
	public String getSpaceSpeed() {
		return SpaceSpeed;
	}
	public void setSpaceSpeed(String spaceSpeed) {
		SpaceSpeed = spaceSpeed;
	}
	public String getStdanderEngine() {
		return StdanderEngine;
	}
	public void setStdanderEngine(String stdanderEngine) {
		StdanderEngine = stdanderEngine;
	}
	public String getHyperSpaceEngine() {
		return HyperSpaceEngine;
	}
	public void setHyperSpaceEngine(String hyperSpaceEngine) {
		HyperSpaceEngine = hyperSpaceEngine;
	}
	public String[] getWeapon() {
		return Weapon;
	}
	public void setWeapon(String[] weapon) {
		Weapon = weapon;
	}
	public double getWeapon_power() {
		return Weapon_power;
	}
	public void setWeapon_power(double weapon_power) {
		Weapon_power = weapon_power;
	}
	public int getPassenger() {
		return Passenger;
	}
	public void setPassenger(int passenger) {
		Passenger = passenger;
	}
	public String[] getShield() {
		return Shield;
	}
	public void setShield(String[] shield) {
		Shield = shield;
	}
	public double[] getShiedPower() {
		return ShiedPower;
	}
	public void setShiedPower(double[] shiedPower) {
		ShiedPower = shiedPower;
	}

	public AirCraft() {
		
	}
	public AirCraft(String Manufacturer,String Model,double Length,double AirSpeed,String SpaceSpeed,String StdanderEngine,String HyperSpaceEngine,String[] Weapon,double Weapon_power,int Passenger,String[] Shield,double[] ShiedPower) {
		
	}
	public AirCraft(String string, String string2, double d) {
		// TODO 自動產生的建構子 Stub
	}
	
}


