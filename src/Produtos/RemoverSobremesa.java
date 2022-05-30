package Produtos;

import Objetos.ArmazenaDados;
import Objetos.Bebida;
import Objetos.Sobremesa;

import java.util.Scanner;

public class RemoverSobremesa extends ArmazenaDados {

    public static void executar(Scanner sc){
        CadastrarSobremesa.imprimir();
        System.out.println();

        System.out.println("Digite o nome da sobremesa que deseja remover: ");
        String nome = sc.nextLine();

        for (Sobremesa sobremesa: listaSobremesas) {
            if (sobremesa.getNome().equals(nome)){
                System.out.println("Deseja realmente remover?");
                System.out.println("1 - Sim");
                System.out.println("2 - Não");
                String action = sc.nextLine();

                switch (action){
                    case "1":
                        listaPizzas.remove(sobremesa);
                        System.out.println();
                        System.out.println("Sbremesa foi removida com sucesso!");
                        System.out.println();
                        return;
                    case "2":
                        System.out.println();
                        System.out.println("A sobremesa não foi removida!");
                        return;
                    default:
                        System.out.println("Opção inválida");
                        return;
                }
            }
        }
        System.out.println("Não foi encontrada bebida no banco de dados");
    }
}


