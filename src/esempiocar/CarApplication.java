package esempiocar;
public class CarApplication {

	public static void main(String[] args) {
				
		Car c = new Car();
		c.printState();
		
		Car d = new Car();
		d.printState();
		
		Car e = new Car("Blue", "Audi");
		e.printState();
		
		System.out.println("Colore di e: "+e.color);
		
		
	}

}
