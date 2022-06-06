package com.ex;

public class ex1 {

	public static void main(String[] args) {
		//주어진 배열의 항복에서 최대값을 구하시오
		int max = 0;
		int[] array= {1, 5, 3, 8, 2};
		
		for(int i = 0; i<array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
			
		}
		System.out.println("max = "+max);
		
	}

}
