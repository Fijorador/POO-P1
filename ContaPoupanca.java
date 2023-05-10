
//Nome: mateus Moreira Fonseca - RA: 1426885
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
        return getSaldo() * (getJuros()/100);
    }
   
    //Sobrescrita
    @Override
    public void depositar(double valor) {
        setSaldo(getSaldo() + valor);
        System.out.println("Depósito realizado: R$" + valor);

    }

    //Sobrescrita
    @Override
    public boolean sacar(double valor) {
        if (valor <= getSaldo()) {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque realizado: R$" + valor);
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
        return true;
    }

    //Sobrescrita
    @Override
    public void consultarSaldo() {
        System.out.println("Saldo atual(Poupanca): R$" + getSaldo());
    }
}
