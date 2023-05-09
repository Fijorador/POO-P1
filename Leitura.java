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
        String numero = "0";
        String agencia = "0";

        do {
            System.out.print("Número da conta:");
            numero = sc.nextLine();
            if (!validarNumeroConta(numero)) {
                System.out.println("Conta inválida. Digite novamente.");
            }
        } while (!validarNumeroConta(numero));

        System.out.print("Senha: ");
        String senha = sc.nextLine();
        do {
            System.out.print("Agência: ");
            agencia = sc.nextLine();
            if (!validarAgencia(agencia)) {
                System.out.println("Agência inválida. Digite novamente.");
            }
        } while (!validarAgencia(agencia));

        System.out.print("Saldo inicial: ");
        float saldo = lerValorFloat();
        System.out.print("Limite: ");
        float limite = lerValorFloat();

        conta = new ContaCorrente(numero, agencia, senha, saldo, limite);
        return conta;
    }

    public ContaPoupanca lerContaPoupanca() {
        ContaPoupanca conta = null;
        String numero;
        String agencia;

        do {
            System.out.print("Número da conta: ");
            numero = sc.nextLine();
            if (!validarNumeroConta(numero)) {
                System.out.println("Conta inválida.A conta deve ter 6 digitos numericos!Digite novamente.");
            }
        } while (!validarNumeroConta(numero));

        System.out.print("Senha: ");
        String senha = sc.nextLine();
        do {
            System.out.print("Agência: ");
            agencia = sc.nextLine();
            if (!validarAgencia(agencia)) {
                System.out.println("Agência inválida.A Agencia possui 4 digitos!Digite novamente.");
            }
        } while (!validarAgencia(agencia));

        System.out.print("Saldo inicial: ");
        float saldo = lerValorFloat();
        System.out.print("Juros da conta poupança mensal: ");
        float juros = lerValorFloat();

        conta = new ContaPoupanca(numero, agencia, senha, saldo, juros);
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
                System.out.println("4 - Calcular rendimento mensal");
            }

            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = sc.nextLine();

            switch (opcao) {
                case "1":
                    System.out.println("Saldo atual: " + conta.getSaldo());
                    System.out.print("Informe o valor a ser sacado: ");
                    float valorSaque = lerValorFloat();
                    if (conta.sacar(valorSaque)) {

                        System.out.println("Saque realizado com sucesso!");
                        System.out.println("Saldo atual: " + conta.getSaldo());
                    } else {
                        System.out.println("Saldo insuficiente!");
                    }
                    break;
                case "2":
                    System.out.print("Informe o valor a ser depositado: ");
                    float valorDeposito = lerValorFloat();
                    conta.depositar(valorDeposito);
                    System.out.println("Depósito realizado com sucesso!");
                    System.out.println("Saldo atual: " + conta.getSaldo());
                    break;
                case "3":
                    System.out.print("Informe o número da conta de destino: ");
                    String numeroDestinoTransferencia = sc.nextLine();
                    Conta destinoTransferencia = Conta.encontrarConta(numeroDestinoTransferencia);
                    if (destinoTransferencia != null) {
                        System.out.print("Informe o valor a ser transferido: ");
                        float valorTransferencia = lerValorFloat();
                        if (conta.transferir(destinoTransferencia, valorTransferencia)) {
                            System.out.println("Transferência realizada com sucesso!");
                            System.out.println("Saldo atual: " + conta.getSaldo());
                        } else {
                            System.out.println("Saldo insuficiente para realizar a transferência!");
                        }
                    } else {
                        System.out.println("Conta de destino não encontrada!");
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

    private float lerValorFloat() {
        while (true) {
            try {
                float valor = sc.nextFloat();
                sc.nextLine();

                if (valor <= 0) {
                    System.out.println("Valor inválido! Digite um número positivo.");
                    continue; // Volta para o início do loop para pedir um novo valor
                }

                return valor;
            } catch (InputMismatchException e) {
                System.out.println("Valor inválido! Digite um número válido.");
                sc.nextLine();
            }
        }
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