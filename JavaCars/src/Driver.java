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
		Plane PlaneTwo = new Plane(1972,"DeLorean","DMC");
		//check out the toString result
		System.out.println("PlaneTwo: "+PlaneTwo.toString());

		//try to view the instance variables of Plane 2
		//this does NOT compile   System.our.println(
		System.out.println("model of PlaneTwo: "+PlaneTwo.getModel());

		//reset the model of PlaneTwo
		PlaneTwo.setModel("NotDeLorean");
		System.out.println("model of PlaneTwo: "+PlaneTwo.getModel());

		//test out PlaneTwo's inherited move() meoth
		PlaneTwo.move();
	}

}
