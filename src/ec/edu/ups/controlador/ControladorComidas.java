package ec.edu.ups.controlador;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;
import javax.persistence.*;

import ec.edu.ups.ejb.ComidasFacade;
import ec.edu.ups.entidad.Comidas;

/**
 * Entity implementation class for Entity: ControladorComidas
 *
 */
@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@RequestScoped
public class ControladorComidas implements Serializable {
	@EJB
	private static final long serialVersionUID = 1L;
	private ComidasFacade ejbComidaFacade;
	private int codigo;
	private String nombre;
	private double precioUnitario;

	public ControladorComidas() {
		super();
	}
	private String agregarComidas() {
		Comidas co = null;
		co = ejbComidaFacade.find(nombre);
		if(co==null) {
			Comidas co1 = new Comidas(0, nombre, precioUnitario);
			ejbComidaFacade.create(co1);
			return "Comida Creada";
		}else {
			return "Comida Existente";
		}
	}
	

}
