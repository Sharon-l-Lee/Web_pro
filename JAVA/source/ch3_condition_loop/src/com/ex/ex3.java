package com.ex;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ��ø for������ ������ 4x+5y=60�� ��� �ظ� ���ؼ� (x,y)���·� ��� x�� y�� 10������ �ڿ���
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
