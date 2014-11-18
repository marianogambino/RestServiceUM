/**
 * 
 */
package ar.edu.unimoron.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

/**
 * @author mariano
 *
 */
@Entity
@Table(name="EXAMEN")
public class Examen {

	private Long id;
	private Materia materia;
	private String aula;
	private Date fechaExamen;
	private Set<AlumnoExamen> alumnosIncriptos = new HashSet<AlumnoExamen>();
	
	
	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="IDEXAMEN" , nullable = false)
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
	 * @return the materia
	 */
	@OneToOne
	@JoinColumn(name="IDMATERIA", nullable = false)
	public Materia getMateria() {
		return materia;
	}
	/**
	 * @param materia the materia to set
	 */
	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	/**
	 * @return the aula
	 */
	@Column(name="AULA" , nullable = false)
	public String getAula() {
		return aula;
	}
	/**
	 * @param aula the aula to set
	 */
	public void setAula(String aula) {
		this.aula = aula;
	}
	/**
	 * @return the fechaExamen
	 */
	@Column(name="FECHAEXAMEN" , nullable = false)
	public Date getFechaExamen() {
		return fechaExamen;
	}
	/**
	 * @param fechaExamen the fechaExamen to set
	 */
	public void setFechaExamen(Date fechaExamen) {
		this.fechaExamen = fechaExamen;
	}
	/**
	 * @return the alumnosIncriptos
	 */
	@OneToMany(cascade = CascadeType.ALL , fetch = FetchType.LAZY, mappedBy = "examen")
	@Cascade({org.hibernate.annotations.CascadeType.ALL,
			  org.hibernate.annotations.CascadeType.DELETE})
	public Set<AlumnoExamen> getAlumnosIncriptos() {
		return alumnosIncriptos;
	}
	/**
	 * @param alumnosIncriptos the alumnosIncriptos to set
	 */
	public void setAlumnosIncriptos(Set<AlumnoExamen> alumnosIncriptos) {
		this.alumnosIncriptos = alumnosIncriptos;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Examen [id=" + id + ", materia=" + materia + ", aula=" + aula
				+ ", fechaExamen=" + fechaExamen + ", alumnosIncriptos="
				+ alumnosIncriptos + "]";
	}
	
}
