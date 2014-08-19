/**
 * 
 */
package ar.edu.unimoron.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import ar.edu.unimoron.response.NovedadesResponse;

/**
 * @author mariano
 *
 */
@Service
public class NovedadesServices {

	/**
	 * Segun la fecha actual
	 * @return
	 */
	public NovedadesResponse getNovedad(){
		
		List<String> novedades = new ArrayList<String>();
		
		String novedad = "UM Informa: V Jornadas de Ciencia y Tecnologia - " +
				 		 "Desde el Lunes 25/08/2014 " +
				 		 "al Sabado 30/08/2014";
		
		novedades.add( novedad );
		
		return new NovedadesResponse( novedades );
		
	}
	
}
