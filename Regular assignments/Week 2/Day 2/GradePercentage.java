import java.util.*;
class GradePercentage{
  public static void main (String args[]){
    double Phy,Chem,Maths,Bio,CS,Percentage;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the marks");
    Phy=sc.nextDouble();
    Chem=sc.nextDouble();
    Maths=sc.nextDouble();
    Bio=sc.nextDouble();
    CS=sc.nextDouble();
    Percentage=((Phy+Chem+Maths+Bio+CS)/500*100);
    System.out.println(Percentage);
    if (Percentage>=90)
    System.out.println("Kudos topper class #Grade A");
    else if (Percentage>=80)
    System.out.println("Grade B");
     else if (Percentage>=70)
    System.out.println("Grade C");
     else if (Percentage>=60)
    System.out.println("Grade D");
    else if (Percentage>=40)
      System.out.println("Grade E");
    else
      System.out.println("Grade F"); 
  }
}