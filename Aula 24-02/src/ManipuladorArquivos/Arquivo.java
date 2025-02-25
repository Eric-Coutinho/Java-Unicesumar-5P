package ManipuladorArquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Arquivo {
    private String path;
    private BufferedReader bf = null;
    private FileReader fReader;

    public Arquivo(String path) {
        this.path = path;
        this.resetBufferedReader();
    }

    private void resetBufferedReader() {
        try {
            if (this.bf != null) {
                this.bf.close();
            }
            this.fReader = new FileReader(this.path);
            this.bf = new BufferedReader(this.fReader);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public String Ler() {
        try {
            this.resetBufferedReader();
            String linha = this.bf.readLine();

            while (linha != null) {
                System.out.println(linha);
                linha = bf.readLine();
            }

            return linha;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return e.getMessage();
        }
    }

    public void adicionar_linha(String linha) {
        try {
            FileWriter fw = new FileWriter(this.path, true);
            BufferedWriter bfw = new BufferedWriter(fw);
            bfw.write("\n" + linha + "\n");
            bfw.close();
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public void limpar_arquivo() {
        try {
            FileWriter fw = new FileWriter(this.path);
            BufferedWriter bfw = new BufferedWriter(fw);
            bfw.write("");
            bfw.close();
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public int localizar_registro(String registro) {
        int i = 0;
        try {
            this.resetBufferedReader();
            String linha;
            while ((linha = this.bf.readLine()) != null) {
                i++;

                if (linha.equals(registro)) {
                    System.out.println("Registro encontrado na linha: " + i);
                    return i;
                }
            }
            System.out.println("Registro não encontrado.");
            return 0;
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            return 0;
        }
    }
}
