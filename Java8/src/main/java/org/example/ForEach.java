package org.example;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ForEach {

    public static void main(String[] args) {

        ArrayList< Persona > milista = new ArrayList < Persona > ();
        milista.add(new Persona("Miguel"));
        milista.add(new Persona("Alicia"));

        //Método For
        for (Persona p: milista) {
            System.out.println("Método For: " + p.getNombre());
        }

        //Método ForEach
        milista.forEach(new Consumer< Persona >() {
            @Override
            public void accept(final Persona persona) {
                System.out.println("MétodoForEach con Consumer: " + persona.getNombre());
            }
        });

        milista.forEach((final Persona persona)
                -> System.out.println("MétodoForEach con Lambda: " + persona.getNombre()));


    }

}
