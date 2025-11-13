import java.util.ArrayList;
import java.util.List;

public class SituacaoAprendizagem05 {

    //demonstrar o while
    public void demonstrarWhile(){
        int cont = 0;
        while(cont<=6){
            System.out.println("Fundamentos de Programação");
            cont = cont + 1;
        }
    }
    public void demonstrarFor(){
        //inicialização ; condição ; incremento
        for(int cont=0;cont<=9;cont++){
            System.out.println("Fundamentos de Programação");
        }
    }
    //30 anos
    //Java 5 - Collections
    public void demonstrarCollection(){
        //criar coleção
        List<String> niveisCurso = new  ArrayList<>();

        //adiciona na coleção
        niveisCurso.add("Base - Fundamentos de Programação");
        niveisCurso.add("Nivel 1 - Aplicações Web com Java e Spring");
        niveisCurso.add("Nível 2 - APIs Seguras, Microserviços, CI/CD");
        niveisCurso.add("Nível 3- Sistemas Reativos, Observabilidade e Arquitetura Avançada");
        //for-each ou for aprimorado
        for(String nivel:niveisCurso){
            System.out.println(nivel);
        }
    }
}
