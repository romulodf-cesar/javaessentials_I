import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("\n" +
                "░░█ ▄▀█ █░█ ▄▀█   █▀▀ █▀ █▀ █▀▀ █▄░█ ▀█▀ █ ▄▀█ █░░ █▀   █\n" +
                "█▄█ █▀█ ▀▄▀ █▀█   ██▄ ▄█ ▄█ ██▄ █░▀█ ░█░ █ █▀█ █▄▄ ▄█   █");
        System.out.println("\uD835\uDE4C\uD835\uDE6A\uD835\uDE56\uD835\uDE61 \uD835\uDE4E\uD835\uDE3C \uD835\uDE6B\uD835\uDE64\uD835\uDE58\uD835\uDE5Â \uD835\uDE65\uD835\uDE67\uD835\uDE5A\uD835\uDE5B\uD835\uDE5A\uD835\uDE67\uD835\uDE5A❓");
        int op = leia.nextInt(); // primitiva ou Wrappers (Integer)
        System.out.println("Qual nível você se considera em Java (1 ao 3)");
        Integer nivel = leia.nextInt();
        if(nivel.equals(1)){
            System.out.println("seu nível: "+nivel+" é igual a básico");
        }else if(nivel.equals(2)){
            System.out.println("seu nível: "+nivel+" é igual a intermediário");
        }else{
            System.out.println("seu nível: "+nivel+" é igual a intermediário");
        }
        switch(op){
            case 1 -> {
                System.out.println("Situação de Aprendizagem 01");
                SituacaoAprendizagem01  sa1 = new SituacaoAprendizagem01(10,10);
                System.out.println("a soma é:"+sa1.somar());
            }

            case 2 -> System.out.println("Situação de Aprendizagem 02");
            case 3 -> System.out.println("Situação de Aprendizagem 03");
            case 4 -> System.out.println("Situação de Aprendizagem 04");
            case 5 -> System.out.println("Situação de Aprendizagem 05");
            case 6 -> System.out.println("Situação de Aprendizagem 06");
            case 7 -> System.out.println("Situação de Aprendizagem 07");
            default -> System.out.println("Opção Inválida!");
        }
    }
}
