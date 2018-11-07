package vectors;

public class VectorApplication {

	public static void main(String[] args) {

		Vector v = new Vector();
		v.add(60);
		v.add(10);
		v.add(30);
		
		v.print();
		
		OrderedVector ov = new OrderedVector();
		ov.add(10);
		ov.add(20);
		ov.add(60);
		ov.add(0);
		//ov.add(400);
		
		ov.print();
		
	}

}
