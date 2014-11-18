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
@Table(name="CURSO")
public class Curso {
	
	private Long id;
	private Materia materia;
	private String comision;
	private String aula;
	private Set<DiasHora> diasCurso = new HashSet<DiasHora>();
	private Set<AlumnoCurso> alumnosIncriptos = new HashSet<AlumnoCurso>();
	
	private Date fechaInicio;
	private Date fechaFin;

	private Set<ProfesorCurso> profesores = new HashSet<ProfesorCurso>(); 
	
	private String estado; //iniciado-finalizado
	
	//@version @column(name="LOCK_VERSION") private Long version
	
	/**
	 * @return the id
	 */
	@Id
	@Column(name="IDCURSO" , nullable = false)
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
	 * @return the comision
	 */
	@Column(name="COMISION" , nullable = false)
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
	 * @return the diasCurso
	 */
	@OneToMany(cascade = CascadeType.ALL , fetch = FetchType.LAZY)
	@Cascade({org.hibernate.annotations.CascadeType.ALL,
			  org.hibernate.annotations.CascadeType.DELETE})
	@JoinColumn(name="IDDIASHORA" , nullable = false)
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
	@OneToMany(cascade = CascadeType.ALL , fetch = FetchType.LAZY, mappedBy = "curso")
	@Cascade({org.hibernate.annotations.CascadeType.ALL,
			  org.hibernate.annotations.CascadeType.DELETE})
	public Set<AlumnoCurso> getAlumnosIncriptos() {
		return alumnosIncriptos;
	}
	/**
	 * @param alumnosIncriptos the alumnosIncriptos to set
	 */
	public void setAlumnosIncriptos(Set<AlumnoCurso> alumnosIncriptos) {
		this.alumnosIncriptos = alumnosIncriptos;
	}
	/**
	 * @return the profesores
	 */
	@OneToMany(cascade = CascadeType.ALL , fetch = FetchType.LAZY, mappedBy = "curso")
	@Cascade({org.hibernate.annotations.CascadeType.ALL,
			  org.hibernate.annotations.CascadeType.DELETE})
	public Set<ProfesorCurso> getProfesores() {
		return profesores;
	}
	/**
	 * @param profesores the profesores to set
	 */
	public void setProfesores(Set<ProfesorCurso> profesores) {
		this.profesores = profesores;
	}
	
	
	/**
	 * @return the estado
	 */
	@Column(name="ESTADO" , nullable = false)
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
	@Column(name="FECHA_INICIO" , nullable = false)
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
	@Column(name="FECHA_FIN" , nullable = false)
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
