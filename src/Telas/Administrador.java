package Telas;

import Produtos.*;

import java.util.Scanner;

public class Administrador {

    public static void executar(Scanner scanner){

        boolean ciclo = true;

        do {



        System.out.println();
        System.out.println("Bem vindo a interface de adminsitração");
        System.out.println("O que deseja fazer?");
        System.out.println("1 - Cadastrar uma nova pizza");
        System.out.println("4 - Remover pizza");
        System.out.println("5 - Remover uma bebida");
        System.out.println("6 - Remover uma sobremesa");
        System.out.println("7 - Sair do sistema");

        String action = scanner.nextLine();

        switch (action){
            case "1":
                CadastrarProduto.executar(scanner);
                break;
            case "2":
                CadastrarBebida.cadastrarBebida();
                break;
            case "3":
                CadastrarSobremesa.cadastrarSobremesa();
                break;
            case "4":
                RemoverPizza.executar(scanner);
                break;
            case "5":
                RemoverBebida.executar(scanner);
                break;
            case "6":
                RemoverSobremesa.executar(scanner);
                break;
            case "7":
                System.out.println("Saindo do sistema...");
                ciclo = false;
                break;
        }
        }while (ciclo);
    }
}
