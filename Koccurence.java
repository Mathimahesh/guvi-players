import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
       long n = sc.nextLong();
        int x = sc.nextInt();
        int c = 0;
        while(n>0){
            long rem = n%10;
            n/=10;
            if(rem==x){
                c++;
            }
        }
        System.out.println(c);
    }
}
