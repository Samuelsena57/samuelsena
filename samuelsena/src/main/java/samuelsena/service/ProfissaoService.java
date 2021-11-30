package samuelsena.service;

import java.util.List;

import samuelsena.domain.Profissao;

public interface ProfissaoService {
	
	void salvar(Profissao profissao);
	
	void editar(Profissao profissao);
	
	void excluir(Long id);
	
	Profissao buscarPorId(Long id);
	
	List<Profissao> buscartodos();

	//boolean cargoTemCliente(Long id);

	boolean profissaoTemCliente(Long id);

}
