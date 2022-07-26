import java.util.*;

public class Fibonacci

  {

    public static void main(String args[])

    {

        int a=0,b=1,c;

        System.out.print("Fibonacci Series: "+a+" "+b+" ");

        for(int i=0;i<13;i++)

        {

            c=a+b;

            a=b;

            b=c;

            System.out.print(c+" ");

        }

    }

}