package br.com.mgsystems.dao;

/**
 * Classe que representa todas as entidades ou objetos da aplica��o que seram salvas no banco de dados
 */
public interface Persistente {

    //public Long getCodigo();
	
	public Long getId();
	
	public void setId(Long id);
}
