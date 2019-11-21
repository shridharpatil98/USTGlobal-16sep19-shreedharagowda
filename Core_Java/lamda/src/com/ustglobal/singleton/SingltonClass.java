package com.ustglobal.singleton;

public class SingltonClass {
	private static SingltonClass single;
	private SingltonClass() {

	}
	public static SingltonClass getObject() {
		if(single==null) {
			return single=new SingltonClass();
		}else {
			return single;
		}
	}
}
