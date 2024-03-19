package d1;

import java.util.Scanner;

public class class6 {

	public static void main(String[] args) {

		  Scanner in =new Scanner(System.in);
		  int min=0,hour=0,sec;
		  System.out.print("초 입력 :");
	        sec=in.nextInt();
	        
	        min=sec/60;
	        hour=min/60;
	        min=min%60;
	        sec=sec%60;
	        System.out.printf("-> %d시간 %d분 %d초 ",hour,min,sec);
		}

	}


