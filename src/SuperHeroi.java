import java.util.ArrayList;
import java.util.List;

public class SuperHeroi extends Personagem {

    private String nomeDeGuerra;
    private boolean identidadeSecreta;
    private List<String> habilidades;

    public SuperHeroi(String nome, Sexo sexo, double altura,
                      String nomeDeGuerra,
                      boolean identidadeSecreta,
                      List<String> habilidades) {

        super(nome, sexo, altura);

        this.nomeDeGuerra = nomeDeGuerra;
        this.identidadeSecreta = identidadeSecreta;
        this.habilidades = (habilidades != null)
                ? new ArrayList<>(habilidades)
                : new ArrayList<>();
    }

    public String getNomeDeGuerra() {
        return nomeDeGuerra;
    }

    public boolean isIdentidadeSecreta() {
        return identidadeSecreta;
    }

    public String getIdentidade() {
        if (identidadeSecreta) {
            return "??? (identidade protegida)";
        }

        return getNome();
    }

    public String revelarIdentidade() {
        return getNome();
    }

    public List<String> getHabilidades() {
        return new ArrayList<>(this.habilidades);
    }

    @Override
    public String apresentar() {
        return getNomeDeGuerra() + " - " + getSexo().getDescricao() + " - " + getAltura() + "m";
    }

    @Override
    public void agir() {
        usarHabilidade();
    }

    public void usarHabilidade() {
        if (habilidades.isEmpty()) {
            System.out.println("O herói não possui habilidades.");
            return;
        }

        System.out.println("Usou a habilidade: " + habilidades.get(0));
    }

    public void usarHabilidade(int indice) {
        if (indice >= 0 && indice < habilidades.size()) {
            System.out.println("Usou a habilidade: " + habilidades.get(indice));
        } else {
            System.out.println("Índice de habilidade inválido.");
        }
    }

    public void usarHabilidade(String nome) {
        if (habilidades.contains(nome)) {
            System.out.println("Usou a habilidade: " + nome);
        } else {
            System.out.println("Habilidade não encontrada: " + nome);
        }
    }
}