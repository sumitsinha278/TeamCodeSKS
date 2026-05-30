package Module3;

import java.util.HashMap;

public class StudentDetails {
public static void main(String[]args)
{
HashMap<Integer,String>student=new HashMap<Integer,String>();
student.put(101, "Sumit");
student.put(102, "Kislay");
student.put(103, "vishal");
//printing student details
for(Integer rollno:student.keySet())
{
System.out.println("roll no of student "+rollno+"Student name "+student.get(rollno));	
}

}
}
