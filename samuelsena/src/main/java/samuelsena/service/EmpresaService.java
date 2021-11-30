package samuelsena.service;

import java.util.List;

import samuelsena.domain.Empresa;

public interface EmpresaService {
	
	void salvar(Empresa empresa);
	
	void editar(Empresa empresa);
	
	void excluir(Long id);
	
	Empresa buscarPorId(Long id);
	
	List<Empresa> buscarTodos();

	boolean departamentoTemProfissoes(Long id);

	boolean empresaTemProfissoes(Long id);


}
