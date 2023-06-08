
public class InvalidaException extends Exception {

    private Object mensagem;
    private Object objt;

    public InvalidaException(Object mensagem) {
        this.mensagem = mensagem;

    }

    public InvalidaException(Object objt, String mensagem) {
        this.objt = objt;
        this.mensagem = "Só pra mostrar que eu entendi";

    }

    @Override
    public String getMessage() {
        return String.valueOf(mensagem);
    }

    public Object tratamentoEspecifico(Object objt, String mensagem) {

        mensagem = "Esse método seria chamado com InvalidaException.tratamentoEspecifico(mensagem) logo após o cacth";
        objt = mensagem;
        return objt;
    }

}
