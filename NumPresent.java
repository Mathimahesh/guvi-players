import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int c= 0;
        for(int i=0;i<a.length;i++){
            if(a[i]==x) c++;
        }
        if(c==1) System.out.println("Yes");
        else System.out.println("No");
    }
}
