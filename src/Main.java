public class Main {
    public static void main(String[] args) {
        SuperHeroi h = new SuperHeroi();
        h.nome = "Lisiane Reips";
        h.sexo = Sexo.MULHER;
        h.altura = 1.75;
        h.identidadeSecreta = true;
        h.habilidades = new String[] { "super força", "visão de raio-x", "voar",
                "super velocidade", "sopro congelante" };
        h.mostrar();

        // O vilão consegue fazer isto. Por quê? ---
        h.altura = -300;
        h.nome = "";
        h.mostrar();

        Personagem h = new Personagem() {
            @Override
            public String apresentar() {
                return nome + " - " + sexo.getDescricao() + " - " + altura;
            }
        };

        // Preenchendo os dados do Passo 1
        h.nome = "Lisiane Reips";
        h.sexo = Sexo.MULHER;
        h.altura = 1.75;

        // Mostra o resultado na tela
        System.out.println(h.apresentar());

    }
}