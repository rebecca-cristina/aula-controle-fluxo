package projeto.intellij.novoprojetointellij.dados.aritimeticos.conversao.metodos.sobrecarga.retornos.operadoresRelacionais.controleFluxo;

import java.util.Scanner;

public class mesFerias {
    public static void main(String[] args) {

        System.out.println("Digite o número compatível com o mês atual: ");
        Scanner scan = new Scanner(System.in);

        int mes;
        mes = scan.nextInt();

        switch (mes) {
            case 1:
            case 7:
            case 12:
                System.out.println("Mês referente a Férias.");
                break;
            default:
                if (mes >= 13) {
                    System.out.println("Inválido");
                } else {
                    System.out.println("Nesse mês não teremos férias.");
                }
        }
    }
}


