/**
 * 
 */
package ar.edu.unimoron.service;

import org.springframework.stereotype.Service;

import ar.edu.unimoron.response.AulaResponse;

/**
 * @author mariano
 *
 */
@Service
public class AulasService {

	/**
	 * 
	 * @param idCurso
	 * @return
	 */
	public AulaResponse getAulaCurso( Long idCurso){
		
		return new AulaResponse(  "404" );
		
	}
	
	/**
	 * 
	 * @param idExamen
	 * @return
	 */
	public AulaResponse getAulaExamen( Long idExamen){
		
		return new AulaResponse(  "505" );
		
	}
}
