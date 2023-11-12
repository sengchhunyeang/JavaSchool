
package ClassObj;


public class ConstructorParameter {
String myName;
int age ;
public ConstructorParameter(String fname, int ages){
    myName = fname;
    age = ages;
}
    public static void main(String[] args) {
        ConstructorParameter student = new ConstructorParameter("Yeang",22);
        
        System.out.println("Student info : \t "+ student.myName+"\n Student Age : \t" +student.age );
    }
    
}
