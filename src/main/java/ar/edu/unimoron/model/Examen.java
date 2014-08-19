/**
 * 
 */
package ar.edu.unimoron.model;

import java.util.Date;
import java.util.Set;

/**
 * @author mariano
 *
 */
public class Examen {

	private Long id;
	private Materia materia;
	private String aula;
	private Date fechaExamen;
	private Set<DatosAlumno> alumnosIncriptos;
	private Integer nota;
	private String estado; //ausente o rendido
	
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
	 * @return the materia
	 */
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
	public Set<DatosAlumno> getAlumnosIncriptos() {
		return alumnosIncriptos;
	}
	/**
	 * @param alumnosIncriptos the alumnosIncriptos to set
	 */
	public void setAlumnosIncriptos(Set<DatosAlumno> alumnosIncriptos) {
		this.alumnosIncriptos = alumnosIncriptos;
	}
	/**
	 * @return the nota
	 */
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
		return "Examen [id=" + id + ", materia=" + materia + ", aula=" + aula
				+ ", fechaExamen=" + fechaExamen + ", alumnosIncriptos="
				+ alumnosIncriptos + ", nota=" + nota + ", estado=" + estado
				+ "]";
	}
	
	
	
}
