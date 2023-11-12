
package scannerjava;
import java.util.Scanner;
public class ScannerJava {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.print("Input String \t");
        String myString = myScanner.nextLine();
        System.out.println("=================");
        System.out.print("Input integer \t");
        int myIntger = myScanner.nextInt();
        System.out.println("=================");
        System.out.print("Input boolean \t");
        boolean myBoolean = myScanner.nextBoolean();
            System.out.println("=================");
            System.out.print("Input Byte \t");
            Byte btye = myScanner.nextByte();
            System.out.println("=================");
            System.out.print("Input Double \t");
            double salary = myScanner.nextDouble();
            System.out.println("=================");
            System.out.print("Input Float \t");
            float myFloat = myScanner.nextFloat();
            System.out.println("=================");
            System.out.print("Input Long \t");
            long myLong =myScanner.nextLong();
            System.out.println("=================");
            System.out.print("Input Short \t");
            short myShort = myScanner.nextShort();
        
        System.out.println("All Result User inputed:\n"+"MyString\t:"+myString+"\n"+"MyInteger\t:"+myIntger+"\n"+
               "MyBoolean\t:"+ myBoolean+"\n"+"MyBtye\t:"+btye+"\n"+"MyDouble\t:"+salary+"\n"+"MyFloat\t:"+myFloat+"\n"+"MyLong\t:"+myLong+"\n"+"MyShort\t:"+myShort+"");
    }
    
}
