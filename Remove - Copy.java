import java.util.Arrays; 
public class Remove {
 
public static void main(String[] args) {
   int[] my_array = {11,22,33,34,43,32,23};
   
   System.out.println("Original Array : "+Arrays.toString(my_array));     
   
  
  int removeIndex = 0;

   for(int i = removeIndex; i < my_array.length -1; i++){
        my_array[i] = my_array[i + 1];
      }
    System.out.println("After removing the  element: "+Arrays.toString(my_array));
 }
 }
