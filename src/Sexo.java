public enum Sexo {
    MULHER("mulher"),
    HOMEM("homem"),
    OUTRO("outro"),
    PREFIRO_NAO_DIZER("prefiro_nao_dizer");

    private final String descricao;

    Sexo(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }
}
