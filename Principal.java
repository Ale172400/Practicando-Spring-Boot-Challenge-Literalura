package com.literalura.principal;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class Principal {

    private Scanner teclado = new Scanner(System.in);

    public void muestraMenu() {

        int opcion = -1;

        while(opcion != 0){

            System.out.println("""
            
            1 - Buscar libro por título
            2 - Listar libros registrados
            3 - Listar autores registrados
            4 - Listar autores vivos en determinado año
            5 - Listar libros por idioma
            
            0 - Salir
            """);

            opcion = teclado.nextInt();
            teclado.nextLine();

        }
    }
}
