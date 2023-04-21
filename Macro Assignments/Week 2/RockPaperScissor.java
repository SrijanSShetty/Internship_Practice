import java.util.Scanner;
class RockPaperScissor {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Select one option for you from Rock, paper, Scissors ");
    String userChoice;
    String systemChoice;
    System.out.println("Enter user choice");
    userChoice=sc.next();
    System.out.println("Enter system choice");
    systemChoice=sc.next();
    if(userChoice.equals("System Choice")){
      System.out.println("Tie");
    }
    else if((computerChoice.equals("Paper"))&&(userChoice.equals("Rock"))||(computerChoice.equals("Scissor"))&&(userChoice.equals("Paper"))||(computerChoice.equals("Rock"))&&(userChoice.equals("Scissor"))){
      System.out.println("System wins");
    }
        else if((userChoice.equals("Paper"))&&(computerChoice.equals("Rock"))||(userChoice.equals("Scissor"))&&(computerChoice.equals("Paper"))||(userChoice.equals("Rock"))&&(computerChoice.equals("Scissor"))){
          System.out.println("You win");
          else
            System.out.println("Sorry enter valid inputs");
          }
}

// import java.util.Scanner;
// class RockPaper{
//   public static void main(String args[]){
//     Scanner sc=new Scanner(System.in);
//     System.out.println("Select options Rock Paper Scissor: ");
//     String userChoice;
//     String computerChoice;
//     System.out.println("Enter user choice: ");
//     userChoice=sc.next();
//     System.out.println("Enter computer choice");
//     computerChoice=sc.next();
//     if(userChoice.equals("computerChoice")){
//       System.out.println("Tie");
      
//     }
//     else if((userChoice.equals("Paper"))&&(computerChoice.equals("Rock"))||(userChoice.equals("Scissor"))&&(computerChoice.equals("Paper"))||(userChoice.equals("Rock"))&&(computerChoice.equals("Scissor"))){
//       System.out.println("user wins");
//     }
//     else if((computerChoice.equals("Paper"))&&(userChoice.equals("Rock"))||(computerChoice.equals("Scissor"))&&(userChoice.equals("Paper"))||(computerChoice.equals("Rock"))&&(userChoice.equals("Scissor"))){
//       System.out.println("computer wins");
//     }
//     else{
//       System.out.println("invalid input!!");
//     }
//   }
// }