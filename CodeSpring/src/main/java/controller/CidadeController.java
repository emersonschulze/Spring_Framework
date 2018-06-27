package controller;

import model.Cidade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.interfaces.CidadeService;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/cidades")
public class CidadeController {

    @Autowired
    private CidadeService cidadeService;

    /**
     * Método responsável por listar a Tabua Atuarial
     * @return ResponseEntity<List<TabuaAtuarialResponse>>
     */
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Cidade>> buscarCidadesPorEstado (@RequestBody String sigla) {
        return ResponseEntity.ok(cidadeService.ConsultarCidadePorEstadoSigla(sigla));
    }

}
