package ar.edu.unimoron.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author mariano
 *
 */
@Entity
@Table(name="MATERIA")
public class Materia {
	
	private Long codigo;
	private String nombre;
	private String descripcion;
	
	/**
	 * @return the codigo
	 */
	@Id
	@Column(name="CODIGO" , nullable = false)
	public Long getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
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
	 * @return the descripcion
	 */
	@Column(name="DESCRIPCION" , nullable = false)
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Materia [codigo=" + codigo + ", nombre=" + nombre
				+ ", descripcion=" + descripcion + "]";
	}
	
	
}
