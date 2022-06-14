package Objetos;

import java.math.BigDecimal;

public class Cliente {

    private String nome;
    private String login;
    private String senha;
    private String endereco;
    private int bairro;
    private String telefone;
    private String bairroNome;
    private BigDecimal custoEntrega;

    public Cliente(String nome, String login, String senha, String endereco, int bairro, String telefone) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.endereco = endereco;
        this.bairro = bairro;
        this.telefone = telefone;
        this.bairroNome = retornaBairro(bairro);
        this.custoEntrega = retornaCusto(bairro);

    }

    public String getNome() {
        return nome;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getBairro() {
        return bairro;
    }

    public String getBairroNome() {
        return bairroNome;
    }

    public BigDecimal getCustoEntrega() {
        return custoEntrega;
    }

    private BigDecimal retornaCusto(int codBairro){
        if (codBairro == 1 || codBairro == 2) {
            return BigDecimal.valueOf(5);
        } else if (codBairro == 3 || codBairro == 4) {
            return BigDecimal.valueOf(7);
        } else if (codBairro == 5) {
            return BigDecimal.valueOf(10);
        }else{ return null;}
    }
    private String retornaBairro(int codBairro){
        if (codBairro == 1) {
            return "Cidade Industrial";
        } else if (codBairro == 2) {
            return "Fazendinha";
        } else if (codBairro == 3) {
            return "Portão";
        } else if (codBairro == 4) {
            return "Cristo Rei";
        } else if (codBairro == 5) {
            return "Batel";
        }else{ return null;}

    }

}
