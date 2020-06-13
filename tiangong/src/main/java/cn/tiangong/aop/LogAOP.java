package cn.tiangong.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.CodeSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAOP {
	private Logger logger = Logger.getLogger(LogAOP.class);
	
	@Pointcut("@annotation(cn.tiangong.aop.UserLog)")
	public void method(){
	}
	
	@AfterReturning("method()")
	public void afterReturn(JoinPoint joinPoint) {
		String name = joinPoint.getSignature().getName();
		String[]  argsName =((CodeSignature)joinPoint.getSignature()).getParameterNames();
		Object[] args=joinPoint.getArgs();
		//System.out.println(name);
		String info=name+" ";
		if(name=="likeVideo") info+="type:1 ";
		if(name=="likeCourse") info+="type:3 ";
		if(name=="likeArticle") info+="type:2 ";
		for (int i = 0;i<argsName.length;i++) {
			info+=argsName[i]+":";
			info+=args[i]+" ";
		}
		System.out.println(info);
		logger.info(info);
	}
}
