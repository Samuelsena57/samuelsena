package samuelsena.web.conversor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import samuelsena.domain.Empresa;
import samuelsena.service.EmpresaService;

@Component
public class StringToEmpresaConverter implements Converter<String, Empresa> {

    @Autowired
    private EmpresaService service;

    @Override
    public Empresa convert(String text) {
        if (text.isEmpty()) {
            return null;
        }
        Long id = Long.valueOf(text);
        return service.buscarPorId(id);
    }

}