import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;
class AgeCalculator{
  public static void main(String args[]) {
    System.out.println("Enter the date of birth");
    Scanner sc=new Scanner(System.in);
    String birth_date;
    birth_date=sc.next();
    LocalDate today =LocalDate.now();
    System.out.println(today);
    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    LocalDate dateOfBirth = LocalDate.parse(birth_date, dateFormat);
    Period age=Period.between(dateOfBirth, today);
    System.out.println(age.getYears());
    if(age.getYears()>=18){
      System.out.println("Adult");
    }
    else{
      System.out.println("minor");
    }
  }
}

