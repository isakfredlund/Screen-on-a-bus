package model;

public class Station {
	private String stationNbr;
	private String stationName;

	public Station(String stationName,String stationNbr) {
		this.stationName = stationName;
		this.stationNbr=stationNbr;
	}
	
	String getStationName(){
		return stationName;
	}
	String getStationNbr(){
		return stationNbr;
	}
	
}
