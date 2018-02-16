package com.fiberlink.mgr;

import com.fiberlink.mgr.annotation.ClockTime;

public class OtherClassImpl {


	@ClockTime(methodName = "methodInOtherClass")
	public void methodInOtherClass() {
		System.out.println("I am method from other class");
		
	}

}
