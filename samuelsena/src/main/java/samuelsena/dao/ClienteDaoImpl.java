package samuelsena.dao;

import org.springframework.stereotype.Repository;

import samuelsena.domain.Cliente;

@Repository
public class ClienteDaoImpl extends AbstractDao<Cliente, Long> implements ClienteDao {

}
