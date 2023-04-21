import java.util.Scanner;
class DeductedSalary {
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    double salary,anual_salary,tax=0,net_salary;
    System.out.println("Enter your Salary");
    DSalary=sc.nextFloat();
    anual_salary=salary*12;
    System.out.println("Your annual salary : "+anual_salary);
    if (anual_salary<300000){
      System.out.println("Congratulations there is no tax for you");
    }
    else if(anual_salary>=300000 && anual_salary<600000){
      System.out.println("You contribute 5% of income to nation");
      tax=anual_salary*0.05;
    }
    else if(anual_salary>=600000 && anual_salary<900000){
      System.out.println("You pay 10% of income to others ");
      tax=anual_salary*0.10;
    }
    else if(anual_salary>=900000 && anual_salary<1200000){
      System.out.println("You lend 15% of your income to society");
      tax=anual_salary*0.15;
    }
    else if(anual_salary>=1200000 && anual_salary<1500000){
      System.out.println("You have to pay 20% of income");
      tax=anual_salary*0.20;
    }
    else {
      System.out.println("You donate 30% of your income to your country");
      tax=anual_salary*0.30;
    }
    System.out.println("Your tax is :"+tax);
    net_salary=anual_salary_tax;
    System.out.println("Your net Salary : "+net_salary);
  }}