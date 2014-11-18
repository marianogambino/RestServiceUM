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
@Table(name="CURSOPROFESOR")
public class ProfesorCurso {

	private Long id;
	private Profesor profesor;
	private Curso curso;
	
	/**
	 * @return the id
	 */
	@Id
	@Column(name="IDPROFESORCURSO" , nullable = false)
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
	 * @return the profesor
	 */
	@ManyToOne
	@JoinColumn(name="IDPROFESOR", nullable = false)
	public Profesor getProfesor() {
		return profesor;
	}
	/**
	 * @param profesor the profesor to set
	 */
	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
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
		return "ProfesorCurso [id=" + id + ", profesor=" + profesor
				+ ", curso=" + curso + "]";
	}
}
