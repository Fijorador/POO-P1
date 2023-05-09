//Nome: mateus Moreira Fonseca - RA: 1426885
import java.util.ArrayList;
import java.util.List;


 public abstract class Conta {
    public String numero;
    public String agencia;
    private float saldo;
    private String senha;
    private static List<Conta> contas = new ArrayList<>();

    public Conta(String numero, String agencia, String senha, float saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.senha = senha;
        this.saldo = saldo;

        contas.add(this); 
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
    public String getAgencia() {
        return agencia;
    }

    public String getSenha() {
        return senha;
    }
    public static List<Conta> getContas() {
        return contas;
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
            System.out.println("Saldo insuficiente!");
            return false;
        }
    }

    public static Conta encontrarConta(String numero) {
        for (Conta conta : contas) {
            if (conta.getNumero().equals(numero)) {
                return conta;
            }
        }
        return null;
    }

    public static void listarContas(ArrayList<Conta> contas) {
        if (contas.isEmpty()) {
            System.out.println("Não há contas cadastradas.");
        } else {
            System.out.println("Listando todas as contas existentes:");
            for (Conta conta : contas) {
                System.out.println(conta.getNumero());
            }
        }
    }
    

}
