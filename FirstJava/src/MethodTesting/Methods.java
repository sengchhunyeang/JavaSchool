
package MethodTesting;

import java.awt.BorderLayout;

public class Methods {
    
// 1   without parameter and returnType
    public static void hello(){
        System.out.println("Hello");
    }
// 2   with parameter without returnType
    public static void infor(String name , int age){
        System.out.println("Your Name: " + name+ "\n Your Age : "+age);   
    }
//  3  with parameter and has returnType 
    public static int sum(int a, int b){
        
        return a+b;
         
}
//  4  without parameter but has returnType
    public static String yeang(){
        String name = "chhunyeang";
        int age = 23;
        return 
               name+age;
    }
    
    
    public static void main(String[] args) {
        
        yeang();
        System.out.println(yeang());
    }
            
}
        