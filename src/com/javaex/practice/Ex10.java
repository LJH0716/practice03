package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요"); 
		
		int max=0;
		int num = sc.nextInt();
		
		for(int i=0; i<=5; i++) {
			
			System.out.print("숫자: "); 
			
			if(i==0) {
				max = num;
			}
			else if(num > max) {
				
			}
			
		System.out.println("최대값은 " + max + " 입니다." );
		sc.close();
		
		
		
		}
	
		
	}
}
