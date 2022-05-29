package Produtos;

import Objetos.ArmazenaDados;
import Objetos.Cliente;
import Objetos.Pizza;

import java.math.BigDecimal;
import java.util.Scanner;

public class CadastrarPizza extends ArmazenaDados {
    public void cadastrarPizza(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o sabor da pizza a ser adicionado ");
        String sabor = scanner.next();
        System.out.println("Digite o valor da pizza ");
        BigDecimal valor = scanner.nextBigDecimal();
        System.out.println(" Qual a descrição do sabor?");
        String descricao = scanner.nextLine();

        Pizza pizza = new Pizza(sabor, descricao, valor);
        listaPizzas.add(pizza);

    }
    public static void imprimir(){
            for(Pizza pizza : listaPizzas) {
                System.out.println("Sabor:"+ pizza.getNome()+
                            " Descrição: "+ pizza.getDescricao() +
                            " Valor: "+ pizza.getValor());

        }
    }
}
