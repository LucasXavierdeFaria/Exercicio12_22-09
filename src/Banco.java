import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Cliente> clientes;
    private List<ContaBancaria> contas;

    public Banco() {
        this.clientes = new ArrayList<>();
        this.contas = new ArrayList<>();
    }

    // Cadastrar Cliente
    public Cliente cadastrarCliente(String nome, String cpf) {
        Cliente cliente = new Cliente(nome, cpf);
        clientes.add(cliente);
        return cliente;
    }

    // Abrir Conta Bancária
    public ContaBancaria abrirConta(Cliente cliente, int numeroConta) {
        ContaBancaria conta = new ContaBancaria(numeroConta, cliente);
        contas.add(conta);
        return conta;
    }

    // Operações Bancárias: Saque, Depósito, Transferência
    public boolean sacar(ContaBancaria conta, double valor) {
        return conta.sacar(valor);
    }

    public void depositar(ContaBancaria conta, double valor) {
        conta.depositar(valor);
    }

    public boolean transferir(ContaBancaria contaOrigem, ContaBancaria contaDestino, double valor) {
        return contaOrigem.transferir(contaDestino, valor);
    }

    // Encontrar Conta por Número
    public ContaBancaria encontrarContaPorNumero(int numeroConta) {
        for (ContaBancaria conta : contas) {
            if (conta.getNumero() == numeroConta) {
                return conta;
            }
        }
        return null;
    }
}
