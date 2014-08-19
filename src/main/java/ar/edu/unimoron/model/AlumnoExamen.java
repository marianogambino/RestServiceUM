/**
 * 
 */
package ar.edu.unimoron.model;

/**
 * @author mariano
 *
 */
public class AlumnoExamen {

	private Long id;
	private DatosAlumno alumno;
	private Examen examen;
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
	 * @return the examen
	 */
	public Examen getExamen() {
		return examen;
	}
	/**
	 * @param examen the examen to set
	 */
	public void setExamen(Examen examen) {
		this.examen = examen;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AlumnoExamen [id=" + id + ", alumno=" + alumno + ", examen="
				+ examen + "]";
	}
	
	
}
