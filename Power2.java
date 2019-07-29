import java.util.*;
public class MyClass {
    public static boolean power(int n){
        if(n%2!=0) return false;
      else{
          for(int i=0;i<=n;i++){
              if(Math.pow(2,i)==n) return true;
          }
         return false;
      }
    }
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      if(power(n)) System.out.println("yes");
      else System.out.println("no");
      
      
    }
}
