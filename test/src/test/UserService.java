package test;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

@Stateless
public class UserService {
	@PersistenceContext(unitName="Items")
	private EntityManager em;

	public List<User> getAllUsers(){
		TypedQuery<User> query =em.createQuery("Select u From User u",User.class);
		List<User> users=query.getResultList();
		return users;
		
	}
}
