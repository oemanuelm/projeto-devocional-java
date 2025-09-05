import java.util.Scanner;

public class Menu {

    public static void exibirMenu(Usuario usuario, Scanner teclado) {
        int opcao;

        do {
            System.out.println("==== MENU PRINCIPAL ====");
            System.out.println("1 - Adicionar Devocional");
            System.out.println("2 - Listar Devocionais");
            System.out.println("3 - Editar Devocionais");
            System.out.println("4 - Remover Devocionais");
            System.out.println("5 - Sair");
            System.out.println("Escolha uma opção: ");
            while (!teclado.hasNextInt()) {
                System.out.println("Digite um número valido");
                teclado.next();
            }
            opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Adicionando Devocional:");
                    do {
                        addBrokenLine();
                        System.out.println("Digite o conteúdo do devocional:");
                        String conteudo = teclado.nextLine();
                        GerenDevo.adicionarDevocional(conteudo);
                        System.out.println("Devocional adicionado com sucesso!");
                        System.out.println("Deseja adicionar outro devocional? (s/n)");
                        addBrokenLine();
                    } while (teclado.nextLine().equalsIgnoreCase("s"));
                    break;
                case 2:
                    System.out.println("Exibindo Deevocionais:");
                    break;
                case 3:
                    System.out.println("Editando Devocionais:");
                    break;
                case 4:
                    System.out.println("Removendo Devocional:");
                    break;
                case 5:
                    System.out.println("Saindo... ");
                    break;
                default:
                    System.out.println("Opção invalida tente novamente.");

            }

        } while (opcao != 5);
    }

    private static void addBrokenLine() {
        System.out.println("\n");
    }

}
