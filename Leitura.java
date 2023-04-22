//Nome: mateus Moreira Fonseca - RA: 1426885
 import java.util.Locale;
import java.util.Scanner;

public class Leitura {
    
    private Scanner sc;

    public Leitura() {
        sc = new Scanner(System.in).useLocale(Locale.US);
    }
    
    public Conta ler(String tipoConta) {
        System.out.print("Número da conta: ");
        String numero = sc.nextLine();
    
        System.out.print("Senha: ");
        String senha = sc.nextLine();
    
        System.out.print("Agência: ");
        
        String agencia = sc.nextLine();
    
        System.out.print("Saldo inicial: ");
        float saldo = sc.nextFloat();
    
        tipoConta = tipoConta.toLowerCase();

        
        
        if (tipoConta.toLowerCase().equalsIgnoreCase("poupanca")) {
            System.out.print("Juros da conta poupança mensal: ");
            float juros = sc.nextFloat();
            return new ContaPoupanca(numero, agencia, senha, saldo, juros);
            
        } else if (tipoConta.toLowerCase().equalsIgnoreCase("corrente")) {
            System.out.print("Limite da conta corrente: ");
            float limite = sc.nextFloat();
            return new ContaCorrente(numero, agencia, senha, saldo, limite);
        } else {
            return null;
        }
    }
}
