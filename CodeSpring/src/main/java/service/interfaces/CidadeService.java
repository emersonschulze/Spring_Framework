package service.interfaces;

import model.Cidade;

import java.util.List;

public interface CidadeService {

    public List<Cidade> ConsultarCidadePorEstadoSigla(String sigla);

}
