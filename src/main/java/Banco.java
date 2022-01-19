import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Data
public class Banco {

    private String nome;
    private List<Conta> contas = new ArrayList<Conta>();
    private List<Cliente> clientes;

    public void adiciona(Conta c) {
        for (int i = 0; i < this.contas.size(); i++) {
                this.contas.add(c);
            }
        }


    public void listaClientes() {
        for(int i=0;i<contas.size();i++) {
            System.out.println(contas.get(i).getCliente());
        }
    }
}



