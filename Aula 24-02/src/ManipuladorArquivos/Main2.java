package ManipuladorArquivos;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        String path = "src/ManipuladorArquivos/nomes.txt";
        Scanner scanner = new Scanner(System.in);
        String opcao = "";
        
        Arquivo arquivo = new Arquivo(path);

        System.out.println("Deseja limpar o arquivo? (S/N)");
        opcao = scanner.next();
        scanner.nextLine();

        if (opcao.equalsIgnoreCase("S")) {
            arquivo.limpar_arquivo();
        }
        else if (opcao.equalsIgnoreCase("N")) {
            String novo_nome;

            System.out.println("Digite um nome para ser adicionado: ");
            novo_nome = scanner.nextLine();

            arquivo.adicionar_linha(novo_nome);

            arquivo.localizar_registro(novo_nome);
        }
        else {
            System.out.println("Input inválido, tente novamente");
            System.out.println("");

            System.out.println("Deseja limpar o arquivo? (S/N)");

            opcao = scanner.next();
            scanner.nextLine();
        }

        scanner.close();
    }
}
