package net.inkbunny.mobile.advice;

import net.inkbunny.mobile.IMSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.ProceedingJoinPoint;

@Aspect
public class LoginStateAdvice {

	@Autowired
	private IMSession session;

	/**
	 * GET methods
	 */
	@Around("execution(public String net.inkbunny.mobile.controller.SearchController.get*(..))")
	public Object checkIfLoggedInForGet( ProceedingJoinPoint pjp ) throws Throwable {
		Object returnValue = "login";
		if ( session.getUserId() != null ) returnValue = pjp.proceed();
		return returnValue;
	}
	
	/**
	 * POST methods
	 */
	@Around("execution(public String net.inkbunny.mobile.controller.SearchController.do*(..))")
	public Object checkIfLoggedInForPost( ProceedingJoinPoint pjp ) throws Throwable {
		Object returnValue = "login";
		if ( session.getUserId() != null ) returnValue = pjp.proceed();
		return returnValue;	
	}
	
	
}