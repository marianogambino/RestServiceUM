/**
 * 
 */
package ar.edu.unimoron.response;

import java.util.Set;

import ar.edu.unimoron.model.Examen;

/**
 * @author mariano
 *
 */
public class ExamenesResponse {

	
	public ExamenesResponse( Set<Examen> examenes){
		this.examenesInscriptos = examenes;
	}
	
	private Set<Examen> examenesInscriptos;

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
	
	
	
}
