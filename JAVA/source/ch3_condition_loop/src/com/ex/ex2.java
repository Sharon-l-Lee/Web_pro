package com.ex;

public class ex2 {
	public static void main(String[] args) {
		/*
		 * while���� math.random�� �̿��ؼ� �� ���� �ֻ����� ������ �� ������ ���� (��1, ��2)�� ���·� ����ϰ� ���� ���� 5��
		 * �ƴϸ� ��� �ֻ����� ������, ���� ���� 5�� ������ ���ߴ� �ڵ带 �ۼ��Ͻÿ�.
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
