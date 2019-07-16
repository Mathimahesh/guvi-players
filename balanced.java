import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int a=0,b=0,c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='[') a++;
            if(s.charAt(i)==']') a--;
            if(s.charAt(i)=='{') b++;
            if(s.charAt(i)=='}') b--;
            if(s.charAt(i)=='(') c++;
            if(s.charAt(i)==')') c--;
        }
        if(a==0 && b==0 && c==0) System.out.println("yes");
            else System.out.println("no");
    }
}
