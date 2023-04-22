 //Nome: mateus Moreira Fonseca - RA: 1426885
 import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Leitura leitura = new Leitura();
        String tipoConta = "";
        Conta conta = null;

        while (!tipoConta.equalsIgnoreCase("Corrente") && !tipoConta.equalsIgnoreCase("Poupanca")) {
            System.out.print("Qual tipo de conta deseja cadastrar? (Corrente/Poupanca): ");
            tipoConta = sc.nextLine();
            if (!tipoConta.equalsIgnoreCase("Corrente") && !tipoConta.equalsIgnoreCase("Poupanca")) {
                System.out.println("Tipo inválido! Tente novamente.");
            }
        }

        if (tipoConta.equalsIgnoreCase("Corrente")) {
           
            conta = leitura.ler(tipoConta);
            System.out.print("Qual método deseja utilizar? (Sacar/Depositar/Transferir): ");
            String metodo = sc.nextLine();
            switch (metodo.toLowerCase()) {

                case "sacar":
                    System.out.print("Informe o valor a ser sacado: ");
                    float valorSaque = sc.nextFloat();
                    if (conta.sacar(valorSaque)) {
                        System.out.println("Saque realizado com sucesso!");
                    } else {
                        System.out.println("Saldo insuficiente!");
                    }
                    break;
                case "depositar":
                    System.out.print("Informe o valor a ser depositado: ");
                    float valorDeposito = sc.nextFloat();
                    conta.depositar(valorDeposito);
                    System.out.println("Depósito realizado com sucesso!");
                    break;
                case "transferir":
                    String destinoNumero = sc.nextLine();
                    Conta destino = new ContaCorrente(destinoNumero);

                    // Erro mapeado, falta implementar transações
                    System.out.print("Informe o valor a ser transferido: ");
                    float valorTransferencia = sc.nextFloat();
                    if (conta.transferir(destino, valorTransferencia)) {
                        System.out.println("Transferência realizada com sucesso!");
                    } else {
                        System.out.println("Saldo insuficiente!");
                    }
                    break;
                default:
                    System.out.println("Método inválido!");
            }

            System.out.println("Conta: " + conta.getNumero());
            System.out.println("Saldo disponível: " + conta.getSaldoDisponivel());
        } else if (tipoConta.equalsIgnoreCase("Poupanca")) {

            
            conta = leitura.ler(tipoConta);
            
            if(conta==null){
                System.out.println("Deu merda aqui José");
            }
            
            System.out.print("Qual método deseja utilizar? (Sacar/Depositar/Calcular Rendimento): ");
            String metodo = sc.nextLine();

            switch (metodo.toLowerCase()) {
                case "sacar":
                    System.out.print("Informe o valor a ser sacado: ");
                    float valorSaque = sc.nextFloat();
                    if (conta.sacar(valorSaque)) {
                        System.out.println("Saque realizado com sucesso!");
                    } else {
                        System.out.println("Saldo insuficiente!");
                    }
                    break;
                case "depositar":
                    System.out.print("Informe o valor a ser depositado: ");
                    float valorDeposito = sc.nextFloat();
                    conta.depositar(valorDeposito);
                    System.out.println("Depósito realizado com sucesso!");
                    break;
                case "calcular rendimento":
                    ContaPoupanca contaPoupanca = (ContaPoupanca) conta;
                    float rendimento = contaPoupanca.calcularRendimento();
                    System.out.println("Rendimento: " + rendimento+" ao mês");
                    break;
                default:
                    System.out.println("Método inválido!");
            }

            System.out.println("Conta: " + conta.getNumero());
            System.out.println("Saldo disponível: " + conta.getSaldoDisponivel());
        }

        sc.close();
    }
}