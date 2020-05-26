package com.example.classes.pessoa;

public class PessoaFisica extends Pessoa {

    public PessoaFisica( Integer idade,  Float peso) {
        super(idade, peso);//método super chama a classe pai "Pessoa", sem passar parâmetros
    }
}
