public class MethodSession{
	public static void main(String[] args){
     addition();
     substraction();
     multiplication();

	}
	public static void addition(){
		int numberOne = 12;
		int numberTwo = 13;
		int addedNumbers = numberOne + numberTwo;
		System.out.println(addedNumbers);
		

	}
	public static void substraction(){
		int numberOne = 12;
		int numberTwo = 13;
		int substractionOfNumbers = numberOne - numberTwo;
		System.out.println(substractionOfNumbers);
	}
	public static void multiplication(){
		int numberOne = 12;
		int numberTwo = 3;
		int multiplicationOfNumbers = numberOne * numberTwo;
		System.out.println(multiplicationOfNumbers);
		display();
	}
	public static void display(){
		System.out.println("This is a invoking a method");
		division();
	}
	public static void division(){
		int numberOne = 12;
		int numberTwo = 3;
		int divisionOfTwoNumbers = numberOne / numberTwo;
		System.out.println(divisionOfTwoNumbers);
		percentage();
	}
	public static void percentage(){
		int value = 12;
		int totalValue = 3;
		int percentageOf = (value*100)/totalValue;
		System.out.println(percentageOf);
		orderSum();
	}
	public static void orderSum(){
		int orderOne = 112;
		int orderTwo = 11;
		int orderThree = 123;
		int orderFour = 115;
		int totalOrder = orderOne - orderTwo + orderThree + orderFour;
		System.out.println(totalOrder);
	}

}