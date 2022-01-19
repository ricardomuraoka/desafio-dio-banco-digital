// Desafio 1: estender o dominio, com novas classes, atributos e métodos
// Incluir o Lombok ao código para reduzir sua verbosidade de código.
public class Main {

    public static void main(String[] args) {

        Banco banco = new Banco();

        Conta cc = new ContaCorrente(new Cliente());
        Conta poupanca = new ContaPoupanca(new Cliente());
        banco.adiciona(cc);
        banco.adiciona(poupanca);
        banco.listaClientes();

        cc.depositar(100);
        cc.transferir(100, poupanca);


        //cc.imprimirInfosComuns();

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}