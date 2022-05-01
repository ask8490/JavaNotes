package my_Java_Oops;
/* Method Overriding is also called as run time polymorphism
 * here method from parent class is rewritten in child class with same method mane and same signature
 * Signature of a method is type and sequence of arguments of that method
 * If any mistake in writing method overloading, compiler will not detect the error
 */
class SampleParentClass1{
	void sampleMethod(int a) {
		System.out.println("I am Parent class method with integer argument");
	}
}
public class MyMethodOverriding extends SampleParentClass1 {
	void sampleMethod(int a) {
		System.out.println("I am Child class method with integer argument");
	}
	public static void main(String[] args) {
		SampleParentClass1 objParent = new SampleParentClass1();
		objParent.sampleMethod(10);

	}

}
