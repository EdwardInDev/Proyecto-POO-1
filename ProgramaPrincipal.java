package es.ifp.programacion.ejercicio.uf4;

/**
 * ProgramaPrincipal permite la ejecución del programa de pruebas que contiene: Un proyecto, un cliente y un jefe de proyectos
 * Los datos que se muestran en consola solo los puede crear el programador, por lo que no se puede modificar por un usuario
 * Como el proyecto está compuesto de cliente y jefe de proyecto, se hace un toString de proyecto que devuelve toda la información
 * al programa principal, de esta manera el código de ProgramaPrincipal queda más limpio y contiene unicamente las instancias y la impresión
 */

//Se importa la clase date para completar los parámetros de Proyecto

import java.util.Date;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		//Creación de instancias
		
		Cliente cliente = new Cliente (" Andrés", " Gómez Lara", " 12345678A", " ID23");
		
		JefeProyecto jefeproyecto = new JefeProyecto (" Juan Pedro", " Marrero Tarriño", " 98765432B", 5);
		
		Proyecto proyecto = new Proyecto(" BOG", " PRJ1001", " Broker Online BA", new Date(), cliente, jefeproyecto);
		
		//Se imprime la instancia proyecto con el método toString que me extrae los datos de los que se compone Proyecto
		//por lo que se invocan al programa principal
		
		System.out.println(proyecto.toString());	

	}

}
