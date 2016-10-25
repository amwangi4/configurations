package core.entities;


/*
 * Vehicle type
 */
public class Vehicle {
	
	private String vehicleID;
	private String ownerNationalID;
	private String passengerCapacity;
	private String vehicleNumberPlate;
	private String vehicleStatus;
	private String vehicleCreatedBy;
	private String vehicleRegistrationDate;
	private String vehicleLastUpdated;	
	
	
	public Vehicle(String vehicleID, String ownerNationalID, String passengerCapacity,
			String vehicleNumberPlate, String vehicleStatus) {
		
		this.vehicleID = vehicleID;
		this.ownerNationalID = ownerNationalID;
		this.passengerCapacity = passengerCapacity;
		this.vehicleNumberPlate = vehicleNumberPlate;
		this.vehicleStatus = vehicleStatus;
	}

	public String getVehicleId(){
		return vehicleID;
	}
	
	public void setVehicleId(String vehicleID ){
		this.vehicleID = vehicleID;
	}
	
	public String getOwnerNationalID(){
		return ownerNationalID;
	}
	
	public void setOwnerNationalID(String ownerNationalID ){
		this.ownerNationalID = ownerNationalID;
	}
		
	public String getPassengerCapacity(){
		return passengerCapacity;
	}
	
	public void setPassengerCapacity(String passengerCapacity){
		this.passengerCapacity = passengerCapacity;
	}
	
	public String getVehicleNumberPlate(){
		return vehicleNumberPlate;
	}
	
	public void setVehicleNumberPlate(String vehicleNumberPlate){
		this.vehicleNumberPlate = vehicleNumberPlate;
	}
		
	public String getVehicleStatus(){
		return vehicleStatus;
	}
	
	public void setVehicleStatus(String vehicleStatus){
		this.vehicleStatus = vehicleStatus;
	}
	
	public String getVehicleCreatedBy(){
		return vehicleCreatedBy;
	}
	
	public void setVehicleCreatedBy(String vehicleCreatedBy){
		this.vehicleCreatedBy = vehicleCreatedBy;
	}
	
	public String getVehicleCreationDate(){
		return vehicleRegistrationDate;
	}
	
	public void setVehicleRegistrationDate(String vehicleRegistrationDate){
		this.vehicleRegistrationDate = vehicleRegistrationDate;
	}
	
	public String getVehicleLastUpdated(){
		return vehicleLastUpdated;
	}
	
	public void setVehicleLastUpdated(String vehicleLastUpdated){
		this.vehicleLastUpdated = vehicleLastUpdated;
	}	

}
