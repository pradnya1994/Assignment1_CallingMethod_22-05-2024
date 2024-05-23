package Assignment1_MethodCalling;

public class Test {

	/*
	 * This is mainmethod from where we sarted the execution of our code.
	 * In this method we have called the sum mehtod of SumOfNumbers class and passed the values 
	    for variables a and b to do the calculation
	 * We have called this sum method by using class name because the method 
	    which we have taken in the SumOfNumbers class is static method.
	   So we can call static method by using class name .Otherwise we can call non static mehods 
	   by creating object.
	 */
	public static void main(String[] args) {
		
		System.out.println(SumOfNumbers.Sum(10, 20));

	}

}
