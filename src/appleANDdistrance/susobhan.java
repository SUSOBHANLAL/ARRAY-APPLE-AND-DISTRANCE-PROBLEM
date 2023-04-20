package appleANDdistrance;
import java.util.*;
public class susobhan {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt();
		int t = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		
		int apple [] = new int[m];
		for(int i =0;i<m;i++) {
			apple[i] = sc.nextInt(); //-2 2 1
		}
		
		int orange [] = new int [n];
		for(int j =0;j<n;j++) {
			orange[j] = sc.nextInt(); //5 -6
		}
		

		
		int apple1 [] = new int[m];
		for(int i =0;i<m;i++) {
			apple1[i] = a+apple[i];
			
		}
		
		int orange1 [] = new int [n];
		for(int j =0;j<n;j++) {
			orange1[j]= b+orange[j];
		}
		
		int counta =0;
		for(int i =0;i<m;i++) {
			if(apple1[i]>=s && apple1[i]<=t) {
				counta++;
			}
		}
		
		int counto=0;
		for(int j =0;j<n;j++) {
			if(orange1[j]>=s && orange1[j]<=t) {
				counto++;
			}
		}
	
		System.out.println(counta);
		System.out.println(counto);
		
		
		
		
	}

}
