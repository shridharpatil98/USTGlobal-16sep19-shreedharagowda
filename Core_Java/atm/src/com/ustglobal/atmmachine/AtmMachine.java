package com.ustglobal.atmmachine;

public class AtmMachine {
	void slot(ATM a) {
		a.validateCard();
		a.getInfo();
	}
}
