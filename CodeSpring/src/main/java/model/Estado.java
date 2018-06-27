package model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import com.google.common.collect.Lists;

@Entity
@Table(name = "estado")
public class Estado  implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    //@SequenceGenerator(name="Sequence", sequenceName="sq_estado", allocationSize=1)
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="ID_ESTADO")
    private long id;

    @Column(name="DESCRICAO")
    private String descricao;

    @Column(name="SIGLA")
    private String sigla;

    @OrderBy("SIGLA ASC")
    @OneToMany(mappedBy="cidade", cascade= CascadeType.ALL)
    private List<Cidade> cidades = Lists.newArrayList();

    public Estado(){
    }

    public Estado(Estado estado) {
    }

    public Cidade addFaixaTabua(Cidade cidade) {
        getCidades().add(cidade);
        cidade.setEstado(this);
        return cidade;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public List<Cidade> getCidades() {
        return cidades;
    }

    public void setCidades(List<Cidade> cidades) {
        this.cidades = cidades;
    }
}
