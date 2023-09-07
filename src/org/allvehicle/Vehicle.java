package org.allvehicle;

import org.fourwheeler.FourWheeler;
import org.threewheeler.ThreeWheeler;
import org.twowheeler.TwoWheeler;

public class Vehicle {
	private void vehicleNecessary() {
	System.out.println("Vehicle Necessary :Vehicle Type");
	}
	public static void main(String[] args) {
		Vehicle usage = new Vehicle();
		usage.vehicleNecessary();
		
		TwoWheeler a = new TwoWheeler();
		a.bike();
		a.cycle();
		
		ThreeWheeler b = new ThreeWheeler();
		b.auto();
		b.Rikshaw();
		
		FourWheeler c = new FourWheeler();
		c.car();
		c.bus();
		c.lorry();
	}
	
}
