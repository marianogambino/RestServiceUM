package ar.edu.unimoron.response;

import ar.edu.unimoron.model.DatosAlumno;

/**
 * @author mariano
 *
 */
public class LoginResponse {

	private DatosAlumno alumno;
	 
	
	/**
	 * 
	 * @param id
	 * @param content
	 */
	public LoginResponse( DatosAlumno alumno){
		this.alumno = alumno;
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "LoginResponse [alumno=" + alumno + "]";
	}
		
}
