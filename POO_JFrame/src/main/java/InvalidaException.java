public class InvalidaException extends Exception {
    private Object mensagem;

    public InvalidaException(Object mensagem) {
        this.mensagem = mensagem;       
    }

    @Override
    public String getMessage() {
        return String.valueOf(mensagem);
    }
}
