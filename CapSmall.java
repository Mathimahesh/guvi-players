import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String val = "";
        for(int i=0;i<s.length();i++){
            int ascii = (int)s.charAt(i);
            if(ascii>=65 && ascii<=90){
                ascii+=32;
                val+=(char)ascii;
            }
            else{
                ascii-=32;
                val+=(char)ascii;
            }
        }
        System.out.println(val);
        
    }
}
