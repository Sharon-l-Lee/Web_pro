package com.ex;

public class ex2 {
	public static void main(String[] args) {
		/*
		 * while문과 math.random을 이용해서 두 개의 주사위를 던졌을 때 나오는 눈을 (눈1, 눈2)의 형태로 출력하고 눈의 합이 5가
		 * 아니면 계속 주사위를 던지고, 눈의 합이 5면 실행을 멈추는 코드를 작성하시오.
		 */
		boolean dice = false;
		
	
		while(true) {
			int i = (int) (Math.random()*6)+1;
			int j = (int) (Math.random()*6)+1;
			System.out.println("("+i+","+j+")");
			if(i+j==5) {
				break;
			}
			
		}
	}//main

}//class
