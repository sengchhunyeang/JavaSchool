
package ClassObj;

public class Constructor {
    int number;     //This Artribute
    int number2;    //This Artribute
    public Constructor(){
        number =2;  // This Is Construtor 
        number =4;  // This Is Construtor
        
    }
    public static void main(String[] args) {
        Constructor Con = new Constructor();
        System.out.println("This Value Contructor : \t" + Con.number);
    }
}
