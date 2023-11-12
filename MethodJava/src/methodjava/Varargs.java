
package methodjava;

public class Varargs {
    
    
   public static void testingArgs(String ...myString){
       for(String s:myString)
       System.out.println(s);

    }
   //parameter varrags 
   
    public static void main(String[] args) {
        testingArgs("Hello","Hello2","Hello3","Hello4");
        
    }
}
