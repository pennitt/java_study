package week02;

import java.util.Scanner;

public class _5432_쇠막대기자르기 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			String str = sc.nextLine();
			
			String[] arr = new String[str.length()];
			
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				
				System.out.println(ch);
				
			}
		}
		
	}

}
