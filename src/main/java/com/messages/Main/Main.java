package com.messages.Main;

import com.messages.Util.Conexion;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException {


        Scanner scanner = new Scanner(System.in);
        MesagesService messageSerivce = new MesagesService();

        int option = 0;

        do {
            System.out.println("************************");
            System.out.println("Applicación de mensajes");
            System.out.println("1.- Crear mensaje");
            System.out.println("2.- Listar mensaje");
            System.out.println("3.- Editar mensaje ");
            System.out.println("4.- Eliminar mensaje");
            System.out.println("5.- Salir");


            option = scanner.nextInt();
            switch (option){
                case 1:
                    messageSerivce
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    break;
            }
        }
        while (option != 5);{
       /*     Conexion connect = new Conexion();
            connect.get_connection();
            */

        }
    }

}
