package com.javaex.practice;

public class Ex09 {

	public static void main(String[] args) {
		
		for (int x=1; x<= 10; x++) {
			for (int y=x; y<=10+x; y++) {
				System.out.print(y + "   ");
			}
			System.out.println();

		}
	}

}
