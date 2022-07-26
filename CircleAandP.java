import java.io.*;
  
class  CircleAandP{
  
    static final double PI = Math.PI;
  
    static double Perimeter(double r) 
    { 
      return 2 * PI * r; 
    }
static double Area(double D)
    {
	return PI * D;
    }	
  
    public static void main(String[] args)
    {
 
        double r = 7.5;
	double D = 15 ;
        System.out.println("Perimeter of the circle is :"
                           + Perimeter(r));
	System.out.println("Area of the circle is :"
                           + Area(D));
    
    }
}
