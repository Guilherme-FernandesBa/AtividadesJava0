import java.util.Scanner;
import java.util.regex.Pattern;

public class Atividades {
    private static final Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
    public static void Atividade_7(Scanner scanner){
        /*
        Atividade 7

        Ler dois valores para as variáveis A e B, efetuar a troca dos valores de forma que a variável A passe a possuir
        o valor da variável B e que a variável B passe a possuir o valor da variável A. Apresentar os valores trocados.

        */

        // Setando Variável
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
        System.out.println("Insira o valor da variável A: ");
        String variavelA = scanner.next();
        System.out.println("Insira o valor da variável B: ");
        String variavelB = scanner.next();
        String variavelC = variavelA;

        //programa
        System.out.println("Valor Das variaveis:\nA = " + variavelA + "\nB = " + variavelB);
        variavelA = variavelB;
        variavelB = variavelC;
        System.out.println("Valor Das variaveis Trocado:\nA = " + variavelA + "\nB = " + variavelB);
    }

    public static void Atividade_8(Scanner scanner) {
        /*
         Atividade 8
         Escreva uma classe que verifica se um dado número inteiro é par ou ímpar.

        */

        System.out.println(new Object() {}.getClass().getEnclosingMethod().getName());
        System.out.println("Insira o valor Para descobrir se o Numero é par ou impar ");
        String numero = scanner.next();
        if (isNumeric(numero)) {
            double verificar = Double.parseDouble(numero);
            if (verificar % 2 == 0)
                System.out.println("Numero Par - " + verificar);
            else
                System.out.println("Numero Impar - " + verificar);
        } else {
            System.out.println("Insira um valor Valido Por favor!");
        }
    }

    public static void Atividade_9(){
        /*

         Atividade 9
         Encontre o quadrado dos números de 0 até 10. Utilize o controle de fluxo for.

        */
        System.out.println(new Object() {}.getClass().getEnclosingMethod().getName());
        System.out.println("Printando quadrado dos Numeros\n");
        for (int i = 0; i< 10; i++)
        {
            System.out.println(i + " ao quadrado e igual a " + Math.pow(i, 2));
        }
    }

    public static void Atividade_10(){
        /*

         Atividade 10
         Faça um programa com 3 variáveis do tipo inteiro (int) tal que a primeira tenha o valor de 6, a segunda o valor 4
          e a terceira receba o valor da divisão da primeira pela segunda. Exiba o valor da terceira variável.
          Faça uma análise do resultado.


        */

        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
        int primeira = 6;
        int segunda = 4;
        int terceira = primeira/segunda;
        System.out.println("Valor da Terceira = " + terceira+"\n");

        /*
        Ponto da atividade é mostrar como int não tem numero quebrado então a resposta vai ser 1 e não 1.5
        */

    }

    public static void Atividade_11(Scanner scanner){
        /*
        Atividade 11

        Utilize a estrutura if para fazer um programa que retorne o nome de um produto a partir do código do mesmo.
        Considere os seguintes códigos:

        001 ? Parafuso;
        002 ? Porca;
        003 ? Prego;

        */
        System.out.println(new Object() {}.getClass().getEnclosingMethod().getName());
        System.out.println("Insira o codigo para retornar um produto:");
        String codigo = scanner.next();
        if(codigo.equals("001")){
            System.out.println("001 - Parafuso");
        }else if(codigo.equals("002")){
            System.out.println("002 - Porca");
        }else if(codigo.equals("003")){
            System.out.println("003 - Prego");
        } else{
            System.out.println(codigo +" - Diversos");
        }
    }

    public static void Atividade_12() {
        /*
        Atividade 12

        Imprima o resultado da divisão por 2 de todos os múltiplos de 3, entre 1 e 100,
        usando os tipos de dados int e double .

        */
        System.out.println(new Object() {}.getClass().getEnclosingMethod().getName());

        for (double i = 1; i< 100; i++){
            if(i % 3 == 0){
                double divisao = i/2;
                System.out.println(i + " divido por 2 é igual a " + divisao);
            }
        }

    }

    public static  void  Atividade_13(){
         /*
        Atividade 13

        Escreva uma classe que imprima todas as possibilidades de que no lançamento de dois dados tenhamos o valor 7
        como resultado da soma dos valores de cada dado.

        */

        System.out.println(new Object() {}.getClass().getEnclosingMethod().getName());
        for (int i=1; i<=6; i++) {
            for (int j =1; j <=6; j ++) {
                if ((i + j ) == 7)
                    System.out.println(i + " + " + j  + " = 7");
            }
        }
    }

    public static  void  Atividade_14(Scanner scanner){
        /*
        Atividade 14
        Faça um programa que utilize a estrutura while para ler 50 números e calcule e exiba a média aritmética deles.
        (Pesquise sobre como realizar entrada de dados)
        */
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
        System.out.println("Insira o valor do limite de numeros: ");
        double numeros = 0;
        int contador = 0;
        double media;
        int limite = scanner.nextInt();
        System.out.println("Insira os numeros para fazer a media: ");
        while (contador <limite){
            numeros += scanner.nextDouble();
            contador++;
        }
        media = numeros/limite;
        System.out.println("A media é de : " +media);
    }

    public static  void  Atividade_15(Scanner scanner){
        /*
        Atividade 14
         Refaça o programa anterior utilizando a estrutura do while.
        */
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
        System.out.println("Insira o valor do limite de numeros: ");
        double numeros = 0;
        int contador = 0;
        double media;
        int limite = scanner.nextInt();
        System.out.println("Insira os numeros para fazer a media: ");
        do {
            numeros += scanner.nextDouble();
            contador++;
        } while (contador <limite);
        media = numeros/limite;
        System.out.println("A media é de : " +media);
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        return pattern.matcher(strNum).matches();
    }
}
