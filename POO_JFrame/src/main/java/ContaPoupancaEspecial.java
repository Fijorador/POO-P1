//Nome: Mateus Moreira Fonseca - RA: 1426885

public class ContaPoupancaEspecial extends ContaPoupanca {

    private double limite;
    private double limiteDisponivel;

    public ContaPoupancaEspecial(String numero, String agencia, String senha, double saldo, double juros, double limite, double limiteDisponivel) {
        super(numero, agencia, senha, saldo, juros);
        this.limite = limite;
        this.limiteDisponivel = limiteDisponivel;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getLimiteDisponivel() {
        return limiteDisponivel;
    }

    public void setLimiteDisponivel(double limite) {
        this.limiteDisponivel = limite;
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

        if (valor <= saldoAtual || valor <= limite) {
            if (valor <= saldoAtual) {
                setSaldo(saldoAtual - valor);
            } else {
                double limiteUtilizado = valor - saldoAtual;
                setSaldo(0);
                limite -= limiteUtilizado;
            }
            return true;
        } else {
            return false;
        }
    }  

}
