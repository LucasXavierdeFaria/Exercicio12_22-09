public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        // Cadastrar clientes
        Cliente cliente1 = banco.cadastrarCliente("João Silva", "12345678901");
        Cliente cliente2 = banco.cadastrarCliente("Maria Oliveira", "98765432100");

        // Abrir contas
        ContaBancaria conta1 = banco.abrirConta(cliente1, 1001);
        ContaBancaria conta2 = banco.abrirConta(cliente2, 1002);

        // Realizar operações
        banco.depositar(conta1, 500);
        banco.sacar(conta1, 100);
        banco.transferir(conta1, conta2, 200);

        // Exibir saldos
        System.out.println("Saldo conta 1: " + conta1.getSaldo());
        System.out.println("Saldo conta 2: " + conta2.getSaldo());
    }
}
