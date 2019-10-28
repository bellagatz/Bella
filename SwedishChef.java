
public class SwedishChef {
	
	public static void main(String[] arg) {
		//System.out.println(translator("the anteater ate it"));
		String phrase = "I go wow";
		System.out.println(phrase.indexOf(" "));
		System.out.println(phrase.indexOf(" "));
	}
	
	public static String translator(String english) {
		//System.out.print(english + "Bork Bork Bork!");
		String input = english.toLowerCase();
		
		int first = input.indexOf(" ");
		char firstLastLetter = input.charAt(first);
		String firstWord = input.substring(0, first);
		
		int second = input.substring(first).indexOf(" ");
		String secondWord = input.substring(first + 1, second);
		
		int third = input.substring(second).indexOf(" ");
		String thirdWord = input.substring(second + 1, third);
		
		int forth = input.substring(third).indexOf(" ");
		String forthWord = input.substring(third + 1);
		
		String output = input.replace("the", "zee");
		output = output.replace("an", "un");
		output = output.replace("au", "oo");
		output = output.replace("a", "e"); //fix
	/*	if (firstLastLetter != a) {
			output = output.replace("a", "e");
		} else {
			
		} */
		output = output.replace("ow", "oo");
		output = output.replace("o", "o");
		output = output.replace("ir", "ur");
		output = output.replace("tion", "shun");
		
		output = output.replace("i", "ee"); // check: not beginning
		output = output.replace("en", "ee"); // check: end of word
		output = output.replace("f", "ff");
		output = output.replace("e", "e-a"); //fix
		output = output.replace("u", "oo"); // fix: not start
		output = output.replace("v", "f");
		output = output.replace("w", "v");
		output = output + " Bork! Bork! Bork!"; 
		return output;
	}
}
