import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        
        Usuario usuario = CriarConta.criar(teclado);

        boolean autenticado = Login.autenticar(usuario, teclado);

        if (autenticado) {
            Menu.exibirMenu(usuario, teclado);
        } else {
            System.out.println("Encerrando o aplicativo...");
        }
   
        teclado.close();

    }
}
