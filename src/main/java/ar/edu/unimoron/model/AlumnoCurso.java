/**
 * 
 */
package ar.edu.unimoron.model;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name="ALUMNOCURSO")
public class AlumnoCurso {
	private Long id;
	private DatosAlumno alumno;
	private Curso curso;
	
	/**
	 * @return the id
	 */
	@Id
	@Column(name="IDALUMNOCURSO" , nullable = false)
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
	@JoinColumn(name="MATRICULAALUMNO", nullable = false)
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
	 * @return the curso
	 */
	@OneToOne
	@JoinColumn(name="IDCURSO", nullable = false)
	public Curso getCurso() {
		return curso;
	}
	/**
	 * @param curso the curso to set
	 */
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AlumnoCurso [id=" + id + ", alumno=" + alumno + ", curso="
				+ curso + "]";
	}
	
	
}
