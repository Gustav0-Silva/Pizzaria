package Produtos;

import Objetos.ArmazenaDados;
import Objetos.Pizza;

import java.util.Scanner;

public class RemoverPizza extends ArmazenaDados {

    public static void executar(Scanner sc){

        CadastrarPizza.imprimir();
        System.out.println();

        System.out.println("Digite o nome da pizza que deseja remover: ");
        String nome = sc.nextLine();

        for (Pizza pizza: listaPizzas) {
            if (pizza.getNome().equals(nome)){
                System.out.println("Deseja realmente remover?");
                System.out.println("1 - Sim");
                System.out.println("2 - Não");
                String action = sc.nextLine();

                switch (action){
                    case "1":
                        listaPizzas.remove(pizza);
                        System.out.println();
                        System.out.println("Pizza foi removida com sucesso!");
                        System.out.println();
                        return;
                    case "2":
                        System.out.println();
                        System.out.println("A pizza não foi removida!");
                        return;
                    default:
                        System.out.println("Opção inválida");
                        return;
                }
            }
        }
        System.out.println("Não foi encontrada pizza com este nome no banco de dados");
    }

}
