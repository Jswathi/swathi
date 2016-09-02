import java.lang.*;
import java.io.*;
import java.util.*;
class Reverse{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
Sytem.out.println("Enter the string");
String s1=sc.next();
StringBuffer s2=new StringBuffer(s1);
s2.reverse();
System.out.println(s2);
}
}
