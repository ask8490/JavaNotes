package my_Java_Oops;
/*Inheritance is use to pass the properties of parent class to its child class. 
 * This is done by using 'extends' keyword.
 * parent class elements can be directly accessible with super keyword.
 * however without super keyword also elements can be accessed by creating objects.
 
 */
class SampleParentClassForInheritance{
	String sampleClassInstVar= "I am Parent class Instance variable";
	static String sampleClassStatVar= "I am Parent class static variable";
	private static String sampleClassPrivateStatVar= "I am Parent class private static variable";
	
	void sampleParentMethod(){
		
	}
}

public class MyInheritance extends SampleParentClassForInheritance {

	public static void main(String[] args) {
		System.out.println(sampleClassStatVar);
		
		SampleParentClassForInheritance parentObj = new SampleParentClassForInheritance();
		System.out.println(parentObj.sampleClassInstVar);
		
//		System.out.println(sampleClassPrivateStatVar);  //can not access parent class private elements need getter method

	}

}
