package ActionAdm;

import Objetos.*;

import java.math.BigDecimal;

public class CadastrarExemplos extends ArmazenaDados {

    public static void cadastrarAdmin(){
        Cliente cliente = new Cliente("", "admin", "admin", "",0, "");
        logins.put(cliente.getSenha(), cliente);
    }
    public static void cadastrarBebida(){
        Produto bebida = new Produto("Coca-Cola", "Lata 350ml",BigDecimal.valueOf(5), TipoProduto.BEBIDA);
        listaProdutos.add(bebida);
        bebida = new Produto("Fanta", "Lata 350ml", BigDecimal.valueOf(5), TipoProduto.BEBIDA);
        listaProdutos.add(bebida);
        bebida = new Produto("Sprite", "Lata 350ml", BigDecimal.valueOf(5), TipoProduto.BEBIDA);
        listaProdutos.add(bebida);
    }
    public static void cadastrarPizza(){
        Produto pizza = new Produto("ALHO E ÓLEO", "Mussarela e alho frito", BigDecimal.valueOf(30), TipoProduto.PIZZA);
        listaProdutos.add(pizza);
        pizza = new Produto("5 QUEIJOS", "Mussarela, provolone, parmesão gorgonzola e queijo tipo catupiry", BigDecimal.valueOf(30),TipoProduto.PIZZA);
        listaProdutos.add(pizza);
        pizza = new Produto("LOMBO E CHAMPIGNON", "Mussarela, lombo e champignon", BigDecimal.valueOf(30),TipoProduto.PIZZA);
        listaProdutos.add(pizza);

    }
    public static void cadastrarSobremesa(){
        Produto sobremesa = new Produto("MINEIRO DE BOTAS", "Mussarela, banana, fatias de goiabada, açúcar e canela",BigDecimal.valueOf(20), TipoProduto.SOBREMESA);
        listaProdutos.add(sobremesa);
        sobremesa = new Produto("CARTOLA", "Mussarela, banana, açúcar e canela",BigDecimal.valueOf(20), TipoProduto.SOBREMESA );
        listaProdutos.add(sobremesa);
        sobremesa = new Produto("GOIABADA", "Doce de leite, mussarela e fatias de goiabada",BigDecimal.valueOf(20), TipoProduto.SOBREMESA );
        listaProdutos.add(sobremesa);

    }

    public static void cadastrarCliente(){
        Cliente cliente = new Cliente("Gustavo","gSilva","123","Rua Joao Jose", 2,"987955585");
        logins.put(cliente.getSenha(), cliente);
    }

    public static void cadastrarExemplos(){
        cadastrarCliente();
        cadastrarPizza();
        cadastrarBebida();
        cadastrarSobremesa();
        cadastrarAdmin();
        cadastrarVenda();
    }

    public static void cadastrarVenda(){
        Produto pizza = listaProdutos.get(0);
        Produto bebida = listaProdutos.get(5);
        Cliente cliente = logins.get(0);
        pedidosTemp.add(pizza);
        pedidosTemp.add(bebida);
        ProdutosVendidos vendidos = new ProdutosVendidos(cliente,pedidosTemp,"Débito",BigDecimal.valueOf(35));
        listaVendidos.add(vendidos);
        pedidosTemp.clear();

        pizza = listaProdutos.get(1);
        bebida = listaProdutos.get(4);
        cliente = logins.get(0);
        pedidosTemp.add(pizza);
        pedidosTemp.add(bebida);
        vendidos = new ProdutosVendidos(cliente,pedidosTemp,"Débito",BigDecimal.valueOf(35));
        listaVendidos.add(vendidos);
        pedidosTemp.clear();

    }

}
