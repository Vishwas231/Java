public class StringMethodExample {
	public static void main(String[] args) {
		//Concat
		System.out.println("Concatenate String");
		String firstName = "vishwas";
		String lastName =" R";
		String fullName = firstName.concat(lastName);
		System.out.println(fullName);

		//toUpper
		System.out.println("");
		System.out.println("String to Upper Case");
		String movieName = "xworkz";
		String nameUpper = movieName.toUpperCase();
		System.out.println(nameUpper);

		//toLower
		System.out.println("");
		System.out.println("String to Lower Case");
		String carName = "BENGALURU";
		String carNameLower = carName.toLowerCase();
		System.out.println(carNameLower);

		//isEmpty
		System.out.println("");
		System.out.println("String is Empty or not");
		String value = "Object";
		Boolean valueEmpty = value.isEmpty();
		System.out.println(valueEmpty);

		//split
		System.out.println("");
		System.out.println("Split String");
		String ownerName = "Who Are You";
		String[] nameSplit = ownerName.split(" ");
		System.out.println(nameSplit[0]);
		System.out.println(nameSplit[1]);
		System.out.println(nameSplit[2]);

		//Palindrome
		System.out.println("");
		System.out.println("Palindrome");
		String originalName = "gadag";
		String reversedName = "";
		char[] originalNameArray = originalName.toCharArray();
		for(int i = originalNameArray.length-1; i >= 0; i--) {
			reversedName = reversedName + originalNameArray[i];
		}
		if(originalName.equals(reversedName)) {
			System.out.println("Is a Palindrome");
		}
		else {
			System.out.println("Is not a Palindrome");
		}

		
}
}