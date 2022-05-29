package Produtos;

import Objetos.ArmazenaDados;
import Objetos.Bebida;

import java.math.BigDecimal;
import java.util.Scanner;

public class CadastrarBebida extends ArmazenaDados {
        public void cadastrarBebida(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite a bebida a ser adicionada ");
            String sabor = scanner.next();
            System.out.println("Digite o valor da bebida ");
            BigDecimal valor = scanner.nextBigDecimal();
            System.out.println(" Qual a descrição da bebida?");
            String descricao = scanner.nextLine();

            Bebida bebida = new Bebida(sabor, valor, descricao);
            listaBebidas.add(bebida);

}
}
