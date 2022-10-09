package banco_digital.helpers;

import banco_digital.domain.Banco;
import banco_digital.domain.Cliente;

public class Listagem {
    public void listaClientes(Banco b) {
        for (Cliente cliente :  b.getClientes()) {
            System.out.println(cliente);
        }
    }
}
