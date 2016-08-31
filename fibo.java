/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Fibonacci
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
System.out.println("Fibonacci Series:");
int f1=0,f2=1,f3=0,i=0;
System.out.println(f1);
System.out.println(f2);
while(i<=n)
{
f3=f1+f2;
f1=f2;
f2=f3;
System.out.println(f3);
i++;
}	
}
}
