/**
 * 
 */
package ar.edu.unimoron.model;

import java.util.Set;

/**
 * @author mariano
 *
 */
public class Carrera {

	
	private Long id;
	private String nombre;
	private Facultad facultad;
	private Set<Materia> materias;
	
	
	/**
	 * @return the facultad
	 */
	public Facultad getFacultad() {
		return facultad;
	}
	/**
	 * @param facultad the facultad to set
	 */
	public void setFacultad(Facultad facultad) {
		this.facultad = facultad;
	}
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
	 * @return the materias
	 */
	public Set<Materia> getMaterias() {
		return materias;
	}
	/**
	 * @param materias the materias to set
	 */
	public void setMaterias(Set<Materia> materias) {
		this.materias = materias;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Carrera [id=" + id + ", nombre=" + nombre + ", facultad="
				+ facultad + ", materias=" + materias + "]";
	}
	
	
}
