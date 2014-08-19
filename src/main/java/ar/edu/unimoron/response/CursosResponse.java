/**
 * 
 */
package ar.edu.unimoron.response;

import java.util.Set;

import ar.edu.unimoron.model.Curso;

/**
 * @author mariano
 *
 */
public class CursosResponse {

	
	public CursosResponse( Set<Curso> cursos ){
		this.cursosInscriptos = cursos;
	}
	
	private Set<Curso> cursosInscriptos;

	/**
	 * @return the cursosInscriptos
	 */
	public Set<Curso> getCursosInscriptos() {
		return cursosInscriptos;
	}

	/**
	 * @param cursosInscriptos the cursosInscriptos to set
	 */
	public void setCursosInscriptos(Set<Curso> cursosInscriptos) {
		this.cursosInscriptos = cursosInscriptos;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CursosResponse [cursosInscriptos=" + cursosInscriptos + "]";
	}
	
	
	
}
