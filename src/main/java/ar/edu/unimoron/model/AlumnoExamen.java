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
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author mariano
 *
 */
@Entity
@Table(name="ALUMNOEXAMEN")
public class AlumnoExamen {

	private Long id;
	private DatosAlumno alumno;
	private Examen examen;
	private Integer nota;
	private String estado; //ausente o rendido
	
	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="IDALUMNOEXAMEN" , nullable = false)
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
	 * @return the alumno
	 */
	@ManyToOne
	@JoinColumn(name="MATRICULA", nullable = false)
	public DatosAlumno getAlumno() {
		return alumno;
	}
	/**
	 * @param alumno the alumno to set
	 */
	
	public void setAlumno(DatosAlumno alumno) {
		this.alumno = alumno;
	}
	/**
	 * @return the examen
	 */
	@OneToOne
	@JoinColumn(name="IDEXAMEN", nullable = false)
	public Examen getExamen() {
		return examen;
	}
	/**
	 * @param examen the examen to set
	 */
	public void setExamen(Examen examen) {
		this.examen = examen;
	}
	
	/**
	 * @return the nota
	 */
	@Column(name="NOTA")
	public Integer getNota() {
		return nota;
	}
	/**
	 * @param nota the nota to set
	 */
	public void setNota(Integer nota) {
		this.nota = nota;
	}
	/**
	 * @return the estado
	 */
	@Column(name="ESTADOS")
	public String getEstado() {
		return estado;
	}
	/**
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AlumnoExamen [id=" + id + ", alumno=" + alumno + ", examen="
				+ examen + ", nota=" + nota + ", estado=" + estado + "]";
	}
	
	
}
