package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int many =0;
		int sum=0;
		
		System.out.print("숫자를 입력하세요: ");
		
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			if (i%5 == 0) {
				many+=1;
				sum+=i;
				
			}
		}
		
		System.out.println("5의배수의 개수:"+many);
		System.out.println("5의배수의 합 :"+sum);
		
		sc.close();
		
		
		
		
		
		
		
		

	}

}
