package Produtos;

import Objetos.*;

import java.math.BigDecimal;
import java.net.PortUnreachableException;

public class CadastrarExemplos extends ArmazenaDados {

    public static void cadastrarAdmin(){
        Cliente cliente = new Cliente("", "admin", "admin", "",0, "");
        listaClientes.add(cliente);
    }
    public static void cadastrarBebida(){
        Bebida bebida = new Bebida("Coca-Cola", BigDecimal.valueOf(5), "Lata 350ml");
        listaBebidas.add(bebida);
        bebida = new Bebida("Fanta", BigDecimal.valueOf(5), "Lata 350ml");
        listaBebidas.add(bebida);
        bebida = new Bebida("Sprite", BigDecimal.valueOf(5), "Lata 350ml");
        listaBebidas.add(bebida);
    }
    public static void cadastrarPizza(){
        Pizza pizza = new Pizza("ALHO E ÓLEO", "Mussarela e alho frito", BigDecimal.valueOf(30));
        listaPizzas.add(pizza);
        pizza = new Pizza("5 QUEIJOS", "Mussarela, provolone, parmesão gorgonzola e queijo tipo catupiry", BigDecimal.valueOf(30));
        listaPizzas.add(pizza);
        pizza = new Pizza("LOMBO E CHAMPIGNON", "Mussarela, lombo e champignon", BigDecimal.valueOf(30));
        listaPizzas.add(pizza);

    }
    public static void cadastrarSobremesa(){
        Sobremesa sobremesa = new Sobremesa("MINEIRO DE BOTAS", "Mussarela, banana, fatias de goiabada, açúcar e canela",BigDecimal.valueOf(20) );
        listaSobremesas.add(sobremesa);
        sobremesa = new Sobremesa("CARTOLA", "Mussarela, banana, açúcar e canela",BigDecimal.valueOf(20) );
        listaSobremesas.add(sobremesa);
        sobremesa = new Sobremesa("GOIABADA", "Doce de leite, mussarela e fatias de goiabada",BigDecimal.valueOf(20) );
        listaSobremesas.add(sobremesa);

    }

    public static void cadastrarCliente(){
        Cliente cliente = new Cliente("Gustavo","gSilva","123","Rua Joao Jose", 2,"987955585");
        listaClientes.add(cliente);
    }

    public static void cadastrarExemplos(){
        cadastrarCliente();
        cadastrarPizza();
        cadastrarBebida();
        cadastrarSobremesa();
        cadastrarAdmin();
    }

}
