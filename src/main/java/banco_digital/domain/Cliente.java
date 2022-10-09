package banco_digital.domain;

import lombok.Data;

import java.util.List;

@Data
public class Cliente {
    private String nome;
    private String cpf;

    public Cliente () {
    }
    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return String.format("Cliente: %-15s CPF: %-20s" , getNome(), getCpf());
    }
}