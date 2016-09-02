import java.lang.*;
import java.io.*;
import java.util.*;
class Unique{
public static void main(String args[]){
Scanner sc=new Scanner (System.in);
System.out.println("Enter the no. of elements");
int n=sc.nextInt();
int i=0,j=0;
System.out.println("Enter the elements");
int a[]=new int[n];
for(i=0;i<n;i++)
{
  a[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{
 for(j=i+1;i<n;i++)
  {
   if(a[i]==a[j])
   {
     a[j]=' ';
    }
  }
  }
  for(i=0;i<n;i++)
{
  System.out.println(a[i]);
}
  }
  }
