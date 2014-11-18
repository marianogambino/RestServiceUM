/**
 * 
 */
package ar.edu.unimoron.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author mariano
 *
 */
@Entity
@Table(name="NOVEDAD")
public class Novedad {

	private String idNovedad;
	private String descripcion;
	
	/**
	 * @return the idNovedad
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="IDNOVEDAD" , nullable = false)
	public String getIdNovedad() {
		return idNovedad;
	}
	/**
	 * @param idNovedad the idNovedad to set
	 */
	public void setIdNovedad(String idNovedad) {
		this.idNovedad = idNovedad;
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
		return "Novedad [idNovedad=" + idNovedad + ", descripcion="
				+ descripcion + "]";
	}

}
