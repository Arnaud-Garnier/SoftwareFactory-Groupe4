package fr.unice.polytech.isa.interceptors;


import fr.unice.polytech.isa.utils.Database;

import javax.ejb.EJB;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import java.io.Serializable;

public class CartCounter implements Serializable {

	@EJB private Database memory;

	@AroundInvoke
	public Object intercept(InvocationContext ctx) throws Exception {
		Object result = ctx.proceed();  // do what you're supposed to do
		memory.incrementCarts();
		System.out.println("  #Cart processed: " + memory.howManyCarts());
		return result;
	}

}
