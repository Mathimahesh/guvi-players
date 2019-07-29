import java.util.*;
public class MyClass {
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     int s = sc.nextInt();
     int n = sc.nextInt();
     int c = 0;
     for(int i=1;i<=100;i++){
          if(Math.pow(n,i)==s)
             c++;
         }
         if(c==1)System.out.println("yes");
         else{
             System.out.println("no");
         }
    }
}
