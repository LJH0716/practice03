package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int fac =1;
		int num =sc.nextInt();
		
		for(int i=1; i<=num;i++) {
			fac *=i;
			//팩토리얼 표시 방법
			
		}
		
		System.out.println("결과값: " + fac);
		
		sc.close();
	}

}
