//Nome: Mateus Moreira Fonseca - RA: 1426885
public class InvalidaException extends Exception {

    private Object mensagem;

    public InvalidaException(Object mensagem) {
       this.mensagem=mensagem;       
    }

    public void IvalidaImprime(Object e){
        System.out.println("Ocorreu um erro:" + String.valueOf(mensagem)); 
    }
}