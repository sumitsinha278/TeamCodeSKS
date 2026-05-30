package Module2;

import java.util.Arrays;
import java.util.Scanner;

public class RuntimeArrayInput {
public static void main(String[]args)
{
Scanner s1=new Scanner(System.in);
System.out.println("Please enter the size of array");
int []rollno=new int[s1.nextInt()];
for (int i=0;i<=rollno.length-1;i++)
{
System.out.println("Please enter the value of indexing");
rollno[i]=s1.nextInt();
System.out.println("Your final array is "+Arrays.toString(rollno));
}
}
}
