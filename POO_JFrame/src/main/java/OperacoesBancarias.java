
import java.util.List;

//Nome: Mateus Moreira Fonseca - RA: 1426885
public interface OperacoesBancarias {

    void depositar(double valor);

    boolean sacar(double valor) throws InvalidaException;    
    
    static boolean validarNumeroConta(String numero) {
        numero = numero.replace("-", "");

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

    static boolean validarAgencia(String agencia) {
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

    static boolean validarSenha(String senha) {

        if (senha.length() != 6) {
            return false;
        }

        for (char c : senha.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }

        return true;
    }

    

}
