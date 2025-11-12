public class SituacaoAprendizagem02 {

    private String nomeCanal;
    private String descricao;
    private double qtdeInscritos;
    private boolean conheceCanal;
    private String url;
    private int qtdeHoras;
    private boolean temShorts;
    private double qtdeVisualizacao;

    public int getQtdeHoras() {
        return qtdeHoras;
    }

    public void setQtdeHoras(int qtdeHoras) {
        this.qtdeHoras = qtdeHoras;
    }

    public boolean isTemShorts() {
        return temShorts;
    }

    public void setTemShorts(boolean temShorts) {
        this.temShorts = temShorts;
    }

    public double getQtdeVisualizacao() {
        return qtdeVisualizacao;
    }

    public void setQtdeVisualizacao(double qtdeVisualizacao) {
        this.qtdeVisualizacao = qtdeVisualizacao;
    }

    public SituacaoAprendizagem02(){}

    public SituacaoAprendizagem02(String nomeCanal,
                                  String descricao,
                                  double qtdeInscritos,
                                  boolean conheceCanal,
                                  String url) {
        this.nomeCanal = nomeCanal;
        this.descricao = descricao;
        this.qtdeInscritos = qtdeInscritos;
        this.conheceCanal = conheceCanal;
        this.url = url;
    }

    public String getNomeCanal() {
        return nomeCanal;
    }

    public void setNomeCanal(String nomeCanal) {
        this.nomeCanal = nomeCanal;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getQtdeInscritos() {
        return qtdeInscritos;
    }

    public void setQtdeInscritos(double qtdeInscritos) {
        this.qtdeInscritos = qtdeInscritos;
    }

    public boolean isConheceCanal() {
        return conheceCanal;
    }

    public void setConheceCanal(boolean conheceCanal) {
        this.conheceCanal = conheceCanal;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    public String verificaInscritos(){

        /*
             Ter pelo menos 500 inscritos e 3 mil horas de exibição pública
             Exibição em vídeos longos nos últimos 365 dias
             ou
             3 milhões de visualizações e shorts no últimos 90 dias

         */
        if(this.qtdeInscritos >= 500 &&
                this.qtdeHoras == 3000
                || this.qtdeVisualizacao>=3000000 && this.temShorts==true){
            return "monetizado";

        }else{
            return "não monetizado";
        }


    }
}
