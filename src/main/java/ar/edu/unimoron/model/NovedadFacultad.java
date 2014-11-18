/**
 * 
 */
package ar.edu.unimoron.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author mariano
 *
 */
@Entity
@Table( name = "NOVEDADCARRERA")
public class NovedadFacultad {

	private Long id;
	private Facultad facultad;
	private Novedad novedad;
	
	/**
	 * @return the id
	 */
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="IDNOVEDADCARRERA" , nullable = false)
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
	 * @return the facultad
	 */
	
	@OneToOne
	@JoinColumn(name="IDFACULTAD", nullable = false)
	public Facultad getFacultad() {
		return facultad;
	}
	/**
	 * @param facultad the facultad to set
	 */
	public void setFacultad(Facultad facultad) {
		this.facultad = facultad;
	}
	/**
	 * @return the novedad
	 */
	@OneToOne
	@JoinColumn(name="IDNOVEDAD", nullable = false)
	public Novedad getNovedad() {
		return novedad;
	}
	/**
	 * @param novedad the novedad to set
	 */
	public void setNovedad(Novedad novedad) {
		this.novedad = novedad;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "NovedadCarrera [id=" + id + ", facultad=" + facultad
				+ ", novedad=" + novedad + "]";
	}
	
	
	
	
}
