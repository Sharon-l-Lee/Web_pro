package com.ex;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 중첩 for문으로 방정식 4x+5y=60의 모든 해를 구해서 (x,y)형태로 출력 x와 y는 10이하의 자연수
		 */
		
		
			for(int i = 1; i<=10; i++) {
				for(int j=1; j<=10; j++) {
					
					if((4*i)+(5*j)==60) {
						System.out.println("("+i+","+j+")");
					}
				}
			}
		
	}

}
