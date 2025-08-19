import java.util.Scanner;

public class CriarConta {
    public static Usuario criar(Scanner teclado) {
        String nome;
        String senha;
        String confSenha;
        int idade;

        System.out.println("---- CRIAR CONTA ----");

        System.out.println("Infome seu nome: ");
        nome = teclado.nextLine();

        do {
            System.out.println("Crie sua senha: ");
            senha = teclado.nextLine();

            System.out.println("confime sua senha: ");
            confSenha = teclado.nextLine();

            if (!senha.equals(confSenha)) {
                System.out.println("As senhas não coincidem. Tente novamente");
            }
        } while (!senha.equals(confSenha));

        do {
            System.out.println("Informe sua idade: ");
            while (!teclado.hasNextInt()) {
                System.out.println("Digite um número válido: ");
                teclado.nextLine();
            }
            idade = teclado.nextInt();
            teclado.nextLine();
            if (idade < 18) {
                System.out.println("Idade invalida. É precisor ter mais de 18 anos");
            }
        } while (idade < 18);

        System.out.println("Conta criada com sucesso");

        return new Usuario(nome, idade,  senha);

    }
}
