/**
 * 
 */
package br.com.mgsystems.dao.jpa;

import br.com.mgsystems.dao.generic.jpa.GenericJpaDAO;
import br.com.mgsystems.domain.jpa.ClienteJpa;

public class ClienteJpaDAO extends GenericJpaDAO<ClienteJpa, Long> implements IClienteJpaDAO {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
