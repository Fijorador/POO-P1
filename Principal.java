import java.util.Scanner;


public class Principal {   

    public static void main(String[] args) {
        Leitura leitura = new Leitura();
        Scanner sc = new Scanner(System.in);
    
        String tipoConta;
        Conta conta;
    
        do {

            
            System.out.print("Digite o tipo de conta (Corrente/Poupanca) ou digite 0 para sair: ");
            tipoConta = sc.nextLine();
    
            if (tipoConta.equalsIgnoreCase("Corrente")) {
                conta = leitura.lerContaCorrente();
            } else if (tipoConta.equalsIgnoreCase("Poupanca")) {
                conta = leitura.lerContaPoupanca();
            } else if (tipoConta.equals("0")) {
                break; 
            } else {
                System.out.println("Tipo de conta inválido!");
                continue;
            }  

            leitura.executarOperacao(conta);
        } while (true);

        
    
        sc.close();
    }
    
}