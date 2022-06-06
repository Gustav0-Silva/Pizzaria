package Produtos;

import Objetos.ArmazenaDados;
import Objetos.Produto;

import java.util.Scanner;

public interface IConfirmaRemover {
    public static boolean confirmaRemover(Scanner sc) {
        System.out.println("Deseja realmente remover?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        String action = sc.nextLine();

        switch (action){
            case "1":
                return true;
            case "2":
                return false;
            default:
                System.out.println("Opção inválida");
                confirmaRemover(sc);
        }
        return false;
    }
}
