import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String val = "";
        for(int i=0;i<s.length();i++){
            if(i%3==0){
                val +=s.charAt(i);
            }
        }
        System.out.println(val);
    }
}
