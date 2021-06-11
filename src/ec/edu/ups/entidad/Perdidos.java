package ec.edu.ups.entidad;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Perdidos
 *
 */
@Entity

public class Perdidos implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int numero;
	private Date fecha;
	private String nombreCliente;
	private double subtotal;
	private double iva;
	private double total;
	private String obeservacion;
	private TarjetaCredito tarjeta;
	
	public Perdidos() {
		super();
	}

	
	public Perdidos(int numero, Date fecha, String nombreCliente, double subtotal, double iva, double total,
			String obeservacion, TarjetaCredito tarjeta) {
		super();
		this.numero = numero;
		this.fecha = fecha;
		this.nombreCliente = nombreCliente;
		this.subtotal = subtotal;
		this.iva = iva;
		this.total = total;
		this.obeservacion = obeservacion;
		this.tarjeta = tarjeta;
	}


	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public double getIva() {
		return iva;
	}

	public void setIva(double iva) {
		this.iva = iva;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getObeservacion() {
		return obeservacion;
	}

	public void setObeservacion(String obeservacion) {
		this.obeservacion = obeservacion;
	}
	
	
	

	public TarjetaCredito getTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(TarjetaCredito tarjeta) {
		this.tarjeta = tarjeta;
	}


	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
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
		Perdidos other = (Perdidos) obj;
		if (numero != other.numero)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Perdidos [numero=" + numero + ", fecha=" + fecha + ", nombreCliente=" + nombreCliente + ", subtotal="
				+ subtotal + ", iva=" + iva + ", total=" + total + ", obeservacion=" + obeservacion + "]";
	}
   
	
}
