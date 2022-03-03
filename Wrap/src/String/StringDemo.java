package String;

public class StringDemo
{
public static void main(String[] args)
{
String s="sparta";

s.replace('a', 'o');
s.concat("ns");
System.out.println(s.charAt(0));
String s2="SPARATA";



System.out.println(s.compareTo(s2));
System.out.println(s.equals(s2));
System.out.println(s.equalsIgnoreCase(s2));



System.out.println(s.indexOf('p'));
System.out.println(s.indexOf("art"));
System.out.println(s.length());
}
}