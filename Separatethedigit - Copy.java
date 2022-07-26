import java.util.Scanner;  
public class Separatethedigit   
{  
public static void main(String[] args)  
{   
Scanner sc = new Scanner(System.in);  
System.out.print("Enter a number: ");  
int number=sc.nextInt();   
int digit1=number/100%10;  
int digit2=number/10%10;  
int digit3=number%10;  
//prints the digits  
System.out.println(digit1 + "," + digit2 + "," + digit3 + "," );  
}  
}  
