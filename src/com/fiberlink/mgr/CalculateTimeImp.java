package com.fiberlink.mgr;

import com.fiberlink.mgr.annotation.ClockTime;

public class CalculateTimeImp implements CalculateTIme{

	@Override
	@ClockTime(methodName = "doCalculateTime")
	public void doCalculateTime() {
		System.out.println("I am busy calculating time");
		
	}

	@Override
	@ClockTime(methodName = "annoOther")
	public void otherMethod() {
		System.out.println("I am other method");
		
	}

}
