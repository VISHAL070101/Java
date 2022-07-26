import java.util.*;
public class StringRev{

public static String rs1(String s){

char c[]=s.toCharArray();
String reverse="";

for(int i=c.length-1;i>=0;i--){
reverse+=c[i];
}
return reverse;
}
 
public static void main(String[] args) {
System.out.println( rs1("Hi Sir"));
System.out.println(rs1("Welcome   to Inmake"));
}
}