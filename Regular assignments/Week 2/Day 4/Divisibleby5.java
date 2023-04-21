
//To print all integers from 1 to 100 
class DivBy5{
  public static void main(String args[]){  
    int i=0; 
    while(i<=100){ 
      if(i%5==0) 
        System.out.println(i);    
      i=i+1;    
    }    
    System.out.println("exit");
  }
}
