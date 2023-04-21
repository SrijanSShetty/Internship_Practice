import java.util.*;
class EvenOdd {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int num;
    System.out.println("Enter the number");
    num=sc.nextInt();
    if(num%2==0)
    System.out.println("Entered number is even")
      else
      System.out.println("Entered number is odd")
  }
}
