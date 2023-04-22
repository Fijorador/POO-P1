 //Nome: mateus Moreira Fonseca - RA: 1426885

public class ContaCorrente extends Conta implements Autenticavel {
    private float limite;

    // Construtor que recebe todos os parâmetros
    public ContaCorrente(String numero, String agencia, String senha, float saldo, float limite) {
        super(numero, agencia, senha, saldo);
        this.limite = limite;
    }

    // Construtor que recebe apenas o número da conta
    public ContaCorrente(String numero) {
        super(numero, "Agencia Padrão", "Senha Padrão", 0);
        this.limite = 0;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public float consultarLimite() {
        return limite;
    }

    @Override
    public boolean autenticar(String senha) {
        return this.getSenha().equals(senha);
    }
}
