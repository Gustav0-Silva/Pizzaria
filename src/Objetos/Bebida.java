package Objetos;

import java.math.BigDecimal;

public class Bebida extends Produto{

    public Bebida(String nome, String descricao, BigDecimal valor, Enum tipo) {
        this.nome = nome;
        this.valor = valor;
        this.descricao = descricao;
        this.tipo = tipo;
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

    public void imprimir() {
        for (Produto produto: listaProdutos) {
            if (produto instanceof Bebida){
                System.out.println("Nome: " + ((Bebida) produto).getNome());
                System.out.println("Descrição: " + ((Bebida) produto).getDescrcao());
                System.out.println("Valor: " + ((Bebida) produto).getValor());
                System.out.println("--------------------------------------");
            }
        }
    }
}


