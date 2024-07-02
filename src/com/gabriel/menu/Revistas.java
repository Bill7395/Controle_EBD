package com.gabriel.menu;

import java.util.Scanner;

public class Revistas {
    Scanner scanner = new Scanner(System.in);
    int opcao;

    public void trimestre(){
        System.out.println("Selecione o trimestre vigente:");


    do{
        System.out.println("1 - Trimestre");
        System.out.println("2 - Trimestre");
        System.out.println("3 - Trimestre");
        System.out.println("0 - Retornar");
        opcao = scanner.nextInt();
        scanner.nextLine();// Consumir a nova linha

        switch (opcao){
            case 1:
                System.out.println("1 - Trimestre");
                break;
            case 2:
                System.out.println("2 - Trimestre");
                break;
            case 3:
                System.out.println("3 - Trimestre");
                break;
            case 0:
                System.out.println("Retornando ao menu.");

                break;
            default:
                System.out.println("Opção invalida.");
        }
        }while (opcao != 0);
        scanner.close();
    }
}
