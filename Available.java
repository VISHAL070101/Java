class Available{
  public static void main(String[] args) {

    int[] num = {12,23,34,45,56,67,89,78};
    int toFind = 56;
    boolean found = false;

for (int n:num){
      if (n == toFind) {
        found = true;
        break;
      }
    }

      
    if(found)
      System.out.println(toFind + " is found.");
    else
      System.out.println(toFind + " is not found.");


  }
}
    

       