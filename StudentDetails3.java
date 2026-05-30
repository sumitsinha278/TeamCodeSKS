package Module3;

import java.util.HashMap;

public class StudentDetails3 {
public static void main(String[]args)
{
HashMap<String,Character>stu=new HashMap<String,Character>();
stu.put("Roshan", 'R');
stu.put("Jaideep", 'J');
stu.put("Aarav", 'A');
for(String name:stu.keySet())
{
System.out.println("Name of the candidate is "+name+ " and the abbreviation assigned for his name is  "+stu.get(name));	
}
}
}
