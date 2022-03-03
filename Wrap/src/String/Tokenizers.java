package String;

import java.util.StringTokenizer;

public class Tokenizers 
{
	public static void main(String[] args)
	{
		String fruitsList="Apple,Orange,Banana,Grapes,Guava,Dragon";
		
		StringTokenizer stz=new StringTokenizer(fruitsList,",");
		
		while(stz.hasMoreTokens())
		{
			System.out.println(stz.nextToken());
		}
	}

}
