public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    // Utiliza o método de impressão de conta ImprimirInfosComuns() + caracteristicas especificas de conta corrente.
    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfosComuns();
    }
}