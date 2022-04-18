package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
	
		System.out.print("숫자를 입력하세요: ");
		
		int sum = 0;
		int num = sc. nextInt();
		
		for(int i=1; i<=num; i++) {
			if(i==1) {
				System.out.print(i);
			}
			else {
				System.out.print("+" +i);
			}
		}
		
		System.out.println("");
		
		for (int i=1; i<=num; i++) {
			sum += i;
			}
		System.out.println("합계: "+sum);
		
		sc.close();	

	}

}
