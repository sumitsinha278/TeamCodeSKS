package Module3;

import java.util.ArrayList;

public class ArrayListAddFunction {
	public static void main(String[]args)
	{
ArrayList<Integer> a1=new ArrayList<Integer>();
ArrayList<Integer>a2=new ArrayList<Integer>();
a1.add(100);
a1.add(1, 65);
a1.addFirst(20);
a1.addLast(70);
a2.add(200);
a2.add(1, 55);
a2.addFirst(45);
a2.addLast(60);
a1.addAll(a2);
a1.addAll(2, a2);
System.out.println(a1);
System.out.println(a2);
a1.remove(2);
System.out.println(a1);
a1.remove(a2);
System.out.println(a1);
a1.removeAll(a2);
System.out.println(a1);
a1.removeFirst();
a1.removeLast();
System.out.println(a1);
System.out.println(a2);
System.out.println(a1.isEmpty());
}
}
