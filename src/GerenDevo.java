import java.io.*;
import java.util.*;

public class GerenDevo {

    private static final String ARQUIVO = "devocionais.txt";

    public static void adicionarDevocional(String texto) {
        try (FileWriter fw = new FileWriter(ARQUIVO, true);
                BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(texto);
            bw.newLine();
            System.out.println("Devocional salvo com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar devocional: " + e.getMessage());
        }
    }

    public static void listarDvocional() {
        File file = new File(ARQUIVO);
        if (!file.exists()) {
            System.out.println("nehum devocional salvo ainda.");
            return;
        }
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String linha;
            int count = 1;
            System.out.println("== DEVOCIONAIS SALVOS ==");
            while ((linha = br.readLine()) != null) {
                System.out.println(count + " - " + linha);
                System.out.println("\n");
                count++;
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler os devocionais: " + e.getMessage());
        }
    }

}
