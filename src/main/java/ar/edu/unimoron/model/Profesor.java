/**
 * 
 */
package ar.edu.unimoron.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author mariano
 *
 */
@Entity
@Table(name="PROFESOR") 
public class Profesor {

	private Long id;
	private String nombre;
	private String apellido;
	
	public Profesor( String nom, String ape){
		this.nombre = nom;
		this.apellido = ape;
	}
	
	/**
	 * @return the id
	 */
	@Id
	@Column(name="IDPROFESOR" , nullable = false)
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the nombre
	 */
	@Column(name="NOMBRE" , nullable = false)
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the apellido
	 */
	@Column(name="APELLIDO" , nullable = false)
	public String getApellido() {
		return apellido;
	}
	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Profesor [id=" + id + ", nombre=" + nombre + ", apellido="
				+ apellido + "]";
	}
}
