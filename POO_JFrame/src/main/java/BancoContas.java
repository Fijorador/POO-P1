import java.util.ArrayList;
import java.util.List;

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

    public void excluirConta(String numero) {
        // Verifica se a conta é uma conta corrente
        for (ContaCorrente conta : bdContasCorrente) {
            if (conta.getNumero().equals(numero)) {
                bdContasCorrente.remove(conta);
                return;
            }
        }

        // Verifica se a conta é uma conta poupança
        for (ContaPoupanca conta : bdContasPoupanca) {
            if (conta.getNumero().equals(numero)) {
                bdContasPoupanca.remove(conta);
                return;
            }
        }

        // Verifica se a conta é uma conta poupança especial
        for (ContaPoupancaEspecial conta : bdContasPoupancaEspecial) {
            if (conta.getNumero().equals(numero)) {
                bdContasPoupancaEspecial.remove(conta);
                return;
            }
        }
    }

    public Conta getContaByNumero(String numero) {
        // Verifica se a conta é uma conta corrente
        for (ContaCorrente conta : bdContasCorrente) {
            if (conta.getNumero().equals(numero)) {
                return conta;
            }
        }

        // Verifica se a conta é uma conta poupança
        for (ContaPoupanca conta : bdContasPoupanca) {
            if (conta.getNumero().equals(numero)) {
                return conta;
            }
        }

        // Verifica se a conta é uma conta poupança especial
        for (ContaPoupancaEspecial conta : bdContasPoupancaEspecial) {
            if (conta.getNumero().equals(numero)) {
                return conta;
            }
        }

        return null;
    }

    public void editarConta(Conta conta) {
        if (conta instanceof ContaCorrente) {
            // Verifica se a conta é uma conta corrente
            for (ContaCorrente cc : bdContasCorrente) {
                if (cc.getNumero().equals(conta.getNumero())) {
                    bdContasCorrente.remove(cc);
                    bdContasCorrente.add((ContaCorrente) conta);
                    return;
                }
            }
        } else if (conta instanceof ContaPoupanca) {
            // Verifica se a conta é uma conta poupança
            for (ContaPoupanca cp : bdContasPoupanca) {
                if (cp.getNumero().equals(conta.getNumero())) {
                    bdContasPoupanca.remove(cp);
                    bdContasPoupanca.add((ContaPoupanca) conta);
                    return;
                }
            }
        } else if (conta instanceof ContaPoupancaEspecial) {
            // Verifica se a conta é uma conta poupança especial
            for (ContaPoupancaEspecial cpe : bdContasPoupancaEspecial) {
                if (cpe.getNumero().equals(conta.getNumero())) {
                    bdContasPoupancaEspecial.remove(cpe);
                    bdContasPoupancaEspecial.add((ContaPoupancaEspecial) conta);
                    return;
                }
            }
        }
    }
}
