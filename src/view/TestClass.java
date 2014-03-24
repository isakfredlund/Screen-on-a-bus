package view;
import model.Line;
import xmlparser.Xmlparse;

public class TestClass {
	// ändring...
	private Line linje;
	private static Xmlparse parser;
	private static String url = "http://www.labs.skanetrafiken.se/v2.2/stationresults.asp?selPointFrKey=80003";
	public static void main(String[] args) {
		parser = new Xmlparse(url);
		parser.yolo();
		// swag
	}

}
