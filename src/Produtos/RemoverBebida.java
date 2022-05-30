package Produtos;

import Objetos.ArmazenaDados;
import Objetos.Bebida;
import Objetos.Pizza;

import java.util.Scanner;

public class RemoverBebida extends ArmazenaDados {

    public static void executar(Scanner sc){

        CadastrarBebida.imprimir();
        System.out.println();

        System.out.println("Digite o nome da bebida que deseja remover: ");
        String nome = sc.nextLine();

        for (Bebida bebida: listaBebidas) {
            if (bebida.getNome().equals(nome)){
                System.out.println("Deseja realmente remover?");
                System.out.println("1 - Sim");
                System.out.println("2 - Não");
                String action = sc.nextLine();

                switch (action){
                    case "1":
                        listaPizzas.remove(bebida);
                        System.out.println();
                        System.out.println("Bebida foi removida com sucesso!");
                        System.out.println();
                        return;
                    case "2":
                        System.out.println();
                        System.out.println("A bebida não foi removida!");
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
