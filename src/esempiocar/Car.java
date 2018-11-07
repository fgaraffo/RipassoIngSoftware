package esempiocar;

public class Car {

	String color;
	String brand;
	boolean turnedOn;
	
	public Car () 
	
	{
		color = "Red";
		brand = "FIAT";
		turnedOn = false;
		
	}
	//OVERLOADING
	public Car (String myColor, String myBrand) {
		
		color = myColor;
		brand = myBrand;
		
		
	}
	
	
	
	
	public void printState () {
		
		System.out.println(""+color+" "+brand+" "+turnedOn);
		
	}
	
	
	
}
