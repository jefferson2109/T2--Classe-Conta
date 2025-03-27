public class RealizandoProcessos {
    public static void main(String[] args) {
        
        ContaCorrente conta1 = new ContaCorrente();
        ContaCorrente conta2 = new ContaCorrente();

       
        conta1.nome = "Enzo";
        conta1.conta = "155878";
        conta1.agencia = "1654";
        conta1.limiteCredito = 1000;
        conta1.saldo = 2000;

        
        conta2.nome = "Sebastiana";
        conta2.conta = "987654";
        conta2.agencia = "1654";
        conta2.limiteCredito = 500;
        conta2.saldo = 1000;

       
        conta1.consultarSaldo();
        conta2.consultarSaldo();

       
        boolean saqueEfetuado = conta1.realizarSaque(100);
        if (saqueEfetuado) {
            System.out.println("Saque efetuado com sucesso na conta de " + conta1.nome);
            conta1.consultarSaldo();
        } else {
            System.out.println("Não foi possível realizar saque, saldo insuficiente na conta de " + conta1.nome);
        }

       
        System.out.println("Realizando depósito de 500 reais na conta de " + conta1.nome + "...");
        conta1.depositar(500);
        conta1.consultarSaldo();

       
        boolean transferenciaEfetuada = conta1.transferir(conta2, 500);
        if (transferenciaEfetuada) {
            System.out.println("Transferência de 500 reais de " + conta1.nome + " para " + conta2.nome + " efetuada com sucesso!");
        } else {
            System.out.println("Não foi possível realizar a transferência. Saldo insuficiente na conta de " + conta1.nome);
        }

       
        conta1.consultarSaldo();
        conta2.consultarSaldo();
    }
}
