/**
 * 
 */
package ar.edu.unimoron.response;

/**
 * @author mariano
 *
 */
public class AulaResponse {

	public AulaResponse ( String aula){
		this.aula = aula;
	}
	
	public String aula;

	/**
	 * @return the aula
	 */
	public String getAula() {
		return aula;
	}

	/**
	 * @param aula the aula to set
	 */
	public void setAula(String aula) {
		this.aula = aula;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AulaResponse [aula=" + aula + "]";
	}
	
	
	
}
