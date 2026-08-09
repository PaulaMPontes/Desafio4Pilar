public class Civil extends Personagem {

    private String profissao;

    public Civil(String nome, Sexo sexo, double altura, String profissao) {
        super(nome, sexo, altura);
        this.profissao = profissao;
    }

    public String getProfissao() {
        return profissao;
    }

    @Override
    public String apresentar() {
        return getNome() + " - "
                + getSexo().getDescricao()
                + " - " + getAltura()
                + "m - Profissão: " + profissao;
    }

    @Override
    public void agir() {
        System.out.println("O civil pediu socorro!");
    }
}