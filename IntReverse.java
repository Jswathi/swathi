import java.lang.*;
import java.io.*;
import java.util.*;
class IntReverse{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the digit");
int n=sc.nextInt();
int r=0,rev=0;
while(n!=0)
{
 r=n%10;
 n=n/10;
 rev=rev*10+r;
}
System.out.println(rev);
}
}
