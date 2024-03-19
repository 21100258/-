package d1;

import java.util.Scanner;

public class class8 {

	public static void main(String[] args) {
		
		Scanner in =new Scanner(System.in);
        System.out.print("화씨(F):");
        double F=in.nextInt();
        System.out.printf("섭씨(C):%.1f",((5*(F-32))/9));

	}

}
