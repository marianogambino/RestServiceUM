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
public class DatosAlumno {
	private Long id;
	private String matricula;
	private String usuario;
	private String nombre;
	private String apellido;
	private Date fechaNacimiento;
	private Carrera carrera;
	private String planEstudio;
	
	//** Cambiar Set<Curso> por Set<AlumnoCurso>
	private Set<Curso> cursosIncriptos;
	
	//** Cambiar Set<Examen> por Set<AlumnoExamen>
	private Set<Examen> examenesInscriptos;
	
	
	
	
	
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
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}
	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}
	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}
	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	/**
	 * @return the fechaNacimiento
	 */
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	/**
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	/**
	 * @return the carrera
	 */
	public Carrera getCarrera() {
		return carrera;
	}
	/**
	 * @param carrera the carrera to set
	 */
	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}
	/**
	 * @return the planEstudio
	 */
	public String getPlanEstudio() {
		return planEstudio;
	}
	/**
	 * @param planEstudio the planEstudio to set
	 */
	public void setPlanEstudio(String planEstudio) {
		this.planEstudio = planEstudio;
	}
	/**
	 * @return the cursosIncriptos
	 */
	public Set<Curso> getCursosIncriptos() {
		return cursosIncriptos;
	}
	/**
	 * @param cursosIncriptos the cursosIncriptos to set
	 */
	public void setCursosIncriptos(Set<Curso> cursosIncriptos) {
		this.cursosIncriptos = cursosIncriptos;
	}
	/**
	 * @return the examenesInscriptos
	 */
	public Set<Examen> getExamenesInscriptos() {
		return examenesInscriptos;
	}
	/**
	 * @param examenesInscriptos the examenesInscriptos to set
	 */
	public void setExamenesInscriptos(Set<Examen> examenesInscriptos) {
		this.examenesInscriptos = examenesInscriptos;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DatosAlumno [id=" + id + ", matricula=" + matricula
				+ ", usuario=" + usuario + ", nombre=" + nombre + ", apellido="
				+ apellido + ", fechaNacimiento=" + fechaNacimiento
				+ ", carrera=" + carrera + ", planEstudio=" + planEstudio
				+ ", cursosIncriptos=" + cursosIncriptos
				+ ", examenesInscriptos=" + examenesInscriptos + "]";
	}
}
