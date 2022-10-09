package banco_digital.helpers;

import banco_digital.domain.Banco;
import banco_digital.domain.Cliente;
import banco_digital.domain.ContaCorrente;
import banco_digital.domain.ContaPoupanca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Classe para criar uma lista de Cliente e contas no próprio código (simulando dados vindo de um banco de dados)
 */
public class CriaDatabase {
    public void criaClientes(Banco b) {
        b.adicionaCliente(new Cliente("Ricardo", "153.319.850-09"));
        b.adicionaCliente(new Cliente("Joao", "407.293.750-99"));
        b.adicionaCliente(new Cliente("Marcelo", "388.799.110-90"));
        b.adicionaCliente(new Cliente("Sonia", "349.493.670-64"));
        b.adicionaCliente(new Cliente("Margarete", "645.539.370-85"));
    }

    public void criaContaPoupanca(Banco b) {
            for (Cliente cliente: b.getClientes()) {
                b.adicionaConta(new ContaPoupanca(cliente));
        }
    }


    public void criaContaCorrente(Banco b) {
        for (Cliente cliente: b.getClientes()) {
            b.adicionaConta(new ContaCorrente(cliente));
        }
    }
}
