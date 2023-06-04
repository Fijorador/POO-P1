
//Nome: Mateus Moreira Fonseca - RA: 1426885
public class ContaCorrente extends Conta {
    private double limite;
    private double limiteDisponivel;

    public ContaCorrente(String numero, String agencia, String senha, double saldo, double limite,
            double limiteDisponivel) {
        super(numero, agencia, senha, saldo);
        this.limite = limite;
        this.limiteDisponivel = limite;
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
    //Sobrescreita
    @Override
    public void depositar(double valor) {
        double limiteDisponivel = getLimiteDisponivel();
        double limite = getLimite();

        if (limiteDisponivel < limite) {
            double valorRestante = Math.min(valor, limite - limiteDisponivel);
            setLimiteDisponivel(limiteDisponivel + valorRestante);
            valor -= valorRestante;
        }
        setSaldo(getSaldo() + valor);
    }   
    
    //Sobrescrita
    @Override
    public boolean sacar(double valor) {
        double saldoDisponivel = getSaldo() + getLimiteDisponivel();

        if (valor <= saldoDisponivel) {
            if (valor <= getSaldo()) {
                setSaldo(getSaldo() - valor);
            } else {
                double limiteUtilizado = valor - getSaldo();
                setSaldo(0);
                setLimiteDisponivel(getLimiteDisponivel() - limiteUtilizado);

            }
            return true;
        } else {
            return false;
        }
    }
    //Sobrescrita
    @Override
    public void consultarSaldo() {
        double saldoConta = getSaldo();
        double saldoLimite = getLimite();
        double saldoTotal = saldoConta + saldoLimite;
        System.out.println("Saldo atual (Conta Corrente - Saldo em Conta):R$ " + saldoConta);
        System.out.println("Saldo atual (Conta Corrente - Saldo através do Limite):R$ " + saldoLimite);
        System.out.println("Saldo atual (Conta Corrente - Total):R$ " + saldoTotal);
    }

    public boolean transferir(Conta contaDestino, double valor) {
        double saldo = getSaldo();
        if (valor <= saldo) {
            sacar(valor);
            ((ContaCorrente) contaDestino).depositar(valor);
            return true;
        } else {
            return false;
        }
    }
}
