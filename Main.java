import java.util.Scanner;
/**
 * This program will check which out of the two integers is bigger
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates Scanner for user input
    Scanner input = new Scanner(System.in);
    
    // asks user for two integers and records them
    System.out.println("Please enter an integer:");
    int num1 = input.nextInt();
    System.out.println("Please enter another integer:");
    int num2 = input.nextInt();

    //checks to see which one is larger and tells the user
    if (num1 > num2){
      System.out.println("The biggest number is " + num1 + ".");
    }else if(num2 > num1){
      System.out.println("The biggest number is " + num2 + ".");
    }else{
      System.out.println("There is no biggest number.");
    }
  }
}
