import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] = new int[n];
        int br[] = new int[n];
        for(int i=0;i<n;i++){
            ar[i] = sc.nextInt();
        }
        Arrays.sort(ar);
        int c = 0;
        for(int i=0;i<ar.length;i++){
            c=0;
            for(int j=0;j<ar.length;j++){
                if(ar[i]==ar[j]){
                     c = c+1; 
                }
            }
            br[i] = c;
        }
        for(int i=0;i<n;i++){
            if(br[i]==1){
                 System.out.println(ar[i]);
            }
        }
       
    }
}
