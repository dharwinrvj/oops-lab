import java.util.*;
public class duplicateremove 
{

	public static void main(String[] args) 
	{
		String s=new String();
		int c=0,l=0;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter any string ");
		s=obj.next();
		char ch[]=s.toCharArray();
		System.out.println("original String is "+s);
		l=ch.length;
		for(int i=0;i<l;i++)
		{
			for(int j=i+1;j<l;j++) 
			{
				if(ch[i]==ch[j])
				{
					int t=j;
					for(int k=t;k<l-1;k++)
					{
					ch[k]=ch[k+1];
					}
					
					j--;
					l--;
				}
			}
			
		}
		String sr=new String(ch);
		sr=sr.substring(0,l);
		System.out.println("The Replaced string is "+sr);
	}

}
