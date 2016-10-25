package core.entities;

public class Tablet {
	
	private String serialNumber;
	private String macAddress;
	public String registrationDate;
	
	
	public Tablet(String serialNumber, String macAddress) {
		this.serialNumber = serialNumber;
		this.macAddress = macAddress;		
	}

	public String getSerialNumber(){
		return serialNumber;
	}
	
	public void setRouteCode(String serialNumber ){
		this.serialNumber = serialNumber;
	}
	
	public String getMacAddress(){
		return macAddress;
	}
	
	public void setMacAddress(String macAddress){
		this.macAddress = macAddress;
	}
	
	public String getRegistrationDate(){
		return registrationDate;
	}
	
	public void setRegistrationDate(String registrationDate){
		this.registrationDate = registrationDate;
	}
}
