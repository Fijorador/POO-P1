//Nome: Mateus Moreira Fonseca - RA: 1426885

public class ContaPoupanca extends Conta {

    private double juros;

    public ContaPoupanca(String numero, String agencia, String senha, double saldo, double juros) {
        super(numero, agencia, senha, saldo);
        this.juros = juros;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    public double calcularRendimento() {
        return getSaldo() * (getJuros());
    }

    //Sobrescrita
    @Override
    public void depositar(double valor) {
        setSaldo(getSaldo() + valor);

    }

    //Sobrescrita
    @Override
    public boolean sacar(double valor) throws InvalidaException {
        if (valor <= getSaldo()) {
            setSaldo(getSaldo() - valor);

            return true;
        } else {
            throw new InvalidaException("Saldo insuficiente para realizar o saque.");
        }
    }

}
