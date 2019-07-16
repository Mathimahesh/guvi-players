import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;
        for(int i=a;i<=b;i++){
            int k =(int) Math.sqrt(i);
            if((k*k)==i){
                c++;
            }
        }
        System.out.println(c);
    }
}
