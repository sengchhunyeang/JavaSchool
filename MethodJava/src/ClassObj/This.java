
package ClassObj;

public class This {
    int age;
    void setAge(int age){
      this.age=age;
  }
    int getAge(){
       return this.age;
    }
//    methos this()
  
    public static void main(String[] args) {
        This ages = new This();
        ages.setAge(34);
        
        System.out.println(""+ ages.getAge());
        System.out.println();
    }
}
