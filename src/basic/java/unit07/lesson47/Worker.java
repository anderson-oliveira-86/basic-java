package basic.java.unit07.lesson47;

import basic.java.unit07.lesson46.LoginInvalidoException;

import java.io.FileNotFoundException;

public class Worker extends People{

    @Override
    public void salvar() throws LoginInvalidoException , FileNotFoundException {
        System.out.println("Salvando funcionário");
    }
}
