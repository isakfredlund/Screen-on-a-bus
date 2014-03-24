package model;

public class Line {
	String busNbr;
	String towards;
	public Line(String busNbr, String towards){
		this.busNbr = busNbr;
		this.towards = towards;
	}
	
	public String getTowards(){
		return this.towards;
	}
	public String getBusNbr(){
		return this.busNbr;
	}
}
