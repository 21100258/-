package d1;

import java.util.Scanner;

public class class3 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		double a, b, c;
		System.out.print("원기둥의 밑면 반지름은?");
		a=in.nextDouble();
		System.out.print("원기둥의 높이는?");
		b=in.nextDouble();
		c=a*b*3.14;
		System.out.print("원기둥의 부피는" +c);
	}

}
