package core.entities;

/*
 * Route type
 */
public class Route {
	
	private String routeCode;
	private String route;
	public String registrationDate;
	
	public Route(String routeCode, String route) {
		this.routeCode = routeCode;
		this.route = route;		
	}	
	
	public String getRouteCode(){
		return routeCode;
	}
	
	public void setRouteCode(String routeCode ){
		this.routeCode = routeCode;
	}
		
	
	public String getRoute(){
		return route;
	}
	
	public void setRoute(String route){
		this.route = route;
	}
		
	public String getRegistrationDate(){
		return registrationDate;
	}
	
	public void setRegistrationDate(String registrationDate){
		this.registrationDate = registrationDate;
	}
	

}
