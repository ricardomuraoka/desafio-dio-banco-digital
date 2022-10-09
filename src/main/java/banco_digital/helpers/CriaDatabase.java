package banco_digital.helpers;

import banco_digital.domain.Banco;
import banco_digital.domain.Cliente;
import banco_digital.domain.ContaCorrente;
import banco_digital.domain.ContaPoupanca;
import org.jetbrains.annotations.NotNull;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

/**
 * Classe para criar uma lista de Cliente e contas no próprio código (simulando dados vindo de um banco de dados)
 */
public class CriaDatabase {
    /**
     * Cria o "banco de dados" de clientes, adicionando-os aos bancos
     * @param b o Banco ao qual os clientes serão adicionados
     */
    public void criaClientes(@NotNull Banco b) {
        b.adicionaCliente(new Cliente("Ricardo", "153.319.850-09"));
        b.adicionaCliente(new Cliente("Joao", "407.293.750-99"));
        b.adicionaCliente(new Cliente("Marcelo", "388.799.110-90"));
        b.adicionaCliente(new Cliente("Sonia", "349.493.670-64"));
        b.adicionaCliente(new Cliente("Margarete", "645.539.370-85"));
    }

    /**
     * Cria o "banco de dados" de Conta poupança, adicionando-os aos bancos
     * @param b o Banco ao qual as contas estarão vinculadas
     */
    public void criaContaPoupanca(@NotNull Banco b) throws NoSuchAlgorithmException {
        Random rand = SecureRandom.getInstanceStrong();
            for (Cliente cliente: b.getClientes()) {
                b.adicionaConta(new ContaPoupanca(cliente, rand.nextDouble(100.00) + 500.00));
        }
    }

    /**
     * Cria o "banco de dados" de Conta Corrente, adicionando-os aos bancos
     * @param b o Banco ao qual as contas estarão vinculadas
     */
    public void criaContaCorrente(@NotNull Banco b) throws NoSuchAlgorithmException {
        Random rand = SecureRandom.getInstanceStrong();
        for (Cliente cliente: b.getClientes()) {
            b.adicionaConta(new ContaCorrente(cliente, rand.nextDouble(100.00) + 500.00));
        }
    }
}
