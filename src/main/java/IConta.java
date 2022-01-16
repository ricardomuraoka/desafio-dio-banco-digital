// "Contratos" - Interface implementa as regras que serão aplicadas a quem implementar a interface.
public interface IConta {

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, IConta contaDestino);

    void imprimirExtrato();
}