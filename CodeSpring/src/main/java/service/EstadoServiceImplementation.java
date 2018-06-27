package service;

import model.Estado;
import org.springframework.beans.factory.annotation.Autowired;
import repository.EstadoRepository;
import service.interfaces.EstadoService;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class EstadoServiceImplementation implements EstadoService {

    @Autowired
    private EstadoRepository estadoRepository;

    @Override
    public List<Estado> consultarTodos() {
        List<Estado> todosEstados = estadoRepository.findAll();
        return todosEstados.stream().map(Estado::new).collect(toList());
    }
}
