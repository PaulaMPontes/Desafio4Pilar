public abstract class Personagem {
    private String nome;
    private double altura;
    private Sexo sexo;

    public Personagem(String nome, double altura, Sexo sexo){
        this.nome = nome;
        this.altura = altura;
        this.sexo = sexo;

    }

    public abstract String apresentar();


}
