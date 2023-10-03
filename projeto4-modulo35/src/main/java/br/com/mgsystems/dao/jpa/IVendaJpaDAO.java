
package br.com.mgsystems.dao.jpa;

import br.com.mgsystems.dao.generic.jpa.IGenericJapDAO;
import br.com.mgsystems.domain.jpa.VendaJpa;
import br.com.mgsystems.exceptions.DAOException;
import br.com.mgsystems.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaJpaDAO extends IGenericJapDAO<VendaJpa, Long>{

	public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public VendaJpa consultarComCollection(Long id);
}
