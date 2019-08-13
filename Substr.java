import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner sc  = new Scanner(System.in);
      String s = sc.next();
      String pat = sc.next();
      int n = pat.length();
      int c = 0;
      for(int i=0;i<s.length()-n;i++){
          if(s.substring(i,i+n).equals(pat)){
              c++;
          }
      }
      if(c==1) System.out.println("yes");
      else System.out.println("no");
    }
}
