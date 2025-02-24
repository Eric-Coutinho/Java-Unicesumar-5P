import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Atividade arrays");

        String[] nomeFunc = new String[5];
        String[] cidadeFunc = new String[5];
        boolean[] statusFunc = new boolean[5];
        int[] anoContratFunc = new int[5];

        nomeFunc[0] = "João";
        cidadeFunc[0] = "São Paulo";
        statusFunc[0] = true;
        anoContratFunc[0] = 2015;

        nomeFunc[1] = "Maria";
        cidadeFunc[1] = "Rio de Janeiro";
        statusFunc[1] = false;
        anoContratFunc[1] = 2013;

        nomeFunc[2] = "José";
        cidadeFunc[2] = "Curitiba";
        statusFunc[2] = true;
        anoContratFunc[2] = 2017;

        nomeFunc[3] = "Ana";
        cidadeFunc[3] = "Belo Horizonte";
        statusFunc[3] = false;
        anoContratFunc[3] = 2019;

        Scanner sc = new Scanner(System.in);
        String nomeString = sc.nextLine();

        nomeFunc[4] = nomeString;
        System.out.println("Nome input: " + nomeFunc[4]);

        sc.close();
        System.out.println("Outros nomes: ");
        for (int i = 0; i < nomeFunc.length - 1; i++) {
            System.out.println(nomeFunc[i]);
        }
    }
}
