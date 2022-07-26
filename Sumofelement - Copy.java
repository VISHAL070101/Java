class Sumofelement {
    static int arr[] = { 11, 22, 33, 44, 55};
  
    // method for sum of elements in an array
    static int sum()
    {
        int sum = 0; 
        int i;
  
        // using for loop add them to sum
        for (i = 0; i < arr.length; i++)
            sum += arr[i];
  
        return sum;
    }
  
    
    public static void main(String[] args)
    {
        System.out.println("Sum of given array is "
                           + sum());
    }
}
