package com.fiberlink.mgr;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.SoftException;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;

import com.fiberlink.mgr.annotation.ClockTime;

@Aspect
public class TimeCalculatorProfiler {
    @Pointcut("execution(* com.fiberlink.mgr.*.*(..)) && @annotation(com.fiberlink.mgr.annotation.ClockTime)")
    public void businessMethods() { }

    @Around("businessMethods()")
    public Object profile(ProceedingJoinPoint pjp) throws Throwable {
            long start = System.nanoTime();
            System.out.println("Going to call the method.");
            MethodSignature signature = (MethodSignature) pjp.getSignature();
            Method method = signature.getMethod();
            long elapsedTime = System.nanoTime() - start;
            pjp.proceed();
            String methodName = signature.getMethod().getName();
            System.out.println("method name is" + methodName);
            Class<?>[] parameterTypes = signature.getMethod().getParameterTypes();
            Annotation[][] annotations;
            try {
            //   System.out.println("class for which execution is happening" + pjp.getClass().getMethod(methodName, null));
            	
            	Method m = pjp.getTarget().getClass().getMethod(method.getName());
            	
            	ClockTime c = m.getAnnotation(ClockTime.class);
            	if(c != null)
            	System.out.println("this is from the annotation" + c.methodName());
                    
            } catch (Exception e) {
                throw new SoftException(e);
            }
            int i = 0;
            System.out.println("here");

           return method;
    	
    }
}
