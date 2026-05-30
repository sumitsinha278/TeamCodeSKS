
public class CountChars {
	 static int countOfAlpha = 0;
	  static int countOfNumeric = 0;
	  static int countOfSpace = 0;
	  static int countOfSpecial = 0;

	  public static void main(String[] args)
	  {
	    String input = "k v no 2 !@#";
	    char[] c1 = input.toCharArray();

	    for(int i = 0; i < input.length(); i++) 
	    {
	      if(Character.isAlphabetic(c1[i]))   countOfAlpha++;
	      else if(Character.isDigit(c1[i]))   countOfNumeric++;
	      else if(Character.isWhitespace(c1[i])) countOfSpace++;
	    }
	    countOfSpecial = input.length()
	                    - (countOfAlpha + countOfNumeric + countOfSpace);

	    System.out.println("Alphabets: " + countOfAlpha);   // 4
	    System.out.println("Numeric:   " + countOfNumeric); // 1
	    System.out.println("Spaces:    " + countOfSpace);   // 3
	    System.out.println("Special:   " + countOfSpecial); // 3
	  }
}
