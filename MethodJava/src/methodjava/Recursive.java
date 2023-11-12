
package methodjava;




public class Recursive {
        static  int recursion(int a){
        if (a!=0)
            return a + recursion(a-1);
        else
            return 1;
                    
    }
    public static void main(String[] args) {
        int n =1,result ;
        result = recursion(n);
        System.out.println("Value N \t"+n+"\nValue Result:\t"+result);
    }
}
