//Nome: Mateus Moreira Fonseca - RA: 1426885

public class ContaPoupancaEspecial extends ContaPoupanca {

    private double limite;
    private double limiteDisponiel;

    public ContaPoupancaEspecial(String numero, String agencia, String senha, double saldo, double juros, double limite, double limiteDisponivel) {
        super(numero, agencia, senha, saldo, juros);
        this.limite = limite;
        this.limiteDisponiel = limiteDisponivel;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimiteCredito(double limite) {
        this.limite = limite;
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

    void setLimite(double limite) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
