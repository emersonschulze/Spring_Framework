package model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "cidade")
public class Cidade  implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    //@SequenceGenerator(name="Sequence", sequenceName="sq_cidade", allocationSize=1)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_Cidade")
    private long id;

    @Column(name = "DESCRICAO")
    private String descricao;

    @Column(name = "SIGLA")
    private String sigla;

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_ESTADO_ID")
    private Estado estado;

    public Cidade() {
    }

    public Cidade(Cidade cidade) {
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

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}