package com.ustglobal.objectclass;

public class USBPortal {
	public static void connect(Object ob) {
		if(ob instanceof Mouse) {
			Mouse m=(Mouse)ob;
			m.click();
			m.move();
		}
		else if(ob instanceof PenDrive) {
			PenDrive p=new PenDrive();
			p.read();
			p.write();
		}else {
			System.out.println("invalid usb");
		}
	}
}
