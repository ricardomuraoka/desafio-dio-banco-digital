import lombok.Data;

import java.util.Scanner;

@Data
public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;


    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    // Adiciona agencia padrão, um número sequencial, e solicita o Nome de CPF do cliente
    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        cliente.setNome(leitor.nextLine());
        this.cliente = cliente;
        System.out.println("Digite seu cpf: ");
        cliente.setCpf(leitor.nextLine());
    }
    // Método saca retira determinado valor do valor total do saldo
    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    // Método deposita adiciona determinado valor do valor total do saldo
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

    // Imprime as informações de conta
    protected void imprimirInfosComuns() {
        System.out.printf("Titular: %s%n", this.cliente.getNome());
        System.out.printf("Agencia: %d%n", this.agencia);
        System.out.printf("Numero: %d%n", this.numero);
        System.out.printf("Saldo: %.2f%n", this.saldo);
    }
}