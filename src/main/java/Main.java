// Desafio 1: estender o dominio, com novas classes, atributos e métodos
// Incluir o Lombok ao código para reduzir sua verbosidade de código.

public class Main {

    public static void main(String[] args) {
        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");

        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);

        cc.depositar(100);
        cc.transferir(100, poupanca);


        //cc.imprimirInfosComuns();

        //cc.imprimirExtrato();



    }

}