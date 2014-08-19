/**
 * 
 */
package ar.edu.unimoron.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * @author mariano
 *
 */
public class Curso {
	private Long id;
	private Materia materia;
	private String comision;
	private String aula;
	private Set<DiasHora> diasCurso = new HashSet<DiasHora>();
	private Set<DatosAlumno> alumnosIncriptos = new HashSet<DatosAlumno>();
	
	private Date fechaInicio;
	private Date fechaFin;

	private Set<Profesor> profesores = new HashSet<Profesor>(); 
	
	private String estado; //iniciado-finalizado
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
	 * @return the comision
	 */
	public String getComision() {
		return comision;
	}
	/**
	 * @param comision the comision to set
	 */
	public void setComision(String comision) {
		this.comision = comision;
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
	 * @return the diasCurso
	 */
	public Set<DiasHora> getDiasCurso() {
		return diasCurso;
	}
	/**
	 * @param diasCurso the diasCurso to set
	 */
	public void setDiasCurso(Set<DiasHora> diasCurso) {
		this.diasCurso = diasCurso;
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
	 * @return the profesores
	 */
	public Set<Profesor> getProfesores() {
		return profesores;
	}
	/**
	 * @param profesores the profesores to set
	 */
	public void setProfesores(Set<Profesor> profesores) {
		this.profesores = profesores;
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
	/**
	 * @return the fechaInicio
	 */
	public Date getFechaInicio() {
		return fechaInicio;
	}
	/**
	 * @param fechaInicio the fechaInicio to set
	 */
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	/**
	 * @return the fechaFin
	 */
	public Date getFechaFin() {
		return fechaFin;
	}
	/**
	 * @param fechaFin the fechaFin to set
	 */
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Curso [id=" + id + ", materia=" + materia + ", comision="
				+ comision + ", aula=" + aula + ", diasCurso=" + diasCurso
				+ ", alumnosIncriptos=" + alumnosIncriptos + ", fechaInicio="
				+ fechaInicio + ", fechaFin=" + fechaFin + ", profesores="
				+ profesores + ", estado=" + estado + "]";
	}
	
}
