package my_Java_Oops;

class SampleAbstractClass implements SampleInterface{
//	abstract void sampleAbstractMethod();

	public void sampleInterfaceMethod() {
		System.out.println("I am form SampleInterface implemented in SampleAbstractClass and extended in MyInterface");
	}
}
public class MyInterface extends SampleAbstractClass{
	public static void main(String[] args) {
		MyInterface obj = new MyInterface();
		obj.sampleInterfaceMethod();
	}
	

	}

