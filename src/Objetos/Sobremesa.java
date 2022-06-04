package Objetos;

import java.math.BigDecimal;

public class Sobremesa extends Produto{

    public Sobremesa(String nome, String descricao, BigDecimal valor, Enum tipo) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public BigDecimal getValor() {
        return valor;
    }


}
