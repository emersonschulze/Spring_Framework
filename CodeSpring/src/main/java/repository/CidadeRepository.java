package repository;

import model.Cidade;
import model.Estado;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {

    List<Cidade> findAllByEstadoBySigla(String sigla);
}
