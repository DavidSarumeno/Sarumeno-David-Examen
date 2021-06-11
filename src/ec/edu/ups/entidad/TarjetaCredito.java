package ec.edu.ups.entidad;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: TarjetaCredito
 *
 */
@Entity

public class TarjetaCredito implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String numeroTarjeta;
	private String nombreTitular;
	private String fechaCaducidad;
	private String codigoVerificacion;
	public TarjetaCredito() {
		super();
	}
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}



	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}



	public String getNombreTitular() {
		return nombreTitular;
	}



	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}



	public String getFechaCaducidad() {
		return fechaCaducidad;
	}



	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}



	public String getCodigoVerificacion() {
		return codigoVerificacion;
	}



	public void setCodigoVerificacion(String codigoVerificacion) {
		this.codigoVerificacion = codigoVerificacion;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigoVerificacion == null) ? 0 : codigoVerificacion.hashCode());
		result = prime * result + ((fechaCaducidad == null) ? 0 : fechaCaducidad.hashCode());
		result = prime * result + id;
		result = prime * result + ((nombreTitular == null) ? 0 : nombreTitular.hashCode());
		result = prime * result + ((numeroTarjeta == null) ? 0 : numeroTarjeta.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TarjetaCredito other = (TarjetaCredito) obj;
		if (codigoVerificacion == null) {
			if (other.codigoVerificacion != null)
				return false;
		} else if (!codigoVerificacion.equals(other.codigoVerificacion))
			return false;
		if (fechaCaducidad == null) {
			if (other.fechaCaducidad != null)
				return false;
		} else if (!fechaCaducidad.equals(other.fechaCaducidad))
			return false;
		if (id != other.id)
			return false;
		if (nombreTitular == null) {
			if (other.nombreTitular != null)
				return false;
		} else if (!nombreTitular.equals(other.nombreTitular))
			return false;
		if (numeroTarjeta == null) {
			if (other.numeroTarjeta != null)
				return false;
		} else if (!numeroTarjeta.equals(other.numeroTarjeta))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "TarjetaCredito [id=" + id + ", numeroTarjeta=" + numeroTarjeta + ", nombreTitular=" + nombreTitular
				+ ", fechaCaducidad=" + fechaCaducidad + ", codigoVerificacion=" + codigoVerificacion + "]";
	}
   
	
	
}
