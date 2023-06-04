//Nome: Mateus Moreira Fonseca - RA: 1426885

import java.util.InputMismatchException;
import java.util.Scanner;

public class Leitura {
    private Scanner leitor;

    public Leitura() {
        leitor = new Scanner(System.in);
    }

    public void fecharLeitor() {
        leitor.close();
    }

    public String lerString() {
        return leitor.nextLine();
    }

    public double lerDouble() {
        while (true) {
            try {
                double valor = Double.parseDouble(leitor.nextLine());
                if (valor < 0) {
                    System.out.println("Valor inválido! Não pode ser negativo.");
                } else {
                    return valor;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Digite um número decimal válido.");
            }
        }
    }

    public ContaCorrente lerContaCorrente() throws InvalidaException {
        ContaCorrente conta = null;
        String numero = "";
        String agencia = "";

        do {
            System.out.print("Número da conta: ");
            numero = leitor.nextLine();
            if (!validarNumeroConta(numero)) {
                System.out.println("Conta inválida. Digite novamente.");
            } else if (Conta.encontrarConta(numero) != null) {
                System.out.println("Número da conta já existe. Digite outro número.");
                numero = "";
            }
        } while (!validarNumeroConta(numero));

        System.out.print("Senha: ");
        String senha = leitor.nextLine();

        do {
            System.out.print("Agência: ");
            agencia = leitor.nextLine();
            if (!validarAgencia(agencia)) {
                System.out.println("Agência inválida. Digite novamente.");
            }
        } while (!validarAgencia(agencia));

        System.out.print("Saldo inicial:R$ ");
        double saldo = lerValorDouble();

        System.out.print("Limite:R$ ");
        double limite = lerValorDouble();

        conta = new ContaCorrente(numero, agencia, senha, saldo, limite, limite);
        return conta;
    }

    public ContaPoupanca lerContaPoupanca() throws InvalidaException {
        ContaPoupanca conta = null;
        String numero;
        String agencia;

        do {
            System.out.print("Número da conta: ");
            numero = leitor.nextLine();
            if (!validarNumeroConta(numero)) {
                System.out.println("Conta inválida. A conta deve ter 6 dígitos numéricos. Digite novamente.");
            }
        } while (!validarNumeroConta(numero));

        System.out.print("Senha: ");
        String senha = leitor.nextLine();

        do {
            System.out.print("Agência: ");
            agencia = leitor.nextLine();
            if (!validarAgencia(agencia)) {
                System.out.println("Agência inválida. A agência deve ter 4 dígitos numéricos. Digite novamente.");
            }
        } while (!validarAgencia(agencia));

        System.out.print("Saldo inicial: R$ ");
        double saldo = lerValorDouble();

        System.out.print("Juros da conta poupança mensal (1% - 100%): ");
        double juros = lerValorDouble();

        conta = new ContaPoupanca(numero, agencia, senha, saldo, juros);
        return conta;
    }

    public void executarOperacao(Conta conta) throws InvalidaException {
        String opcao;
        do {
            System.out.println("\nOPÇÕES BANCÁRIAS: |");
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Sacar");
            System.out.println("2 - Depositar");
            if (conta instanceof ContaCorrente) {
                System.out.println("3 - Transferir");
                System.out.println("4 - Ver Limite");
            } else if (conta instanceof ContaPoupanca) {
                System.out.println("4 - Calcular rendimento mensal");
            }
            System.out.println("5 - Consultar Saldo");
            System.out.println("0 - Voltar");
            System.out.print("Opção: ");
            opcao = leitor.nextLine();

            try {
                switch (opcao) {
                    case "1":
                        consultarSaldo(conta);
                        realizarSaque(conta);
                        consultarSaldo(conta);
                        break;
                    case "2":
                        realizarDeposito(conta);
                        consultarSaldo(conta);
                        break;
                    case "3":
                        if (conta instanceof ContaCorrente) {
                            realizarTransferencia(conta);
                            consultarSaldo(conta);
                        } else {
                            throw new InvalidaException("Opção inválida! Digite novamente.");
                        }
                        break;
                    case "4":
                        metodosUnicos(conta);
                        break;
                    case "5":
                        consultarSaldo(conta);
                        break;
                    case "0":
                        System.out.println("Saindo...\n");
                        break;
                    default:
                        throw new InvalidaException("Opção inválida! Digite novamente.");
                }
            } catch (InvalidaException e) {
               e.IvalidaImprime(e);
            }
        } while (!opcao.equals("0"));
    }

    
    public void realizarSaque(Conta conta) throws InvalidaException {
        System.out.print("Informe o valor a ser sacado: ");
        double valorSaque = lerValorDouble();
        double saldoDisponivel = conta.getSaldo();

        if (conta instanceof ContaCorrente) {
            ContaCorrente contaCorrente = (ContaCorrente) conta;
            saldoDisponivel += contaCorrente.getLimite();
        }

        if (valorSaque <= saldoDisponivel) {
            if (conta.sacar(valorSaque)) {
                System.out.println("Saque realizado com sucesso!");
            } else {
                throw new InvalidaException("Saldo insuficiente! Operação não realizada!");
            }
        } else {
            throw new InvalidaException("Valor de saque excede o saldo disponível!");
        }
    }

    public void realizarDeposito(Conta conta) throws InvalidaException {
        System.out.print("Informe o valor a ser depositado: R$ ");
        double valorDeposito = lerValorDouble();
        conta.depositar(valorDeposito);
        System.out.println("Depósito realizado com sucesso!");
        System.out.println("Saldo atual: R$ " + conta.getSaldo());
    }

    public void metodosUnicos(Conta conta) throws InvalidaException {
        if (conta instanceof ContaCorrente) {
            System.out.println("Limite: " + ((ContaCorrente) conta).getLimite());
        } else if (conta instanceof ContaPoupanca) {
            ContaPoupanca contaPoupanca = (ContaPoupanca) conta;
            throw new InvalidaException("Rendimento mensal: " + contaPoupanca.calcularRendimento());
        } else {
            throw new InvalidaException("Opção inválida! Digite novamente.");
        }
    }

    public void realizarTransferencia(Conta conta) throws InvalidaException {
        if (conta instanceof ContaPoupanca) {
            System.out.println("Operação não permitida para Conta Poupança.");
        } else {
            System.out.print("\nInforme o número da conta de destino: ");
            String numeroDestinoTransferencia = leitor.nextLine();
            Conta destinoTransferencia = Conta.encontrarConta(numeroDestinoTransferencia);

            if (destinoTransferencia != null) {
                System.out.print("Informe o valor a ser transferido:R$ ");
                double valorTransferencia = lerValorDouble();

                if (((ContaCorrente) conta).transferir(destinoTransferencia, valorTransferencia)) {
                    System.out.println("Transferência realizada com sucesso!");
                    System.out.println("Saldo atual:R$ " + conta.getSaldo());
                } else {
                    System.out.println("Saldo insuficiente para realizar a transferência!");
                }
            } else {
                throw new InvalidaException("Conta de destino não encontrada!");
            }
        }
    }

    public void consultarSaldo(Conta conta) throws InvalidaException {
        if (conta instanceof ContaCorrente) {
            System.out.println("\nSaldo atual (Conta Corrente - Saldo em Conta):R$ " + conta.getSaldo());
            System.out.println("Saldo atual (Conta Corrente - Limite):R$ "
                    + ((ContaCorrente) conta).getLimiteDisponivel());
            System.out.println("Saldo atual (Conta Corrente - Total):R$ "
                    + (conta.getSaldo() + ((ContaCorrente) conta).getLimiteDisponivel()) + "\n");

        } else if (conta instanceof ContaPoupanca) {
            System.out.println("Saldo atual (Conta Poupança):R$ " + conta.getSaldo());

        } else {
            throw new InvalidaException("Tipo de conta inválido.");
        }
    }

    private double lerValorDouble() throws InvalidaException {
        while (true) {
            try {
                double valor = leitor.nextDouble();
                leitor.nextLine();

                if (valor < 0) {
                    throw new InvalidaException("Valor inválido!Não pode ser negativo");
                }

                return valor;
            } catch (InputMismatchException e) {
                System.out.println("Valor inválido! Digite um número válido.");
                leitor.nextLine();
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