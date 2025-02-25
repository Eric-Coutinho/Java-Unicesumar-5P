package ManipuladorArquivos;

import java.io.BufferedReader;
import java.io.FileReader;

public class App {
    public static void main(String[] args) throws Exception {
        String path = "src/ManipuladorArquivos/nomes.txt";

        BufferedReader leitor = null;

        try {
            FileReader leitorArquivo = new FileReader(path);
            leitor = new BufferedReader(leitorArquivo); 

            String linha = leitor.readLine();

            int i = 0;
            
            while (linha != null) {
                i++;
                System.out.println("Nome " + i + ": " + linha);
                linha = leitor.readLine();
            }

            System.out.println("Total de nomes: " + i);

            System.out.println("Fim do programa");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
