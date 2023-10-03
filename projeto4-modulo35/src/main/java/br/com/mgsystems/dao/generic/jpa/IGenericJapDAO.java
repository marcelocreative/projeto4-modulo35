/**
 * 
 */
package br.com.mgsystems.dao.generic.jpa;

import java.io.Serializable;
import java.util.Collection;

import br.com.mgsystems.dao.Persistente;
import br.com.mgsystems.exceptions.DAOException;
import br.com.mgsystems.exceptions.MaisDeUmRegistroException;
import br.com.mgsystems.exceptions.TableException;
import br.com.mgsystems.exceptions.TipoChaveNaoEncontradaException;

public interface IGenericJapDAO <T extends Persistente, E extends Serializable> {

    public T cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    public void excluir(T entity) throws DAOException;

    public T alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    public T consultar(E id) throws MaisDeUmRegistroException, TableException, DAOException;

    public Collection<T> buscarTodos() throws DAOException;
}
