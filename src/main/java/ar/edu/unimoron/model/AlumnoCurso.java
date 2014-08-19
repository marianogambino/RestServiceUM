/**
 * 
 */
package ar.edu.unimoron.model;

/**
 * @author mariano
 *
 */
public class AlumnoCurso {
	private Long id;
	private DatosAlumno alumno;
	private Curso curso;
	/**
	 * @return the id
	 */
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
