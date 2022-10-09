package banco_digital.domain;

import lombok.Data;

import java.util.Scanner;

@Data
public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int sequencial = 1;


    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    /**
     * Primeiro construtor
     * Adiciona agencia padrão, um número sequencial, e solicita o Nome de CPF do cliente
     * @param cliente
     */
    protected Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = sequencial++;
        this.cliente = cliente;
    }

    /**
     * Segundo construtor
     * Adiciona agencia padrão, um número sequencial, e solicita o Nome de CPF do cliente, e o valor inicial
     * @param cliente o Cliente que abrirá a conta
     * @param saldo o saldo inicial da conta
     */
    protected Conta(Cliente cliente, double saldo) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = sequencial++;
        this.cliente = cliente;
        this.saldo = saldo;
    }
    // Método saca retira determinado valor do valor total do saldo
    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    // Método deposita adicionaConta determinado valor do valor total do saldo
    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    // Método transferir retira determinado valor de uma conta e deposite em outra, utilizando os métodos
    // sacar e depositar anteriores.
    @Override
    public void transferir(double valor, IConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public String toString() {
        return String.format("Titular: %-20s Agencia: %-5d Numero: %-4d Saldo: %-6.2f", this.cliente.getNome(),
                this.agencia, this.numero, this.saldo);
    }
}