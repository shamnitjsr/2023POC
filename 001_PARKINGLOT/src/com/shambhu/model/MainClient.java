/**
 * 
 */
package com.shambhu.model;

/**
 * @author shamb
 *
 */
public class MainClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ParkingLot parkingLot = new ParkingLot(2, 2, 2);
		
		Vehicle truck = new Vehicle(VehicleType.TRUCK);
		
		parkingLot.parkVehicle(truck);
		
		parkingLot.unParkvehicle(truck);

	}

}
