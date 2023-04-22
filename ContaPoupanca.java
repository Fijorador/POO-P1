 //Nome: mateus Moreira Fonseca - RA: 1426885

 public class ContaPoupanca extends Conta implements Autenticavel {
    private float juros;

    public ContaPoupanca(String numero, String agencia, String senha, float saldo,float juros) {
        super(numero, agencia, senha, saldo);
        this.juros = juros;
    }

    public float getJuros() {
        return juros;
    }

    public void setJuros(float juros) {
        this.juros = juros;
    }

    public float calcularRendimento() {
        return getSaldo() * juros;
    }

    @Override
    public boolean autenticar(String senha) {
        return this.getSenha().equals(senha);
    }
}

