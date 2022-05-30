package Produtos;

import Objetos.ArmazenaDados;
import Objetos.Pizza;
import Objetos.Sobremesa;

import java.math.BigDecimal;
import java.util.Scanner;

public class CadastrarSobremesa extends ArmazenaDados {
    public static void cadastrarSobremesa(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a sobremesa a ser adicionada ");
        String sabor = scanner.next();
        System.out.println("Digite o valor da sobremesa ");
        BigDecimal valor = scanner.nextBigDecimal();
        System.out.println(" Qual a descrição da sobremesa?");
        String descricao = scanner.nextLine();

        Sobremesa sobremesa = new Sobremesa(sabor, descricao, valor);
        listaSobremesas.add(sobremesa);

    }
    public static void imprimir(){
        for(Sobremesa sobremesa : listaSobremesas) {
            System.out.println();
            System.out.println("Sabor: " + sobremesa.getNome());
            System.out.println("Descrição: " + sobremesa.getDescricao());
            System.out.println("Valor: " + sobremesa.getValor());
            System.out.println("---------------------------------------");
        }
    }
}
