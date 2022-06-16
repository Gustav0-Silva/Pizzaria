package Objetos;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public abstract class ArmazenaDados{

        protected static List<Produto> pedidosTemp = new ArrayList<>();
        protected static List<ProdutosVendidos> listaVendidos = new ArrayList<>();
        protected static List<Produto> listaProdutos = new ArrayList<>();
        protected static Hashtable<String,Cliente> logins =new Hashtable<>();

}
