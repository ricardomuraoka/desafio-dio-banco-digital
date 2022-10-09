package banco_digital;

import banco_digital.domain.*;
import banco_digital.helpers.CriaDatabase;

import java.util.List;

// Desafio 1: estender o dominio, com novas classes, atributos e métodos
// Incluir o Lombok ao código para reduzir sua verbosidade de código.
public class Main {

    public static void main(String[] args) {

        Banco banco = new Banco("Banco Java");
        new CriaDatabase().criaClientes(banco);
        List<Cliente> clientes = banco.getClientes();
        new CriaDatabase().criaContaPoupanca(banco);
        new CriaDatabase().criaContaCorrente(banco);
        List<Conta> contas = banco.getContas();

        banco.listaClientes();
    }

}