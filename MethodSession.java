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
	}
}