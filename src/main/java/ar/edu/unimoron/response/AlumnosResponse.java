/**
 * 
 */
package ar.edu.unimoron.response;

import java.util.HashSet;
import java.util.Set;

import ar.edu.unimoron.vo.AlumnoVO;

/**
 * @author mariano
 *
 */
public class AlumnosResponse {

	
	public AlumnosResponse( Set<AlumnoVO> alumnos ){
		this.alumnos = alumnos;
	}
	
	private Set<AlumnoVO> alumnos = new HashSet<AlumnoVO>();

	/**
	 * @return the alumnos
	 */
	public Set<AlumnoVO> getAlumnos() {
		return alumnos;
	}

	/**
	 * @param alumnos the alumnos to set
	 */
	public void setAlumnos(Set<AlumnoVO> alumnos) {
		this.alumnos = alumnos;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AlumnosResponse [alumnos=" + alumnos + "]";
	}
	
	
}
