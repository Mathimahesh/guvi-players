import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        int count = 0,max = 0;
        char val = 0;
        for(int i=0;i<ch.length;i++){
            count = 0;
            for(int j=0;j<ch.length;j++){
                if(ch[i]==ch[j]){
                    count++;
                }
            }
            if(max<=count){
                max = count;
                val = ch[i];
            }
        }
        System.out.println(val);
    }
}
