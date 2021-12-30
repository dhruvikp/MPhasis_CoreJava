
public class Pen {

	// Instance variables
	String body;
	String reffil;
	String name = "Nischinth";
	
	static String name1= "Dhruvik";
	
	// Methods or behaviors
	public void write() {
		
		//Local variable
		String name = "Nischinth";
		
		Pen pen = new Pen();
		System.out.println("Writting using pen..");
	}
	
	
	public static void main(String[] args) {
		// Create object using new keyword
		Pen pen1 = new Pen();
		
		System.out.println(pen1.name);
		// Execute method
		pen1.write();
		
		System.out.println(Pen.name1);
	}
}
