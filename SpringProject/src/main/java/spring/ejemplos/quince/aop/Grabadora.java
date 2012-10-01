package spring.ejemplos.quince.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Grabadora {
	
	public Grabadora() {
		System.out.println("Se crea la instancia => Grabadora");
	}
	
	/**
	 * Los ADVICES se pueden configurar para que se ejecuten en los siguiente momentos:
	 * - @Before: Antes de la ejecuci�n de un m�todo.
	 * - @AfterReturning: Despu�s de la ejecuci�n de un m�todo que termina normalmente.
	 * - @AfterThrowing: Despu�s de la ejecuci�n de un m�todo que termina elevando una excepci�n.
	 * - @After: Despu�s de la ejecuci�n de un m�todo que termina normalmente o elevando una excepci�n.
	 * - @Around: Sustituyendo por completo el c�digo original.
	 */
	@After("execution(public * Secretaria.conversacion(..))")
    public void grabarConversacion() {
		System.out.println("ADVICE UNO");
		System.out.println("grabarConversacion");
    }
	
	@Before("execution(public * Secretaria.inDespacho(..))")
    public void grabarDespacho() {
		System.out.println("ADVICE DOS");
		System.out.println("grabarDespacho");
    }
	
	// Aca vemos como declaramos tanto el pointcut como el advice todo de una...
	 @AfterThrowing(pointcut="execution(public * *(..))",throwing="gritito")
	 public void grabarGrititos(Exception gritito) {
		 System.out.println("ADVICE TRES");
		 System.out.println("Grabando excepcion: grabarGrititos ");
	 }

	 @After("execution(public * holaMundo(..))")
	 public void grabarHolaMundo() {
		 System.out.println("ADVICE CUATRO");
		 System.out.println("grabarHolaMundo");
	 }
	 
	 

}
