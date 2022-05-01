package my_Java_Oops;
/* Method overloading is also called compile time polymorphism
 * here a method is re written in the same class with different signature(i.e signature includes type and sequence of arguments of a method)
 *  we can not overload just by changing return type
 *  
 */
 
public class MyMethodOverloading {
	void originalMethod() { 	//method with zero arguments
		 System.out.println("I am Original method");
	 }
	void originalMethod(int a) {
		System.out.println("I am Overloaded method with integer argument");
	}
	void originalMethod(char a) {
		System.out.println("I am Overloaded method with char argument");
	}
	void originalMethod(int a, char b) {
		System.out.println("I am Overloaded method with integer and char argument");
	}
	void originalMethod(char b,int a) {
		System.out.println("I am Overloaded method with char and integer argument");
	}
	public static void main(String[] args) {
		MyMethodOverloading obj = new MyMethodOverloading();
		obj.originalMethod();
		obj.originalMethod(10);
		obj.originalMethod('d');
		obj.originalMethod(15,'k');
		obj.originalMethod('u',45);

	}

}
