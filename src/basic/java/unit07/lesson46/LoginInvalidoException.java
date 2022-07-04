package basic.java.unit07.lesson46;

public class LoginInvalidoException extends Exception{

    public LoginInvalidoException() {
        super("Login Inválido");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}
