package com.emanuel.devocional.ui;

import java.util.Scanner;

public class Menu {

    public void exibir() {
        Scanner teclado = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("=== Menu Principal ===");
            System.out.println("1 - Adicionar Devocional");
            System.out.println("2 - Listar devocionais");
            System.out.println("3 - Sair");

            opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Adicionar Devocional");
                    break;

                case 2:
                    System.out.println("Listar Devocionais");
                    break;

                case 3:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção invalida");
                    break;
            }

        } while (opcao != 3);

        teclado.close();
    }

}
