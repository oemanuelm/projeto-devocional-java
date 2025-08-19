import java.util.Scanner;

public class Login {

    public static boolean autenticar(Usuario usuario, Scanner teclado) {
        System.out.println("---LOGIN----");

        System.out.println("Informe seu nome de usuário:");
        String nomeDigitado = teclado.nextLine();

        System.out.println("Digite sua senha: ");
        String senhaDigitada = teclado.nextLine();

        if (usuario.getnome().equals(nomeDigitado) && usuario.verificarSenha(senhaDigitada)) {
            System.out.println("Login realizado com sucesso!");
            return true;
        } else {
            System.out.println("Nome ou senha incorretos!");
            return false;
        }
    }
}
