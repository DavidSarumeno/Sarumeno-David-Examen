package ec.edu.ups.ejb;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.entidad.Comidas;

public class ComidasFacade extends AbstractFacade<Comidas>{
	
	public ComidasFacade() {
		super(Comidas.class);
	}
	@PersistenceContext(unitName = "Sarumeno-David-Examen")
	private EntityManager em;
	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}
	
	
	
	
}
