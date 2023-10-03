/**
 * 
 */
package br.com.mgsystems.dao.jpa;

import br.com.mgsystems.dao.generic.jpa.GenericJpaDAO;
import br.com.mgsystems.domain.jpa.ProdutoJpa;

public class ProdutoJpaDAO extends GenericJpaDAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
