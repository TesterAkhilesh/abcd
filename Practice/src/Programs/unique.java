package Programs;

import org.testng.annotations.Test;

public class unique {
	
public static void main(String[] args) {
	
		String s="akhilesh";
		char c;
		
		for(int i=0; i<=s.length()-1 ; i++)
		{
			c=s.charAt(i);
			int d = s.indexOf(c);
			int e = s.lastIndexOf(c);
			if(d==e)
			{
				System.out.print(c);
			}
			
				
		}
	}
	

}
