package banco_digital.helpers;

import banco_digital.domain.*;

public class Listagem {
    /**
     * Lista todos os clientes do banco
     * @param b o banco de onde serão retiradas as informações de clientes.
     */
    public void listaClientes(Banco b) {
        System.out.println("=== Listagem de clientes ===");
        for (Cliente cliente :  b.getClientes()) {
            System.out.println(cliente);
        }
    }

    public void listaInfoConta(Banco b) {
        System.out.println("=== Informações de Conta ===");
        for (Conta conta : b.getContas()) {
            System.out.println(conta);
        }
    }

    /**
     * Utiliza o método de impressão de conta Corrente para as contas Correntes no Banco
     */

    public void imprimirExtratoContaCorrente(Banco b) {
        System.out.println("=== Extrato de Conta Corrente ===");
        for (Conta conta: b.getContas()) {
            if (conta instanceof ContaCorrente)
                System.out.println(conta);
        }
    }

    /**
     * Utiliza o método de impressão de conta Poupança para as contas Poupancas no banco
     */
    public void imprimirExtratoContaPoupanca(Banco b) {
        System.out.println("=== Extrato de Conta Poupanca ===");
        for (Conta conta: b.getContas()) {
            if (conta instanceof ContaPoupanca) {
                System.out.println(conta);
            }
        }
    }

}
