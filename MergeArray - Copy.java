public class MergeArray  
{  
public static void main(String[] args)  
{  
int[] a1 = {1,2,3,4,5,6}; 
int[] a2 = {11,22,33,44,55,66};  
int length = a1.length + a2.length;   
int[] mergedArray = new int[length];      
int pos = 0;  
for (int element : a1) { 
mergedArray[pos] = element;  
pos++;              
}  
for (int element : a2)   
{  
mergedArray[pos] = element;  
pos++;  
}  
System.out.println(Arrays.toString(mergedArray));    
}  
}  