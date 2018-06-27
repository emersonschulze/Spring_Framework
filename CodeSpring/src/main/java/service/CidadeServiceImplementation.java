package service;

import model.Cidade;
import model.Estado;
import org.springframework.beans.factory.annotation.Autowired;
import repository.CidadeRepository;
import repository.EstadoRepository;
import service.interfaces.CidadeService;
import service.interfaces.EstadoService;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class CidadeServiceImplementation implements CidadeService {

    @Autowired
    private CidadeRepository cidadeRepository;

    @Override
    public List<Cidade> ConsultarCidadePorEstadoSigla(String sigla) {
        List<Cidade> cidadesPorEstado = cidadeRepository.findAllByEstadoBySigla(sigla);
        return cidadesPorEstado.stream().map(Cidade::new).collect(toList());
    }
}
