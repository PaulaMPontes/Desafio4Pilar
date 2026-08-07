public abstract class Personagem {

    private String nome;
    private Sexo sexo;
    private double altura;

    public Personagem(String nome, Sexo sexo, double altura) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio.");
        }
        if (altura < 0.5 || altura > 3.0) {
            throw new IllegalArgumentException("Altura deve estar entre 0.5m e 3.0m.");
        }
        this.nome = nome;
        this.sexo = sexo;
        this.altura = altura;
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

    public void setAltura(double altura) {
        if (altura < 0.5 || altura > 3.0) {
            throw new IllegalArgumentException("Altura deve estar entre 0.5m e 3.0m.");
        }
        this.altura = altura;
    }

    public abstract String apresentar();
}