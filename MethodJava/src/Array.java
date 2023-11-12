
public class Array {

    public static void main(String[] args) {
        
        String[][] computer = {{"Dell","Vivo","Ancer"},{"Asus", "Gaming","Lelovo"}};
        for(int i=0; i<computer.length; ++i){
          for(int j = 0; j < computer[i].length; ++j){
              
              System.out.print(computer[i][j]+"\t");
          }
        }

    }
}
