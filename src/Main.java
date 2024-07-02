import java.util.Scanner;
import com.gabriel.menu.Financeiro;
import com.gabriel.menu.Revistas;
import com.gabriel.menu.Matriculados;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Financeiro financeiro = new Financeiro();
        Revistas revistas = new Revistas();

        int opcao;

        do {
            System.out.println("-- Sistema de Controle! --");
            System.out.println("Selecione a opção no Menu");
            System.out.println("1 - Financeiro");
            System.out.println("2 - Matriculados");
            System.out.println("3 - Revistas");
            System.out.println("0 - Sair");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    financeiro.saldo_Caixa();
                    break;
                case 2:
                    // Adicionar a função
                    break;
                case 3:
                    revistas.trimestre();
                    break;
                case 0:
                    System.out.println(" Encerrando! ");
                    break;
                default:
                    System.out.println("Opção invalida. retorne ao Menu!");

            }

        } while (opcao != 0);

        scanner.close();
    }
}