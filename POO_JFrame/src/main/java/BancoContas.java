//@author Mateus Moreira Fonseca RA:1426885

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;

public class BancoContas {

    private static BancoContas banco;
    private final List<ContaCorrente> bdContasCorrente;
    private final List<ContaPoupanca> bdContasPoupanca;
    private final List<ContaPoupancaEspecial> bdContasPoupancaEspecial;

    private BancoContas() {
        bdContasCorrente = new ArrayList<>();
        bdContasPoupanca = new ArrayList<>();
        bdContasPoupancaEspecial = new ArrayList<>();
    }

    public static BancoContas getBanco() {
        if (banco == null) {
            banco = new BancoContas();
        }
        return banco;
    }

    public void addContaCorrente(ContaCorrente conta) {
        bdContasCorrente.add(conta);
    }

    public void addContaPoupanca(ContaPoupanca conta) {
        bdContasPoupanca.add(conta);
    }

    public void addContaPoupancaEspecial(ContaPoupancaEspecial conta) {
        bdContasPoupancaEspecial.add(conta);
    }

    public List<ContaCorrente> getBdContasCorrente() {
        return bdContasCorrente;
    }

    public List<ContaPoupanca> getBdContasPoupanca() {
        return bdContasPoupanca;
    }

    public List<ContaPoupancaEspecial> getBdContasPoupancaEspecial() {
        return bdContasPoupancaEspecial;
    }

    public boolean excluirConta(String numero) {
        Iterator<ContaCorrente> iteratorCorrente = bdContasCorrente.iterator();
        while (iteratorCorrente.hasNext()) {
            ContaCorrente conta = iteratorCorrente.next();
            if (conta.getNumero().equals(numero)) {
                iteratorCorrente.remove();
                return true;
            }
        }

        Iterator<ContaPoupanca> iteratorPoupanca = bdContasPoupanca.iterator();
        while (iteratorPoupanca.hasNext()) {
            ContaPoupanca conta = iteratorPoupanca.next();
            if (conta.getNumero().equals(numero)) {
                iteratorPoupanca.remove();
                return true;
            }
        }

        Iterator<ContaPoupancaEspecial> iteratorPoupancaEspecial = bdContasPoupancaEspecial.iterator();
        while (iteratorPoupancaEspecial.hasNext()) {
            ContaPoupancaEspecial conta = iteratorPoupancaEspecial.next();
            if (conta.getNumero().equals(numero)) {
                iteratorPoupancaEspecial.remove();
                return true;
            }
        }

        return false;
    }

    public Conta getContaByNumero(String numero) {

        for (ContaCorrente conta : bdContasCorrente) {
            if (conta.getNumero().equals(numero)) {
                return conta;
            }
        }

        for (ContaPoupanca conta : bdContasPoupanca) {
            if (conta.getNumero().equals(numero)) {
                return conta;
            }
        }

        for (ContaPoupancaEspecial conta : bdContasPoupancaEspecial) {
            if (conta.getNumero().equals(numero)) {
                return conta;
            }
        }

        return null;
    }

    public static boolean verificarContaExistente(String numeroConta) {
        List<ContaCorrente> contasCorrentes = BancoContas.getBanco().getBdContasCorrente();
        List<ContaPoupanca> contasPoupanca = BancoContas.getBanco().getBdContasPoupanca();
        List<ContaPoupancaEspecial> contasPoupancaEspecial = BancoContas.getBanco().getBdContasPoupancaEspecial();

        for (ContaCorrente conta : contasCorrentes) {
            if (conta.getNumero().equals(numeroConta)) {
                return true;
            }
        }

        for (ContaPoupanca conta : contasPoupanca) {
            if (conta.getNumero().equals(numeroConta)) {
                return true;
            }
        }

        for (ContaPoupancaEspecial conta : contasPoupancaEspecial) {
            if (conta.getNumero().equals(numeroConta)) {
                return true;
            }
        }

        return false;
    }

 

}
