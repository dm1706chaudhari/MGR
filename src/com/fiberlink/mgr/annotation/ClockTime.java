package com.fiberlink.mgr.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.management.MXBean;

@Retention(RetentionPolicy.RUNTIME)  

public @interface ClockTime {

	String methodName();

}
