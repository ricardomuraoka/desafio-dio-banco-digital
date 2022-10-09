package banco_digital.domain;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public ContaPoupanca(Cliente cliente, double saldo) {
        super(cliente);
        this.saldo = saldo;
    }

}