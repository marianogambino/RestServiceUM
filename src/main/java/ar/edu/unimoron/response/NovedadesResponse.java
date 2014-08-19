/**
 * 
 */
package ar.edu.unimoron.response;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mariano
 *
 */
public class NovedadesResponse {

	public NovedadesResponse(List<String> novedades){
		this.novedades = novedades;
	}
	
	private List<String> novedades = new ArrayList<String>();

	/**
	 * @return the novedades
	 */
	public List<String> getNovedades() {
		return novedades;
	}

	/**
	 * @param novedades the novedades to set
	 */
	public void setNovedades(List<String> novedades) {
		this.novedades = novedades;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "NovedadesResponse [novedades=" + novedades + "]";
	}

	
	
	
	
}
