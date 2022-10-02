package javaMethods;

public class StringMethod {
public static void main(String[] args) {
	StringBuffer sb=new StringBuffer("hi omkar");
	sb.append(" sathe");
	sb.append(25);
	//sb.append(abc);
	System.out.println(sb);
	
	sb.reverse();
	System.out.println(sb);
	
	sb.delete(2, 5);
	System.out.println(sb);
	
	sb.insert(10, "OMKAR");
	System.out.println(sb);
	
	sb.replace(5,5,"new string");
	System.out.println(sb);
	
	System.out.println(sb.length());
	System.out.println(sb.charAt(5));
	
}
}
