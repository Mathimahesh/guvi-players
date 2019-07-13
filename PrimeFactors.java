import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        ArrayList list = new ArrayList();
        for(int i=2;i<=a;i++){
            if(a%i==0){
                list.add(i);
                a/=i;
            }
        }
        System.out.println(list.toString().replace("[","").replace("]","").replace(",",""));
    }
}
