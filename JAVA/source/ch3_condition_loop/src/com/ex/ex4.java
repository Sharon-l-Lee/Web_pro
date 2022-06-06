package com.ex;

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for문을 이용해 *로 직각 삼각형 출력하기
		
		for(int i = 0; i<6; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
