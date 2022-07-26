//Coding challenges 1.0
// 1 program

class Primenumber{    
 public static void main(String args[]){    
  int i,m=0,a=0;      
  int n=17;  
  m=n/2;      
  if(n==0||n==1){  
   System.out.println(n+" is not prime number");      
  }else{  
   for(i=2;i<=m;i++){      
    if(n%i==0){      
     System.out.println(n+" is not prime number");      
     a=1;      
     break;      
    }      
   }      
   if(a==0)  { System.out.println(n+" is prime number"); }  
  }  
}    
}   
