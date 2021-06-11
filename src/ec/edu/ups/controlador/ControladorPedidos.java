package ec.edu.ups.controlador;

import java.io.Serializable;
import java.util.Date;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;
import javax.persistence.*;

import ec.edu.ups.ejb.PedidosFacade;
import ec.edu.ups.entidad.Perdidos;
import ec.edu.ups.entidad.TarjetaCredito;

/**
 * Entity implementation class for Entity: ControladorPedidos
 *
 */
@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@RequestScoped
public class ControladorPedidos implements Serializable {

	private static final long serialVersionUID = 1L;

	@EJB
	private PedidosFacade ejbPedidoFacade;
	private Date fecha;
	private String nombreCliente = "";
	private double subtotal = 0.0;
	private double iva = 0.0;
	private double total = 0.0;
	private String obeservacion = "";
	private TarjetaCredito tarjeta;

	public ControladorPedidos() {
		super();
	}
	public String agregarPedido() {
		Perdidos pe= null;
		try {
			pe=ejbPedidoFacade.find(pe.getTarjeta());
			if(pe==null) {
				Perdidos ped = new Perdidos(0, fecha, nombreCliente, subtotal, iva, subtotal, obeservacion, tarjeta);
				ejbPedidoFacade.create(pe);
				return "Pedido Creado";
			}else {
				return "Pedido Existente";
			}
		} catch (Exception e) {
			return "Error Pedido"+e.getMessage();
		}
	}
	
	
	

}
