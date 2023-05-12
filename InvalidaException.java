//Nome: Mateus Moreira Fonseca - RA: 1426885
public class InvalidaException extends Exception {
    private Object mensagem;

    public InvalidaException(String mensagem) {
        super();
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return String.valueOf(mensagem);
    }

}
