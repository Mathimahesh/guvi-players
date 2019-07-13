import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i=2;
        if(a==1 && b==1){
            System.out.println("1");
        }
        else{
        while(i%a!=0 || i%b!=0){
            i++;
        }
        System.out.println(i);
   }
    }
}
