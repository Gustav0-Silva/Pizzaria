package Objetos;

import java.math.BigDecimal;

public class Bebida {

    private String nome;
    private BigDecimal valor;

    private String descricao;

    public Bebida(String nome, BigDecimal valor, String descricao) {
        this.nome = nome;
        this.valor = valor;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getDescrcao() {
        return descricao;
    }

    public void setDescrcao(String descrcao) {
        this.descricao = descrcao;
    }
}
