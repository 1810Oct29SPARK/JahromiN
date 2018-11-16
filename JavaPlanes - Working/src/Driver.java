public class Driver {

	public static void main(String[] args) {
		
		System.out.println("this is the point of entry into my program");
		
		//make a Plane object with no set fields
		//declare the variable PlaneOne and assign a new Plane to it
		Plane PlaneOne = new Plane();
		//toString is a method inherited from Object
		System.out.println("PlaneOne: "+PlaneOne.toString());
		
		//make a Plane object with instance variables set in the constructor
		//declare the variable PlaneTwo and assign an new Plane to it
		Plane PlaneTwo = new Plane(2015,"SkyHawk","Cessna");
		//check out the toString result
		System.out.println("PlaneTwo: "+PlaneTwo.toString());

		//try to view the instance variables of Plane 2
		System.out.println("model of PlaneTwo: "+PlaneTwo.getModel());

		//reset the model of PlaneTwo
		PlaneTwo.setModel("A380");
		System.out.println("model of PlaneTwo: "+PlaneTwo.getModel());
		
		//reset the model of PlaneTwo
		PlaneTwo.setModel("Leerjet");
		System.out.println("model of PlaneTwo: "+PlaneTwo.getModel());
		
		//reset the model of PlaneTwo
		PlaneTwo.setModel("B52H");
		System.out.println("model of PlaneTwo: "+PlaneTwo.getModel());
		
		//reset the model of PlaneTwo
		PlaneTwo.setModel("F-22");
		System.out.println("model of PlaneTwo: "+PlaneTwo.getModel());

		//test out PlaneTwo's inherited move() meoth
		PlaneTwo.move();
	}

}
