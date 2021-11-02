package com.yedam.java.ch0203_02;

public class varivalbeExample {
	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		
		int byteResult = byteValue1 + byteValue2;
		
		char charValue1 = 'A';
		char charValue2 = 1;
		int charResult = charValue1 + charValue2;
		
		int intValue1 = 10;
		int intValue2 = intValue1/4; // 결과값 2 
		
		System.out.println("byteResult: " + byteResult);
		System.out.println("charResult, 유니코드 값 : " + charResult);
		System.out.println("charResult, 출력문자 : " + (char)charResult);
		System.out.println("intValue2 : " + intValue2);
		
		double doulbeValue = intValue1/4;
		// intValue1 - > 10 
		// 4
		// 10 / 4
		// 2.5 -> 2
		// double 타입 doubleValue = 2;
		// 2.0;
		System.out.println(doulbeValue);
		
		
		System.out.println("==== Quiz");
		byte x = 10;
		byte y = 20;
		int m = 30;
		long n = 70L;		
		int result1 = x + y + m; // int + int + int => int 
		System.out.println(result1);		
		long result2 = x + y + n; // int + int + long => long + long + long => long
		System.out.println(result2);		
		
		int x1 = 100;
		long y1 = 140L;
		float f1 = 3.14F;
		double d1 = 10.15;		
		float result3 = x1 + y1 + f1; // int + long + float => long + float 
	
		System.out.println(result3);
		double result4 = y1 + f1 + d1; // long + float + double => double
		System.out.println(result4);
		
		int value = 10 + 2 + 8; // 10 + 2 > 12 + 8; 
		String str1 = 10 + 2 + "8"; // 12 + "8" => "12" + "8" => 128;
		String str2 = 10 + "2" + 8; // "10" + "2" => "102" + 8 => 1028;
		String str3 = "10" + 2 + 8; // "10" + "2" => "102" + 8 => 1028;
		String str4 = "10" + (2 + 8); // "10" + 10 => 1010;
		
		System.out.println(value);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		
		int value1 = Integer.parseInt("10") + 2 + 8;
		System.out.println(value1);
		
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		if(value3) {
			double result = value2 + 1;
			System.out.println(result);
		}
		
		String str5 = String.valueOf(10);
		String str6 = String.valueOf(10.5);
		String str7 = String.valueOf(true);
		
		String strResult  = str5 + str6 + str7;
		System.out.println(strResult);
		
		System.out.println("==== Quiz2");
		int a = 10;
		int b = 2;
		double c = 4.75;
		String str = "숫자결합";
		
		// 10 + 숫자결합 + 6.75 => 10 + 숫자결합 + 2 + 4.75
		
		String strResult1 = a + str + (b + c); // 10 + 숫자결합 + 6.75
		System.out.println(strResult1);
		
	}
}
