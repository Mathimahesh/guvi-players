import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ans = "";
        for(int i=s.length()-1;i>=0;i--){
            ans+=s.charAt(i);
        }
        String val = ans.replaceAll("([aAeEiIoOuU])","");
        System.out.println(val);
       
    }
}
