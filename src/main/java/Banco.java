import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Data
public class Banco {

    private String nome;
    private List<Conta> contas = new ArrayList<>();
    private List<Cliente> clientes;

    public void adiciona(Conta c) {

        this.contas.add(c);

        }


    public void listaClientes() {
        for (Conta conta : this.contas) {
            System.out.println(conta.getCliente());
        }
    }
}



