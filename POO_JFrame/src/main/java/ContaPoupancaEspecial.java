//Nome: Mateus Moreira Fonseca - RA: 1426885

public class ContaPoupancaEspecial extends ContaPoupanca {
    private double limiteCredito;

    public ContaPoupancaEspecial(String numero, String agencia, String senha, double saldo, double juros, double limiteCredito) {
        super(numero, agencia, senha, saldo, juros);
        this.limiteCredito = limiteCredito;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    // Sobrescrita
    @Override
    public void depositar(double valor) {
        double saldoAtual = getSaldo();
        setSaldo(saldoAtual + valor);
    }

    // Sobrescrita
    @Override
    public boolean sacar(double valor) {
        double saldoAtual = getSaldo();

        if (valor <= saldoAtual || valor <= limiteCredito) {
            if (valor <= saldoAtual) {
                setSaldo(saldoAtual - valor);
            } else {
                double limiteUtilizado = valor - saldoAtual;
                setSaldo(0);
                limiteCredito -= limiteUtilizado;
            }
            return true;
        } else {
            return false;
        }
    }

    // Sobrescrita
    @Override
    public void consultarSaldo() {
        double saldoAtual = getSaldo();
        System.out.println("Saldo atual (Conta Poupança Especial): R$" + saldoAtual);
    }

    // Sobrescrita
    @Override
    public double calcularRendimento() {
        double saldoAtual = getSaldo();
        double juros = getJuros();
        return saldoAtual * (juros / 100);
    }
}
