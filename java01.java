package javaBasics;

public class java01 {
	
	public static void main(String[] args) {
		
		/*
		 
		    +	Addition	    Adds together two values	            x + y	
            -	Subtraction     Subtracts one value from another	    x - y	
            *	Multiplication	Multiplies two values	                x * y	
            /	Division	    Divides one value by another	        x / y	
            %	Modulus	        Returns the division remainder	        x % y	
            ++	Increment 	    Increases the value of a variable by 1	 ++x	
            --	Decrement	    Decreases the value of a variable by 1	 --x
            
		 */
		
		/*
		 
		   ==	Equal to	x == y	
           !=	Not equal	x != y	
           >	Greater than	x > y	
           <	Less than	x < y	
           >=	Greater than or equal to	x >= y	
           <=	Less than or equal to	x <= y
           
		 */
		
		/*
		  
		   =	x = 5	 x = 5	
           +=	x += 3	 x = x + 3	
           -=	x -= 3	 x = x - 3	
           *=	x *= 3	 x = x * 3	
           /=	x /= 3	 x = x / 3	
           %=	x %= 3	 x = x % 3	
           &=	x &= 3	 x = x & 3	 
           |=	x |= 3	 x = x | 3	
           ^=	x ^= 3	 x = x ^ 3	
           >>=	x >>= 3	 x = x >> 3	
           <<=	x <<= 3	 x = x << 3
           
		 */
		
		/*
		 
	  	\n	New Line	      String txt = "Hello\nWorld!";           Hello
                                                                      World!
		\r	Carriage Return   String txt = "Hello\rWorld!";           Hello
		                                                              World!	
		\t	Tab	              String txt = "Hello\tWorld!";           Hello    World!
		\b	Backspace	      String txt = "Hel\blo World!";          Helo World!
		\f	Form Feed
		
	    */	
	
	System.out.println("<--- Length --->\n");
	
		String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println("The length of the txt string is: " + txt.length());
		
	System.out.println("\n<--- Upper/Lower case --->\n");
	
		String txtt = "Hello World";
		System.out.println(txtt.toUpperCase());   // Outputs "HELLO WORLD"
		System.out.println(txtt.toLowerCase());   // Outputs "hello world"
		
	System.out.println("\n<--- İndexOF --->\n");
	
		String txt1 = "Please locate where 'locate' occurs!";
		System.out.println(txt1.indexOf("locate"));
		
		System.out.println("\n<--- Math --->\n");
		
		System.out.println(Math.max(5, 10)); 
		System.out.println(Math.min(5, 10));
		System.out.println(Math.sqrt(64));
		System.out.println(Math.abs(-4.7));
		System.out.println(Math.random());
		
		int randomNum = (int)(Math.random() * 101);  // 0 to 100
		System.out.println(randomNum);
		
	System.out.println("\n<--- Boolean --->\n");
	
		boolean isJavaFun = true;
		boolean isFishTasty = false;
		System.out.println(isJavaFun);     // Outputs true
		System.out.println(isFishTasty);   // Outputs false
		
		int x = 10;
		int y = 9;
		System.out.println(x > y); // returns true, because 10 is higher than 9
		System.out.println(10 > 9); // returns true, because 10 is higher than 9
		
		int z = 10;
		System.out.println(z == 10); // returns true, because the value of x is equal to 10
		System.out.println(10 == 15); // returns false, because 10 is not equal to 15
		
	System.out.println("\n<--- if/if else/else if --->\n");
	
		int myAge = 25;
		int votingAge = 18;

		if (myAge >= votingAge) {
		  System.out.println("Old enough to vote!");
		} else {
		  System.out.println("Not old enough to vote.");
		}
		
		int time = 22;
		if (time < 10) {
		  System.out.println("Good morning.");
		} else if (time < 18) {
		  System.out.println("Good day.");
		} else {
		  System.out.println("Good evening.");
		}
		// Outputs "Good evening."
		
	System.out.println("\n<--- Switch case-break --->\n");
	
		int day = 4;
		switch (day) {
		  case 1:
		    System.out.println("Monday");
		    break;
		  case 2:
		    System.out.println("Tuesday");
		    break;
		  case 3:
		    System.out.println("Wednesday");
		    break;
		  case 4:
		    System.out.println("Thursday");
		    break;
		  case 5:
		    System.out.println("Friday");
		    break;
		  case 6:
		    System.out.println("Saturday");
		    break;
		  case 7:
		    System.out.println("Sunday");
		    break;
		}
		// Outputs "Thursday" (day 4)
		
	System.out.println("\n<--- default --->\n");
		int dayOf = 4;
		switch (dayOf) {
		  case 6:
		    System.out.println("Today is Saturday");
		    break;
		  case 7:
		    System.out.println("Today is Sunday");
		    break;
		  default:
		    System.out.println("Looking forward to the Weekend!!");
		}
		// Outputs "Looking forward to the Weekend"
		
	/* 
	  System.out.println("\n<--- While loop --->\n");
	 
		int i = 0;
		while (i < 5) 
		{
			i++;
		  System.out.println(i);
		}
		*/
		
		
	System.out.println("\n<--- For --->\n");
		for (int j = 0; j < 5; j++) 
		{
		  System.out.println(j);
		}
		
	System.out.println("\n<--- For-each --->\n");
		
		String[] arabalar = {"Volvo", "BMW", "Ford", "Audi"};
		for (String  g : arabalar) {
			System.out.println(g);
		}
		
		

	}

}
