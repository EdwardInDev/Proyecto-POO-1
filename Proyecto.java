package es.ifp.programacion.ejercicio.uf4;

/**
 * Desde la clase proyecto se definen los atributos del proyecto, los constructores con la composición del tipo cliente
 * y del tipo Jefeproyecto, los métodos con sus getters y setters
 * finalmente se llama al método toString que devuelve los datos de proyecto y a su vez con toString en datos de cliente y jefe de proyecto
 * que devuelven la información que contiene cada clase
 * Se realiza encapsulamiento poniendo el modificador de visibilidad en private para los atributos y en public para los métodos
 * Se indica los atributos con el apuntador this. como buena práctica
 */

//Se importa la clase java.util.Date para la fecha inicial

import java.util.Date;

public class Proyecto {
	
	
	//Definición de atributos
	
	private String nombreProyecto;
	private String idProyecto;
	private String descProyecto;
	private Date fechaIni;
	
	//Composición con el tipo Cliente y el tipo JefeProyecto porque la clase Proyecto se compone de dicha información
	
	private Cliente clienteProyecto;
	private JefeProyecto jp;
	
	//Definición de constructores

/**
 * Contructor con todos los parámetros
 * @param nomPro nombre del proyecto
 * @param idPro identificador del proyecto
 * @param descPro descripción del proyecto
 * @param fechaIn fecha de inicio del proyecto
 * @param cli cliente para el que está realizando el proyecto
 * @param jefp jefe de proyectos
 */
	public Proyecto (String nomPro, String idPro, String descPro, Date fechaIn, Cliente cli, JefeProyecto jefp) {
		this.nombreProyecto=nomPro;
		this.idProyecto=idPro;
		this.descProyecto=descPro;
		this.fechaIni=fechaIn;
		this.clienteProyecto=cli;
		this.jp=jefp;
}

	//Definición de métodos
	
	/**
	 * Método que retorna el identificador del proyecto
	 * @return un string con el identificador del proyecto
	 */
	public String getIdPro() {
		return this.idProyecto;
	}
	
	/**
	 * Modifica el identificador del proyecto
	 * @param nuevoIdPro valor del tipo String con el nuevo identificador del proyecto
	 */
	public void setIdPro(String nuevoIdPro) {
		this.idProyecto=nuevoIdPro;
	}
	
	/**
	 * Método que retorna el nombre del proyecto
	 * @return un String con el nombre del proyecto
	 */
	public String getNomPro() {
		return this.nombreProyecto;
	}
	
	/**
	 * Modifica el nombre del proyecto
	 * @param nuevoNomPro valor del tipo String con el nuevo nombre del proyecto
	 */
	public void setNomPro(String nuevoNomPro) {
		this.nombreProyecto=nuevoNomPro;
	}
	
	/**
	 * Método que retorna la descripción del proyecto
	 * @return un String con la descripción del proyecto
	 */
	public String getDescPro() {
		return this.descProyecto;
	}
	
	/**
	 * Modifica la descripción del proyecto
	 * @param nuevoDescPro valor del tipo String con la nueva descripción del proyecto
	 */
	public void setDescPro(String nuevaDescPro) {
		this.descProyecto=nuevaDescPro;
	}
	
	/**
	 * Método que retorna la fecha de inicio del proyecto
	 * @return un Date con la fecha de inicio del proyecto
	 */
	public Date getFechaIn() {
		return this.fechaIni;
	}
	
	/**
	 * Modifica la fecha de inicio del proyecto
	 * @param nuevoFechaIn valor del tipo Date con la nueva fecha de inicio del proyecto
	 */
	public void setFechaIn(Date nuevaFechaIn) {
		this.fechaIni=nuevaFechaIn;
	}
	
	/**
	 * Método que retorna el cliente para el que está realizando el proyecto
	 * @return un String con el cliente para el que está realizando el proyecto
	 */
	public Cliente getCli() {
		return this.clienteProyecto;
		
	}
	
	/**
	 * Modifica el cliente para el que está realizando el proyecto
	 * @param nuevoCli valor del tipo String con el nuevo cliente para el que está realizando el proyecto
	 */
	public void setCli(Cliente nuevoCli) {
		this.clienteProyecto=nuevoCli;
	}
	
	/**
	 * Método que retorna el jefe de proyectos
	 * @return un String con el jefe de proyectos
	 */
	public JefeProyecto getJefp() {
		return this.jp;
	}
	
	/**
	 * Modifica el jefe de proyectos
	 * @param nuevoJefp valor del tipo String con el nuevo jefe de proyectos
	 */
	public void setJefp(JefeProyecto nuevoJefp) {
		this.jp=nuevoJefp;
	}
	
	//Llamada al método toString
	
	/**
	 * Se sobreescribe el método toString para que retorne todos los datos de Proyecto en un String
	 * @return un String con todos los atributos de la clase Proyecto
	 * En la clase Cliente y JefeProyecto tienen un método toString que me extrae sus datos, por lo que se invocan
	 */
	
	@Override
	public String toString() {
		return  "========================================="+"\n"+
				"              DATOS PROYECTO             "+"\n"+
				"========================================="+"\n"+
				"Nombre del proyecto:"+this.getNomPro()+"\n"+
				"Identificador del proyecto:"+this.getIdPro()+"\n"+
				"Descripción:"+this.getDescPro()+"\n"+
				"Fecha de inicio:"+this.getFechaIn()+"\n"+
				"========================================="+"\n"+
				"               DATOS CLIENTE             "+"\n"+
				"========================================="+"\n"+
				this.getCli().toString()+"\n"+
				"========================================="+"\n"+
				"                  DATOS JP               "+"\n"+
				"========================================="+"\n"+
				this.getJefp().toString();
	}
	
	
	
}
