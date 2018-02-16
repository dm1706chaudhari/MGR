package com.fiberlink.mgr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TimeCalculator {
	
	public static void main(String[] args)  {
//		long startTime = System.nanoTime();
//		for(int i=0;i<10000;i++);
//		long endTime = System.nanoTime();
//		TimeCalculator t = new TimeCalculator();
//		try {
//			Method m = t.getClass().getMethod("testMethod");
//			ClockTime c = m.getAnnotation(ClockTime.class);
//			System.out.println();
//			Test test = new Test();
//			test.getClass().getMethod("foo").invoke(new Object(), "123");
//			System.out.println(m.invoke(new Object(), "123"));
//		} catch (NoSuchMethodException | SecurityException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println(endTime-startTime);
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        CalculateTIme ct = (CalculateTIme) context.getBean("calculateTimeImp");
        ct.doCalculateTime();
        ct.otherMethod();
        
        OtherClassImpl oc =(OtherClassImpl) context.getBean("otherClass");
        oc.methodInOtherClass();
	}
	

}
