package nuc.zy;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	
	//¶þÉµÊÇ¸ö´ô¹Ï
//123321++++sss
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner sc = new Scanner(System.in) ;
//		int a = sc.nextInt() ;
//		int pow = (int)Math.pow(3, a) - (a-2)*3 ;
//		String string = Integer.toString(pow) ;
//		Integer.valueOf(string).intValue() ;
//		if (string.length()>=16) {
//			System.out.println("......"+Integer.parseInt(string.substring(10)));
//		} else {
//			System.out.println(pow);
//		}
		
		int[] a = new int[]{5,8,6,10,3} ;
		Arrays.sort(a);
		System.out.println(a[4]);
		
	}

}
