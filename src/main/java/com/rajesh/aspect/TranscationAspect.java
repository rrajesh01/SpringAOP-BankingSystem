package com.rajesh.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TranscationAspect {

	@Around("execution(* com.rajesh.service.AccountServiceImp.withdraw(..))")
	public Object aroundWithdraw(ProceedingJoinPoint pjp) {
		Object result = null;
		try {
			System.out.println("TransactionAspect - Transaction started.");
			result = pjp.proceed();
			System.out.println("TransactionAspect - Transaction committed.");
		} catch (Throwable e) {
			System.out.println("TransactionAspect - Transaction rolled back due to exception.");
			e.printStackTrace();
		} finally {
			System.out.println("TransactionAspect - Transaction ended.");
		}
		return result;
	}

}
