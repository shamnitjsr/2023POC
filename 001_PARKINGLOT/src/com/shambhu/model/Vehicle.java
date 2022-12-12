package com.shambhu.model;

public class Vehicle {

	private int vehicleNo;
	private VehicleType vehicleType;

	public Vehicle(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}

	private ParkingSpot parkingSpot;

	public int getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(int vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public VehicleType getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}

	public ParkingSpot getParkingSpot() {
		return parkingSpot;
	}

	public void setParkingSpot(ParkingSpot parkingSpot) {
		this.parkingSpot = parkingSpot;
	}

}
