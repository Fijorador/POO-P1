
//Nome: Mateus Moreira Fonseca - RA: 1426885
public interface OperacoesBancarias {
    void depositar(double valor);
    boolean sacar(double valor) throws InvalidaException; 
    void consultarSaldo();
    
}
