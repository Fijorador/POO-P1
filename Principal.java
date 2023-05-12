
//Nome: Mateus Moreira Fonseca - RA: 1426885
import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        Leitura leitura = new Leitura();

        ArrayList<Conta> contas = new ArrayList<>();

        String tipoConta;
        Conta conta;

        do {
            System.out.println("| GERENCIA DE CONTAS |");
            System.out.println("Selecione uma opção:");
            System.out.println("1 - Cadastrar Conta");
            System.out.println("2 - Listar todas as contas existentes");
            System.out.println("3 - Depósito em Conta Específica");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            String opcao = leitura.lerString();

            try {
                if (opcao.equals("1")) {
                    System.out.print("Digite o tipo de conta (1 - Corrente / 2 - Poupança): ");
                    tipoConta = leitura.lerString();

                    if (tipoConta.equals("1")) {
                        tipoConta = "Corrente";
                    } else if (tipoConta.equals("2")) {
                        tipoConta = "Poupanca";
                    } else {
                        System.out.println("Opção inválida! Digite novamente.");
                        continue;
                    }

                    if (tipoConta.equalsIgnoreCase("Corrente")) {
                        conta = leitura.lerContaCorrente();
                    } else if (tipoConta.equalsIgnoreCase("Poupanca")) {
                        conta = leitura.lerContaPoupanca();
                    } else {
                        System.out.println("Tipo de conta inválido!");
                        continue;
                    }

                    contas.add(conta);
                    leitura.executarOperacao(conta);
                } else if (opcao.equals("2")) {
                    Conta.listarContas(contas);
                } else if (opcao.equals("0")) {
                    System.out.println("Saindo...");
                    break;
                } else {
                    System.out.println("Opção inválida! Digite novamente.");
                }
            } catch (InvalidaException e) {
                System.out.println("Ocorreu uma exceção inválida: " + e.getMessage());//Nao to conseguindo pegar, antes eu estava --'                
            }
        } while (true);

        leitura.fecharLeitor();
    }
}
