import java.util.Scanner;


public class InputValue {
    public static void main(String[] args) {
         Scanner myScr = new Scanner(System.in);
         int num1,num2;
        
         
        System.out.println("=======================");
        System.out.print("Please Input Number 1 : \t");
           
         num1 = myScr.nextInt();
        System.out.println("=======================");
        System.out.print("Please Input Number 2 : \t"); 
         num2 =myScr.nextInt();
        System.out.println("===========================");
      
        System.out.println("Result Value IS : \t"+(num1+num2));
        System.out.println("===========================");
    }
     
}
