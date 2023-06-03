package br.com.abc.teste2;

public class AnimalInvalidoException extends Exception{

    public AnimalInvalidoException() {
        super("Tipo de Animal Inválido");
    }
}
