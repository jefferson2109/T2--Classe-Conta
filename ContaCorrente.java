public class ContaCorrente {
    String nome;
    String conta;
    String agencia;
    double saldo;
    int limiteCredito;

    
    public boolean realizarSaque(double quantiaASacar) {
        if (saldo >= quantiaASacar) {
            saldo -= quantiaASacar; 
            return true; 
        } else {
            if (limiteCredito > 0) {
                double limite = limiteCredito + saldo;
                if (limite >= quantiaASacar) {
                    saldo -= quantiaASacar; 
                    return true; 
                } else {
                    return false; 
                }
            } else {
                return false; 
            }
        }
    }

  
    public void depositar(double valorDepositado) {
        if (valorDepositado > 0) {
            saldo += valorDepositado;
        } else {
            System.out.println("Valor do depósito deve ser positivo.");
        }
    }

    
    public void consultarSaldo() {
        System.out.println("Saldo atual da conta " + conta + " (" + nome + ") = " + saldo);
    }

    
    public boolean transferir(ContaCorrente contaDestino, double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor; 
            contaDestino.saldo += valor;  
            return true;
        }
        return false; 
    }
}
