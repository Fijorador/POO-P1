
//Nome: mateus Moreira Fonseca - RA: 1426885
import java.util.ArrayList;
import java.util.List;

public abstract class Conta implements OperacoesBancarias{
    private String numero;
    private String agencia;
    private double saldo;
    private String senha;
    private static List<Conta> contas = new ArrayList<>();

    public Conta(String numero, String agencia, String senha, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.senha = senha;
        this.saldo = saldo;

        contas.add(this);
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
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
