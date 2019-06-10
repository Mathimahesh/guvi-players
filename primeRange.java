import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int flag = 0,count = 0;
        for(int i=a;i<=b;i++){
            flag=0;
            for(int j =2;j<i;j++){
                if(i%j==0){
                    flag = 1;
                    break;
                }
            }
            if(flag!=1){
                count++;
                
            }
        }
        System.out.println(count);
    }
}
