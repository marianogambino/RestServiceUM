/**
 * 
 */
package ar.edu.unimoron.model;

/**
 * @author mariano
 *
 */
public class CarreraMateria {

	private Long id;
	private Carrera carrera;
	private Materia materia;
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CarreraMateria [id=" + id + ", carrera=" + carrera
				+ ", materia=" + materia + "]";
	}
	
}
