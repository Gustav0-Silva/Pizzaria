package Objetos;

import java.math.BigDecimal;

public class Produto extends ArmazenaDados {

    protected String nome;
    protected String descricao;
    protected BigDecimal valor;
    protected Enum tipo;

    public Produto(String nome, String descricao, BigDecimal valor, Enum tipo) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.tipo = tipo;
    }

    public Produto() {
    }
}
