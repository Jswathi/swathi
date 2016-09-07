import java.lang.*;
import java.io.*;
import java.util.*;
class WorkingDays{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
ArrayList<String> w=new ArrayList<String>();
for(int i=0;i<6;i++)
{
   w.add(sc.next());
}
System.out.println("Enter the day");
String s1=sc.next();
if(w.contains(s1))
{
   System.out.println(s1+"-"+"True");
}
else
{
   System.out.println(s1+"-"+"False");

 }
 }
 }
