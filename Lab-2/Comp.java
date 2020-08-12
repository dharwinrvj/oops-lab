
import java.util.*;
public class Comp 
{

	public static void main(String[] args) 
	{   int a1,b1,a2,b2;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 1st real part ");
	    a1=s.nextInt();
		System.out.println("Enter 1st imaginary part");
	    b1=s.nextInt();
	    System.out.println("Enter 2nd real part ");
	    a2=s.nextInt();
		System.out.println("Enter 2nd imaginary part");
	    b2=s.nextInt();
	    
		complex ob1=new complex(a1,b1);
		complex ob2=new complex(a2,b2);
		complex ans=new complex();
		
		System.out.println("addition of two complex no. is");
		ans=ob1.add(ob2);
		System.out.println(ans.real+"+"+ans.imag+"i");
		
		System.out.println("subtraction of two complex no. is");
		ans=ob1.sub(ob2);
		System.out.println(ans.real+"+"+ans.imag+"i");
		
		System.out.println("multiplication of two complex no. is");
		ans=ob1.mult(ob2);
		System.out.println(ans.real+"+"+ans.imag+"i");
		
		System.out.println("division of two complex no. is");
		ans=ob1.div(ob2);
		System.out.println(ans.real+"+"+ans.imag+"i");
		s.close();
	}

}

class complex
{    
	 int real,imag;
	 complex() 
	 {
		
	 }
	complex(int r,int i)
	{
	real=r;
	imag=i;
	}
		  
	complex add(complex t)
	{
	complex temp=new complex();
	temp.real=real+t.real;
	temp.imag=imag+t.imag;
	return temp;
	}
	complex sub(complex t)
	{
		complex temp=new complex();
		temp.real=real-t.real;
		temp.imag=imag-t.imag;
		return temp;		
	}
	complex mult(complex t)
	{
	complex temp=new complex();
	temp.real=(real*t.real)+(imag*t.imag);
	temp.imag=(real*t.imag)+(imag*t.real);
	return temp;
	}
	complex div(complex t)
	{
	int f;
	complex temp=new complex();
    f=(t.real*t.real+t.imag*t.imag);
	temp.real=(real*t.real+imag*t.imag)/f;
	temp.imag=(t.real*imag-real*t.imag)/f;
	return temp;	
	}
}
