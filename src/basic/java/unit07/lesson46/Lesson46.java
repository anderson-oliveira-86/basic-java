package basic.java.unit07.lesson46;

import basic.java.util.Util;

import java.util.Scanner;

public class Lesson46 {
    public static void main(String[] args) {
        Util.printTitle("Exceções pt 10 - Exceção customizada");

        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }

    }

    private static void logar() throws LoginInvalidoException {

        Scanner scanner = new Scanner(System.in);

        String usernameDB = "Goku";
        String senha = "ssj";
        System.out.println("Usuario: ");
        String usernameDigitado = scanner.nextLine();
        System.out.println("Senha: ");
        String senhaDigitada = scanner.nextLine();

        if (!usernameDB.equals(usernameDigitado) || !senha.equals(senhaDigitada)){
            throw new LoginInvalidoException();
        }

        System.out.println("Usuario Logado com sucesso!");
    }
}
