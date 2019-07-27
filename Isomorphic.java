import java.util.*;
public class Isomorphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		int c=0,c1=0;
		for(int i=0;i<s1.length()-1;i++){
			if(s1.charAt(i)==s1.charAt(i+1)){
				c++;
			}
		}
		for(int i=0;i<s2.length()-1;i++){
			if(s2.charAt(i)==s2.charAt(i+1)){
				c1++;
			}
		}
		if(c==c1) System.out.println("Ture");
		else System.out.println("False");
	}

}
