import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner sc  = new Scanner(System.in);
      String s = sc.next();
      char ch = sc.next().charAt(0);
      int c = 0;
      for(int i=0;i<s.length();i++){
          if(s.charAt(i)==ch) c++;
      }
      System.out.println(c);
    }
}
