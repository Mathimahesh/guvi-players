import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        String ans = "";
        for(int i=n-1;i>=0;i--){
            ans+=s.charAt(i);
        }
        String val = ans.replaceAll("([aAeEiIoOuU])","");
        System.out.println(val);
       
    }
}
