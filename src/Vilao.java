public class Vilao extends Personagem {
//vilao nao é subclasse de superheroi pois, as duas classes sao especializações de personagem e possuem caracteristicas proprias
    private int nivelDeAmeaca;

    public Vilao(String nome, Sexo sexo, double altura, int nivelDeAmeaca) {

        super(nome, sexo, altura);

        if (nivelDeAmeaca < 1 || nivelDeAmeaca > 10) {
            throw new IllegalArgumentException(
                    "Nível de ameaça deve estar entre 1 e 10."
            );
        }

        this.nivelDeAmeaca = nivelDeAmeaca;
    }

    public int getNivelDeAmeaca() {
        return nivelDeAmeaca;
    }

    @Override
    public String apresentar() {
        return getNome() + " - " + getSexo().getDescricao() + " - " + getAltura() + "m - Nível de ameaça: " + nivelDeAmeaca;
    }
}