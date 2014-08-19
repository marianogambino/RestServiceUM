/**
 * 
 */
package ar.edu.unimoron.model;

import java.util.Date;

/**
 * @author mariano
 *
 */
public class DiasHora {

	private Date fechaHoraDesde;
	private Date fechaHoraHasta;
	
	
	public DiasHora(Date fechaDesde, Date fechaHasta){
		this.fechaHoraDesde = fechaDesde;
		this.fechaHoraHasta = fechaHasta;
	}
	
	/**
	 * @return the fechaHoraDesde
	 */
	public Date getFechaHoraDesde() {
		return fechaHoraDesde;
	}
	/**
	 * @param fechaHoraDesde the fechaHoraDesde to set
	 */
	public void setFechaHoraDesde(Date fechaHoraDesde) {
		this.fechaHoraDesde = fechaHoraDesde;
	}
	/**
	 * @return the fechaHoraHasta
	 */
	public Date getFechaHoraHasta() {
		return fechaHoraHasta;
	}
	/**
	 * @param fechaHoraHasta the fechaHoraHasta to set
	 */
	public void setFechaHoraHasta(Date fechaHoraHasta) {
		this.fechaHoraHasta = fechaHoraHasta;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DiasHora [fechaHoraDesde=" + fechaHoraDesde
				+ ", fechaHoraHasta=" + fechaHoraHasta + "]";
	}
	
	
	
	
}
