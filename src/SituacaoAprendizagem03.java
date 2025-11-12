public class SituacaoAprendizagem03 {

    private String nomeClasse;
    private String nomeMetodo;
    private String nomeConstante;
    private String nomeVariavel;

    public SituacaoAprendizagem03(){

    }

    public SituacaoAprendizagem03(String nomeClasse,
                                  String nomeMetodo,
                                  String nomeConstante,
                                  String nomeVariavel) {
        this.nomeClasse = nomeClasse;
        this.nomeMetodo = nomeMetodo;
        this.nomeConstante = nomeConstante;
        this.nomeVariavel = nomeVariavel;
    }
    //Criar um "metodo" para verificar o nome da classe fornecida
    //A classe segue o padrão PascalCase
    //Criar um "metodo" para verificar se o nome do metodo fornecido esta correto"
      //camelCase
    //Criar um "metodo" para verificar se o nome da constante segue o padrão
      //Screaming Snake Case
      //MINHA_VARIAVEL_PI


    public String getNomeClasse() {
        return nomeClasse;
    }

    public void setNomeClasse(String nomeClasse) {
        this.nomeClasse = nomeClasse;
    }

    public String getNomeMetodo() {
        return nomeMetodo;
    }

    public void setNomeMetodo(String nomeMetodo) {
        this.nomeMetodo = nomeMetodo;
    }

    public String getNomeConstante() {
        return nomeConstante;
    }

    public void setNomeConstante(String nomeConstante) {
        this.nomeConstante = nomeConstante;
    }

    public String getNomeVariavel() {
        return nomeVariavel;
    }

    public void setNomeVariavel(String nomeVariavel) {
        this.nomeVariavel = nomeVariavel;
    }
    public String verificaPadraoClasse(){
        if(this.nomeClasse == null ||
                this.nomeClasse.isEmpty() ||
                this.nomeClasse.contains(" ")){
            return "preencha por favor o nome da classe";
        }else{
            //o cara digitou alguma coisa !
            //extrair o primeiro caractere
            char primeiroCaractere = this.nomeClasse.charAt(0);
            if(Character.isUpperCase(primeiroCaractere)){
                return "Padrão Detectado: PascalCase";
            }else{
                return "Padrão Incorreto!";
            }
        }
    }

    //verifica padrão "metodo"

    //verifica padrão variavel

    //verifica padrao constante


}
