package banco_digital.domain;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    // Utiliza o método de impressão de conta ImprimirInfosComuns() + caracteristicas especificas de conta corrente.
    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato dominio.Conta Corrente ===");
        super.imprimirInfosComuns();
    }

}