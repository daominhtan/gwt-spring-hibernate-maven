package au.com.uptick.gwt.maven.sample.client.app.utils.test.threads;

public class UsandoThread {
	
	public static void main(String[] args){
		
//		UnThread t1 = new UnThread("t1");
//		UnThread t2 = new UnThread("t2");
//		UnThread t3 = new UnThread("t3");
//		t1.start();
//		t2.start();
//		t3.start();
		
		SegundoThread t1 = new SegundoThread();
		Thread thread = new Thread(t1);
		thread.start();
		t1.addStringAndNotify("hola");
		
	}

}
