package Module1;

public class PalindromeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//palindrome or not
		String s1="madam";
		String s2="";
		
		for(int i=s1.length()-1;i>=0 ;i--)
		{
			char c=s1.charAt(i);
			s2=s2+c;
		}
		if(s2.equals(s1))
		{
			System.out.println("ït is palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}
	
	}

}
