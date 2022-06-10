package Telas;

import Produtos.*;

import java.util.Scanner;

public class Administrador {

    public void executar(Scanner scanner){

        boolean ciclo = true;

        do {

        System.out.println();
        System.out.println("Bem vindo a interface de adminsitração");
        System.out.println("O que deseja fazer?");
        System.out.println("1 - Cadastrar um produto");
        System.out.println("2 - Remover um produto");
        System.out.println("3 - Exibir relatórios");
        System.out.println("3 - Sair do sistema");

        String action = scanner.nextLine();

        switch (action){
            case "1":
                CadastrarProduto cad = new CadastrarProduto();
                cad.executar(scanner);
                break;
            case "2":
                RemoverProduto remove = new RemoverProduto();
                remove.executar(scanner);
                break;
            case "3":
                ExibirRelatorios.executar(scanner);
                break;
            case "4":
                System.out.println("Saindo do sistema...");
                ciclo = false;
                break;
        }
        }while (ciclo);
    }
}
