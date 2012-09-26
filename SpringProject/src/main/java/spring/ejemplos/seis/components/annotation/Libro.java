package spring.ejemplos.seis.components.annotation;

import javax.inject.Named;

// Esta anotaci�n es similar a la @Component, pero pertenece a la especificaci�n est�ndar de 
// Java, en vez de a Spring, por lo que requiere a�adir la misma dependencia de Maven 
// indicada para la anotaci�n @Inject.
@Named
public class Libro {

	public Libro() {
		super();
		System.out.println("Se inicializa el objeto mediante el constructor => Libro");
	}

	
}
