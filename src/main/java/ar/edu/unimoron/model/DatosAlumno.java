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
@Table(name="ALUMNO")
public class DatosAlumno {
	
	private Long matricula;
	private String nombre;
	private String apellido;
	private Date fechaNacimiento;
	private Carrera carrera;
	private String planEstudio;
	
	private Set<AlumnoCurso> cursosIncriptos = new HashSet<AlumnoCurso>();
	private Set<AlumnoExamen> examenesInscriptos = new HashSet<AlumnoExamen>();
	
	
		
	/**
	 * @return the matricula
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="MATRICULA" , nullable = false)
	public Long getMatricula() {
		return matricula;
	}
	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}
	
	
	/**
	 * @return the nombre
	 */
	@Column(name="NOMBRE" , nullable = false)
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
	@Column(name="APELLIDO" , nullable = false)
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
	@Column(name="FECHANACIMIENTO" , nullable = false)
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
	@OneToOne
	@JoinColumn(name="IDCARRERA" , nullable = false)
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
	@Column(name="PLANESTUDIO" , nullable = false)
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
	
	@OneToMany(cascade = CascadeType.ALL , fetch = FetchType.LAZY, mappedBy = "alumno")
	@Cascade({org.hibernate.annotations.CascadeType.ALL,
			  org.hibernate.annotations.CascadeType.DELETE})
	public Set<AlumnoCurso> getCursosIncriptos() {
		return cursosIncriptos;
	}
	/**
	 * @param cursosIncriptos the cursosIncriptos to set
	 */
	public void setCursosIncriptos(Set<AlumnoCurso> cursosIncriptos) {
		this.cursosIncriptos = cursosIncriptos;
	}
	/**
	 * @return the examenesInscriptos
	 */
	@OneToMany(cascade = CascadeType.ALL , fetch = FetchType.LAZY, mappedBy = "alumno")
	@Cascade({org.hibernate.annotations.CascadeType.ALL,
			  org.hibernate.annotations.CascadeType.DELETE})
	public Set<AlumnoExamen> getExamenesInscriptos() {
		return examenesInscriptos;
	}
	/**
	 * @param examenesInscriptos the examenesInscriptos to set
	 */
	public void setExamenesInscriptos(Set<AlumnoExamen> examenesInscriptos) {
		this.examenesInscriptos = examenesInscriptos;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DatosAlumno [matricula=" + matricula + ", nombre=" + nombre
				+ ", apellido=" + apellido + ", fechaNacimiento="
				+ fechaNacimiento + ", carrera=" + carrera + ", planEstudio="
				+ planEstudio + ", cursosIncriptos=" + cursosIncriptos
				+ ", examenesInscriptos=" + examenesInscriptos + "]";
	}
	
}
