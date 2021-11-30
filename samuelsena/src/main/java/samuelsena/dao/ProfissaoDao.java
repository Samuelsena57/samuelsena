package samuelsena.dao;

import java.util.List;

import samuelsena.domain.Profissao;


public interface ProfissaoDao {
	
	void save (Profissao profissao);
	
	void update(Profissao Profissao);
	
	void delete(Long id);
	
	Profissao findById(Long id);
	
	List<Profissao> findAll();

}
