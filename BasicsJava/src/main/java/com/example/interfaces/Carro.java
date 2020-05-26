package com.example.interfaces;

public interface Carro extends Automovel{

    String marca();

    // --Commented out by Inspection (25/05/2020 20:50):Double valor();

    default void ligar() {

        System.out.println("Ligando o carro!");
    }

// --Commented out by Inspection START (25/05/2020 20:50):
//    default String codigoRenavan() {
//        return "6533jijiio";
//    }
// --Commented out by Inspection STOP (25/05/2020 20:50)

}
