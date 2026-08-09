import java.util.ArrayList;
import java.util.List;

public class SuperHeroi {

    private String nome;
    private Sexo sexo;
    private double altura;
    private boolean identidadeSecreta;
    private List<String> habilidades;

    //a cópia defensiva é a responsável pelo impedimento de um código externo acessar e modificar o estado da lista original

    public SuperHeroi(String nome, Sexo sexo, double altura, boolean identidadeSecreta, List<String> habilidades) {
        this.nome = nome;
        this.sexo = sexo;
        this.altura = altura;
        this.identidadeSecreta = identidadeSecreta;
        this.habilidades = (habilidades != null) ? new ArrayList<>(habilidades) : new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public double getAltura() {
        return altura;
    }

    public boolean isIdentidadeSecreta() {
        return identidadeSecreta;
    }

    public String getIdentidade() {
        if (identidadeSecreta) {
            return "??? (identidade protegida)";
        }
        return nome;
    }

    public String revelarIdentidade() {
        return nome;
    }

    public List<String> getHabilidades() {
        return new ArrayList<>(this.habilidades);
    }

    public String apresentar() {
        return getIdentidade() + " - " + sexo.getDescricao() + " - " + altura + "m";
    }
}