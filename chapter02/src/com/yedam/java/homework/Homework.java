package com.yedam.java.homework;

public class Homework {

	public static void main(String[] args) {

		int x = 37;
		int y = 91;
		
		System.out.println("x : " + x + ", y : " + y);
		
		System.out.println(y+x);
		System.out.println(y-x);
		System.out.println(y*x);
		System.out.println(y/x);
		
		//byte var1 = 128;
		int var1 = 128;
		System.out.printf("%d, int\n", var1);
		
		//char var2 = "B";
		String var2 = "B";
		System.out.printf("%s, String\n",  var2);
		
		//String var3 = 44032;
		char var3 = 44032;
		System.out.printf("%c, char\n", var3);
		
		//int var4 = 100000000000;
		long var4 = 100000000000L;
		System.out.printf("%d, long\n", var4);
		
		//float var5 = 43.93106;
		float var5 = 43.93106F;
		System.out.printf("%.5f, float\n", var5);
		
		//long var6 = 301.3;
		double var6 = 301.3;
		System.out.printf("%.1f, doulbe\n", var6);
		
		int intValue1 = 24;
		int intValue2 = 3;
		int intValue3 = 8;
		int intValue4 = 10;
		char charValue = 'A';
		String strValue = "번지";
		
		//		A278번지10.0
		// 278 => 24+3 / 8
		
		String strResult = String.valueOf(charValue) + (intValue1 + intValue2) + intValue3 
						+ strValue + (double)intValue4;
		
		System.out.println(strResult);
		
		
		int value = 485;
		
		int hundred = value / 100;
		int ten = (value - (hundred * 100)) / 10;
		int one = value - (hundred * 100) - (ten*10);
		
		int intResult = hundred + ten + one;
		
		System.out.println(intResult);
		
	}

}
