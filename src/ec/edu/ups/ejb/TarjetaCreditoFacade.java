package ec.edu.ups.ejb;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.entidad.TarjetaCredito;

public class TarjetaCreditoFacade extends AbstractFacade<TarjetaCredito> {

	public TarjetaCreditoFacade() {
		super(TarjetaCredito.class);
		// TODO Auto-generated constructor stub
	}
	@PersistenceContext(unitName = "Sarumeno-David-Examen")

	private EntityManager em;
	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}

}
