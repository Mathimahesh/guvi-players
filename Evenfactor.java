import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i=2;i<=x;i++){
            if(i%2==0){
            if(x%i==0){
                System.out.print(i+" ");
            }
            }
        }
    }
}
