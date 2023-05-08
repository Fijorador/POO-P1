import java.util.Locale;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Leitura {

    private Scanner sc;

    public Leitura() {
        sc = new Scanner(System.in).useLocale(Locale.US);
    }

    public ContaCorrente lerContaCorrente() {
        ContaCorrente conta = null;

        do {
            System.out.print("Número da conta: ");
            String numero = sc.nextLine();

            System.out.print("Senha: ");
            String senha = sc.nextLine();

            System.out.print("Agência: ");
            String agencia = sc.nextLine();

            float saldo = lerValorFloat("Saldo inicial: ");
            float limite = lerValorFloat("Limite da conta corrente: ");

            conta = new ContaCorrente(numero, agencia, senha, saldo, limite);
        } while (conta == null);

        return conta;
    }

    public ContaPoupanca lerContaPoupanca() {
        ContaPoupanca conta = null;

        do {
            System.out.print("Número da conta: ");
            String numero = sc.nextLine();

            System.out.print("Senha: ");
            String senha = sc.nextLine();

            System.out.print("Agência: ");
            String agencia = sc.nextLine();

            float saldo = lerValorFloat("Saldo inicial: ");
            float juros = lerValorFloat("Juros da conta poupança mensal: ");

            conta = new ContaPoupanca(numero, agencia, senha, saldo, juros);
        } while (conta == null);

        return conta;
    }

    public void executarOperacao(Conta conta) {

        String opcao;
        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Sacar");
            System.out.println("2 - Depositar");
            System.out.println("3 - Transferir");

            if (conta instanceof ContaCorrente) {
                System.out.println("4 - Ver Limite");
            } else if (conta instanceof ContaPoupanca) {
                System.out.println("4 - Calcular rendimento");
            }

            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = sc.nextLine();

            switch (opcao) {
                case "1":
                    System.out.print("Informe o valor a ser sacado: ");
                    float valorSaque = lerValorFloat("Valor inválido! Digite novamente.");
                    if (conta.sacar(valorSaque)) {
                        System.out.println("Saque realizado com sucesso!");
                    } else {
                        System.out.println("Saldo insuficiente!");
                    }
                    break;
                case "2":
                    System.out.print("Informe o valor a ser depositado: ");
                    float valorDeposito = lerValorFloat("Valor inválido! Digite novamente.");
                    conta.depositar(valorDeposito);
                    System.out.println("Depósito realizado com sucesso!");
                    break;
                case "3":
                    System.out.print("Número da conta de destino: ");
                    String numeroDestino = sc.nextLine();
                    Conta destino = new ContaCorrente(numeroDestino);
                    System.out.print("Informe o valor a ser transferido: ");
                    float valorTransferencia = lerValorFloat("Valor inválido! Digite novamente.");
                    if (conta.transferir(destino, valorTransferencia)) {
                        System.out.println("Transferência realizada com sucesso!");
                    } else {
                        System.out.println("Saldo insuficiente!");
                    }
                    break;
                case "4":
                    if (conta instanceof ContaCorrente) {
                        ContaCorrente contaCorrente = (ContaCorrente) conta;
                        System.out.println("Limite da conta corrente: " + contaCorrente.getLimite());
                    } else if (conta instanceof ContaPoupanca) {
                        ContaPoupanca contaPoupanca = (ContaPoupanca) conta;
                        System.out.println("Rendimento da conta poupança: " + contaPoupanca.calcularRendimento());
                    }
                    break;

                case "0":
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Digite novamente.");
            }
        } while (!opcao.equals("0"));
    }

    private float lerValorFloat(String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                float valor = sc.nextFloat();
                sc.nextLine();
                return valor;
            } catch (InputMismatchException e) {
                System.out.println("Valor inválido! Digite um número válido.");
                sc.nextLine();
            }
        }
    }

}
