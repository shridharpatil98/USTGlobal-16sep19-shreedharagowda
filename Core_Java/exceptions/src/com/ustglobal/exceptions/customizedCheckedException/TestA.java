package com.ustglobal.exceptions.customizedCheckedException;

public class TestA {
	public static void main(String[] args) {
		ValidateAmount v=new ValidateAmount();
		try{
			v.checkAmount(1000);
			System.out.println("withdraw your amount");
		}catch(InvalidAmountException in) {
			System.out.println(in.getMessage());
		}

	}
}
