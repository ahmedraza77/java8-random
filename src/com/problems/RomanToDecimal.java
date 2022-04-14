package com.problems;

import java.util.Scanner;

public class RomanToDecimal {
	private static String romanNumeral;
	
	private static int romanToDecimal(String str) {

		int equivalentNumber = 0;
		
		for(int i=0; i<str.length(); i++) {
			
			int value1 = romanValue(str.charAt(i));
			
			 if (i + 1 < str.length()) 
	            {
	                int value2 = romanValue(str.charAt(i + 1));
	 
	                if (value1 >= value2) 
	                {
	                	equivalentNumber = equivalentNumber + value1;
	                }
	                else
	                {
	                	equivalentNumber = equivalentNumber + value2 - value1;
	                    i++;
	                }
	            }
	            else {
	            	equivalentNumber = equivalentNumber + value1;
	            }
		}
		return equivalentNumber;
	}
	
    static int romanValue(char r)
    {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return -1;
    }
	
	public static void main(String[] args) {
		  try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Enter a Roman number: ");
			  romanNumeral = scan.nextLine();
		}
          System.out.println(romanToDecimal(romanNumeral));
	}


}
