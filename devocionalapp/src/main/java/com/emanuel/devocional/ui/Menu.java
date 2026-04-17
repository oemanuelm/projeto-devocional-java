package com.emanuel.devocional.ui;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private List<String> devocionais = new ArrayList<>();

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
                    System.out.println("Adicione o Devocional");
                    String texto = teclado.nextLine();
                    devocionais.add(texto);
                    System.out.println("Devocional criado !");
                    break;

                case 2:
                    System.out.println("Liste os Devocionais");
                    if (devocionais.isEmpty()) {
                        System.out.println("Não ha devocionais");
                    } else {
                        for (int i = 0; i < devocionais.size(); i++) {
                            System.out.println(devocionais.get(i));
                        }
                    }

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
