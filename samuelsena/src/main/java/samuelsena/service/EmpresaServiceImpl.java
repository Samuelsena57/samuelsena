package samuelsena.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import samuelsena.dao.EmpresaDao;
import samuelsena.domain.Empresa;

@Service
public class EmpresaServiceImpl implements EmpresaService {

    @Autowired
    private EmpresaDao dao;

    @Override
    @Transactional(readOnly = false)
    public void salvar(Empresa empresa) {
        dao.save(empresa);

    }

    @Override
    @Transactional(readOnly = false)
    public void editar(Empresa empresa) {
        dao.update(empresa);

    }

    @Override
    @Transactional(readOnly = false)
    public void excluir(Long id) {
        dao.delete(id);

    }

    @Override
    @Transactional(readOnly = true)
    public Empresa buscarPorId(Long id) {

        return dao.findById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Empresa> buscarTodos() {

        return dao.findAll();
    }

    @Override
    public boolean empresaTemProfissoes(Long id) {

        if (buscarPorId(id).getProfissoes().isEmpty()) {
            return false;
        }
        return true;
    }

	@Override
	public boolean departamentoTemProfissoes(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

}