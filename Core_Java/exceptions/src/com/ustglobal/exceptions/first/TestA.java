package com.ustglobal.exceptions.first;

public class TestA {
	public static void main(String[] args) throws Exception{
		int[] ar= {1,2,3,4,5};
		try {
			System.out.println(ar[6]);
		}catch(ArrayIndexOutOfBoundsException ex){
			System.out.println(ex);
		}catch(Exception e) {
			System.out.println(e);

		}
		System.out.println("main ended");
	}
}
