import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int c = 0;
        for(int i=0;i<a.length();i++){
            int k = a.charAt(i);
             if(k>='a' && k<='z'){
                 c++;
             }
        }
        if(c==0) System.out.println("yes");
        else System.out.println("no");
        
    }
}
