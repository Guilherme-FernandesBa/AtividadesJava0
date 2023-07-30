import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Bem Vindo ao Progama de Atividades JAVA-0");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha qual Atividade você quer executar!(De 7 a 15 apenas): ");
        String atividade = scanner.next();
        if(Atividades.isNumeric(atividade)){
            int escolha = Integer.parseInt(atividade);
            if(escolha < 7 || escolha > 15 ){
                System.out.println("Escolha uma Opção valida");
            }else {
                switch (escolha) {
                    case 7 -> Atividades.Atividade_7(scanner);
                    case 8 -> Atividades.Atividade_8(scanner);
                    case 9 -> Atividades.Atividade_9();
                    case 10 -> Atividades.Atividade_10();
                    case 11 -> Atividades.Atividade_11(scanner);
                    case 12 -> Atividades.Atividade_12();
                    case 13 -> Atividades.Atividade_13();
                    case 14 -> Atividades.Atividade_14(scanner);
                    case 15 -> Atividades.Atividade_15(scanner);
                    default -> System.out.println("Não entendi o que você quis dizer tente novamente por favor");
                }
            }

        }else{
            System.out.println("Escolha uma Valor valido");
        }







    }

}