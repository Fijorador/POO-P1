//Nome: mateus Moreira Fonseca - RA: 1426885
public abstract class Conta {
    public String numero;
    public String agencia;
    private float saldo;
    private String senha;

    public Conta(String numero, String agencia, String senha, float saldo) {
        try {
            if (!validarNumeroConta(numero)) {
                System.out.println("Número de conta inválido!");
            }
            if (!validarAgencia(agencia)) {
                System.out.println("Número de agência inválido!");
            }
            this.numero = numero;
            this.agencia = agencia;
            this.senha = senha;
            this.saldo = saldo;
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao criar a conta: " + e.getMessage());
        }
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

    private boolean validarNumeroConta(String numero) {
        if (numero.length() != 6) {
            return false;
        }
    
        for (char c : numero.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
    
        return true;
    }
    private boolean validarAgencia(String agencia) {

        if (agencia.length() != 4) {
            return false;
        }

        for (char c : agencia.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }

        return true;
    }

}
