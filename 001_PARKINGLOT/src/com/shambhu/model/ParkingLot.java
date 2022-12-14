package com.shambhu.model;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

	List<CompactSpot> compactSpotList = new ArrayList<>();

	List<LargeSpot> largerSpotsList = new ArrayList<>();

	List<BikeSpot> bikeSpotsList = new ArrayList<>();

	int freeCompactSpots;
	int freeLargeSpots;
	int freeBiketSpots;

	public ParkingLot(int freeCompactSpots, int freeLargeSpots, int freeBiketSpots) {
		this.freeCompactSpots = freeCompactSpots;
		this.freeLargeSpots = freeLargeSpots;
		this.freeBiketSpots = freeBiketSpots;
	}

	// parkvehicle

	public void parkVehicle(Vehicle vehicle) {
		System.out.println("We are about to park your Vehicle of type " + vehicle.getVehicleType());

		if (vehicle.getVehicleType().equals(VehicleType.TRUCK)) {

			if (freeLargeSpots > 0) {
				parkYourLargeVehicle();
			} else {
				System.out.println("Sorry all Large spots are FULL");
			}

		} else if (vehicle.getVehicleType().equals(VehicleType.CAR)) {

			if (freeCompactSpots > 0) {

				parkYourCompactVehicle();

			} else if (freeLargeSpots > 0) {

				parkYourCompactVehicle();
			} else {
				System.out.println("Sorry neither Large Or Compact spots Available");
			}

		} else if (vehicle.getVehicleType().equals(VehicleType.BIKE)) {

			if (freeBiketSpots > 0) {

				parkYourBikeVehicle();

			} else if (freeCompactSpots > 0) {

				parkYourCompactVehicle();
			} else if (freeLargeSpots > 0) {

				parkYourCompactVehicle();

			} else {
				System.out.println("Sorry neither Large Or Compact or Bike spots Available");
			}

		}
	}

	void parkYourLargeVehicle(Vehicle vehicle) {

		LargeSpot largeSpot = new LargeSpot(ParkingSpotType.LARGE);
		largeSpot.setFree(false);
		largeSpot.setVehicle(vehicle);
		vehicle.setParkingSpot(largeSpot);

		largeSpotsList.add(largeSpot);
		System.out.println("We have successfully parked your " + vehicle.getVehicleType() + "Vehicle.");
		freeLargeSpots--;

	}

	void parkYourCompactVehicle(Vehicle vehicle) {

		LargeSpot largeSpot = new LargeSpot(ParkingSpotType.COMAPCT);
		largeSpot.setFree(false);
		largeSpot.setVehicle(vehicle);
		vehicle.setParkingSpot(largeSpot);

		largeSpotsList.add(largeSpot);
		System.out.println("We have successfully parked your " + vehicle.getVehicleType() + "Vehicle.");
		freeCompactSpots--;

	}

	void parkYourBikeVehicle(Vehicle vehicle) {

		LargeSpot largeSpot = new LargeSpot(ParkingSpotType.BIKE);
		largeSpot.setFree(false);
		largeSpot.setVehicle(vehicle);
		vehicle.setParkingSpot(largeSpot);

		largeSpotsList.add(largeSpot);
		System.out.println("We have successfully parked your " + vehicle.getVehicleType() + "Vehicle.");
		freeBikeSpots--;

	}

	// UnParkVehicle
	
	public void unParkvehicle(Vehicle vehicle) {
		System.out.println("We are about to Unpark your Vehicle of type " + vehicle.getVehicleType());
		
		ParkingSpot parkingSpot = vehicle.getParkingSpot();
		
		parkingSpot.setFree(true);
		
		if (vehicle.getVehicleType().equals(VehicleType.TRUCK)) {
			if(largerSpotsList.remove(vehicle)) {
				System.out.println("We have successfully removed your vehicle");
				freeLargeSpots;
			}
			else {
				System.out.println("You donot have your vehicle parked ad this parking lot");
			}
		} else if (vehicle.getVehicleType().equals(VehicleType.CAR)) {
			if(compactSpotList.remove(vehicle)) {
				System.out.println("We have successfully removed your vehicle");
				freeCompactSpots;
			}
			else {
				System.out.println("You donot have your vehicle parked ad this parking lot");
			}
		}else if (vehicle.getVehicleType().equals(VehicleType.BIKE)) {
			if(largerSpotsList.remove(vehicle)) {
				System.out.println("We have successfully removed your vehicle");
				freeBiketSpots;
			}
			else {
				System.out.println("You donot have your vehicle parked ad this parking lot");
			}
		}
	}

}
