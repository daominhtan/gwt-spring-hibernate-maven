package au.com.uptick.gwt.maven.sample.client.app.utils.test.spring;

import org.springframework.stereotype.Component;

@Component("CB")
public class CompB implements IComp{

	public void holaMundo() {
		System.out.println("HOLA C B");
		
	}

}
