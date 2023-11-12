import java.util.Scanner;
public class InputOpertor {
    
    public static void main(String[] args) {
         
     int number1,number2;
     
     String sub;
     String multi;
     String div;
     
     
    Scanner myScan = new Scanner(System.in);
        System.out.println("===================");
        System.out.print("Please Input Number 1 :\t");
      number1 = myScan.nextInt();
      System.out.print("Please Input Number 2 :\t");

      number2 = myScan.nextInt();
        System.out.println("====================");
       String add =myScan.nextLine();
        System.out.println(number1+number2);
   
    }
}
