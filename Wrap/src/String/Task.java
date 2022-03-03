package String;

public class Task
{

int task1(String input)
{
	int count=0;
	      
	
	 char ch[]=input.toCharArray();
     for(char c : ch)
     {
         if(Character.isDigit(c))
         {
        	 count++;
         }
        
     }
    
 return count;   
 }

public static void main(String[]args)
{
	System.out.println(new Task().task1("ABC1236"));
}
}