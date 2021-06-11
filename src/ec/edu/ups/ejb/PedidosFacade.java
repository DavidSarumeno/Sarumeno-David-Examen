package ec.edu.ups.ejb;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.entidad.Perdidos;

public class PedidosFacade extends AbstractFacade<Perdidos>{
	public PedidosFacade() {
		super(Perdidos.class);
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
