 //Nome: mateus Moreira Fonseca - RA: 1426885
 public abstract class Conta {
    public String numero;
    private float saldo;
    private String senha;
    public String agencia ;

    public Conta(String numero,String agencia,String senha,float saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.senha = senha;
        this.saldo = saldo;
        
        
    }

    public String getNumero() {
        return numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void depositar(float valor) {
        saldo += valor;
    }

    public boolean sacar(float valor) {
        if (valor <= saldo) {
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transferir(Conta destino, float valor) {
        if (valor <= saldo) {
            saldo -= valor;
            destino.depositar(valor);
            return true;
        } else {
            return false;
        }
    }

    public float getSaldoDisponivel() {
        return saldo;
    }

    public String getAgencia() {
        return agencia;
    }
    public String getSenha() {
        return senha;
    }

}
