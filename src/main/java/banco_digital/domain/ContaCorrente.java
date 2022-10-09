package banco_digital.domain;

import banco_digital.helpers.Listagem;

public class ContaCorrente extends Conta {

    /**
     * Construtor
     * @param cliente o Cliente que abrirá a conta
     */

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public ContaCorrente(Cliente cliente, double saldo) {
        super(cliente);
        this.saldo = saldo;
    }

}