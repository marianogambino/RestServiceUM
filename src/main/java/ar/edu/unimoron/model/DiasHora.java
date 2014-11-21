/**
 * 
 */
package ar.edu.unimoron.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author mariano
 *
 */
@Entity
@Table(name="DIASHORA")
public class DiasHora {

	private Long id;
	private String dia;
	private Date fechaHoraDesde;
	private Date fechaHoraHasta;
	
	
	public DiasHora(){
		
	}
	
	public DiasHora(String dia , Date fechaDesde, Date fechaHasta){
		this.dia = dia;
		this.fechaHoraDesde = fechaDesde;
		this.fechaHoraHasta = fechaHasta;
	}
	
	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID" , nullable=false)
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
	 * @return the dia
	 */
	@Column(name="DIA" , nullable = false)
	public String getDia() {
		return dia;
	}

	/**
	 * @param dia the dia to set
	 */
	public void setDia(String dia) {
		this.dia = dia;
	}
	
	/**
	 * @return the fechaHoraDesde
	 */
	@Column(name="HORADESDE" , nullable = false)
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
	@Column(name="HORAHASTA" , nullable = false)
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
		return "DiasHora [id=" + id + ", dia=" + dia + ", fechaHoraDesde="
				+ fechaHoraDesde + ", fechaHoraHasta=" + fechaHoraHasta + "]";
	}
	
}
