package com.ustglobal.exceptions.customizedCheckedException;

public class ValidateAmount {
	public void checkAmount(int amount) throws InvalidAmountException {
		if(amount>4000) {
			throw new InvalidAmountException();
		}
	}
}
