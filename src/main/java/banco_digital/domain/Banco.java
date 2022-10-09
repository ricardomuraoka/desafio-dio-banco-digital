package banco_digital.domain;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Data
public class Banco {

    private String nome;
    private List<Conta> contas = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();

    /**
     * Construtor básico
     * @param nome o nome que será dado ao banco
     */
    public Banco(String nome) {
        this.nome = nome;
    }

    /**
     * Adiciona nova conta
     * @param c a Conta que será adicionada
     */
    public void adicionaConta(Conta c) {
        this.contas.add(c);
        }

    /**
     * Adiciona novo Cliente
     * @param c Cliente que será adicionada
     */
    public void adicionaCliente(Cliente c) {
        this.clientes.add(c);
    }


    /**
     * Imprime os clientes do banco
     */
    public void listaClientes() {
        for (Cliente cliente : this.clientes) {
            System.out.println(cliente);
        }
    }
}



