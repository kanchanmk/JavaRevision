package com.javapractice;

public class assessment1 {

//	public static void main(String[] args) {
//		
//		
//		System.out.println(" average Grades : " + averageGrades(60, 70, 50));
//		
//		System.out.println(" howmanypass 40, 50:" + howManyPass(40, 50));
//		System.out.println(" howmanypass 70, 60 :" + howManyPass(70, 60));
//		System.out.println(" howmanypass 65 , 66:" + howManyPass(65, 66));
//		System.out.println(" howmanypass 72, 71:" + howManyPass(72, 71));
//		
//		
////		String and Methods Lab
//		
//		System.out.println("testing capitalize : " + capitalize("bLaze"));
//		System.out.println("testing wheresWaldo : " + wheresWaldo("Striped Waldo!"));
//		System.out.println("testing firstThingsFirst : " + firstThingsFirst("cat", "dog"));
//		System.out.println("testing firstThingsFirst : " + firstThingsFirst("tree", "pine"));
//		
//		System.out.println("testing reverse : " + reverse("test 123"));
//		
//		System.out.println("testing soLong : " + soLong("tree", "pea"));
//
//		System.out.println("testing soLong : " + soLong("tree", "pine"));
//
//		System.out.println("testing afterMath : " + afterMath("She aced the mathematics test!"));
//		System.out.println("testing afterMath : " + afterMath("My floor mat is so keen!"));
//
//		letterize("Java");
//		System.out.println("testing camelCase : " + camelCase("desert survival skills"));
//	
//	}
	// String and Methods lab
	public static String capitalize(String word) {
		
		return word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
		
	}
	
	public static int wheresWaldo(String phrase) {
		return phrase.indexOf("Waldo");
	}
	
	public static String firstThingsFirst(String a, String b) {
		return a.compareTo(b) > 0 ? (b +" " + a) : (a+" " + b);
	}
	
	public static String reverse ( String s) {
		
		StringBuilder s1 = new StringBuilder();
		s1.append(s);
		s1.reverse();
		return s1.toString();
		
	}
	
	public static String soLong(String a, String b) {
		if (a.length() == b.length()) {
			return a + " " + b;
		}else if (a.length() > b.length()) {
			return a;
		}else {
			return b;
		}
		
	}
	
	public static String afterMath(String phrase) {
		int mathIndex = phrase.indexOf("math");
		if(mathIndex != -1) {
			return phrase.substring(mathIndex);
		}
		else 
			return "dud";
	}
	
	public static void letterize(String word) {
		
		for(int i= 0; i< word.length(); i ++) {
			System.out.println(word.charAt(i));
		}
	}
	
	public static String camelCase(String phrase) {
		String[] strArr = phrase.split(" ");
		String result = strArr[0].toLowerCase();
		for(int i = 1; i< strArr.length; i++) {
			result+=capitalize(strArr[i]);
		}
		return result;
	}
	
	
	
	// assessment 1
	public static boolean isPassing(double grade) {
		if(grade > 65) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public static double averageGrades(double gr1, double gr2, double gr3) {
		return (gr1 + gr2 + gr3)/3;
	}

	public static String howManyPass(double gr1, double gr2) {
		if(isPassing(gr1) && isPassing(gr2)) {
			return "both";
		}else if(isPassing(gr1) || isPassing(gr2)) {
			return "one";
			
		}else {
			return "none";
		}
		
	}
}
