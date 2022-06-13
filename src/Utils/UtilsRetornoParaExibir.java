package Utils;

import Objetos.ArmazenaDados;
import Objetos.Cliente;

public class UtilsRetornoParaExibir extends ArmazenaDados {
    public static String retornaNomeBairro(int bairro) {

        if (bairro == 1) {
            return "Cidade Industrial";
        } else if (bairro == 2) {
            return "Fazendinha";
        } else if (bairro == 3) {
            return "Portão";
        } else if (bairro == 4) {
            return "Cristo Rei";
        } else if (bairro == 5) {
            return "Batel";
        }else{ return null;}
    }

}
