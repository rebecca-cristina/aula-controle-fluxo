package projeto.intellij.novoprojetointellij.dados.aritimeticos.conversao.metodos.sobrecarga.retornos.operadoresRelacionais.controleFluxo;

import java.util.Scanner;

public class diaSemana {
    public static void main(String[] args) {

        System.out.println("Em qual dia da semana estamos? ");

        Scanner scan = new Scanner(System.in);
        String hoje;
        hoje = scan.nextLine();

        switch (hoje) {
            case "Domingo":
                    System.out.println("1");
                break;
            case "Segunda":
                System.out.println("2");
                break;
            case "Terça":
                System.out.println("3");
                break;
            case "Quarta":
                System.out.println("4");
                break;
            case "Quinta":
                System.out.println("5");
                break;
            case "Sexta":
                System.out.println("6");
                break;
            case "Sábado":
                System.out.println("7");
                break;
            default:
                System.out.println("Inválido");
        }



    }
}
