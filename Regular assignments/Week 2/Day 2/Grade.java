import java.util.Scanner;
class Grade {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter grade 1");
    int g1 = sc.nextInt();
    System.out.println("Enter grade 2");
    int g2 = sc.nextInt();
    System.out.println("Enter grade 3");
    int g3 = sc.nextInt();
    float avg= (g1+g2+g3)/3;
    System.out.println("Grade 1: " + g1);
    System.out.println("Grade 2: " + g2);
    System.out.println("Grade 3: " + g3);
    System.out.println("Average grade: " + avg);
    

  }
}
