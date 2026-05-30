package Module3;

import java.util.HashMap;

public class StudentDetails2 {
public static void main(String[]args)
{
HashMap <String,Double>student=new HashMap<String,Double>();
student.put("Sumit",99.6);
student.put("Kislay", 74.8);
student.put("Vishal", 98.4);
for(String name:student.keySet())
{
	System.out.println("Name of the candidate "+name+" and marks of the candidate "+student.get(name));
}
}
}
