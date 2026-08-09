import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> habilidadesIniciais = Arrays.asList(
                "super força",
                "visão de raio-x",
                "voar",
                "super velocidade",
                "sopro congelante"
        );


        SuperHeroi h = new SuperHeroi(
                "Lisiane Reips",
                Sexo.MULHER,
                1.75,
                "Lis",
                true,
                habilidadesIniciais
        );


        SuperHeroi h2 = new SuperHeroi(
                "Jean",
                Sexo.MULHER,
                1.68,
                "Fênix",
                false,
                Arrays.asList("telepatia", "voar")
        );


        Vilao v = new Vilao(
                "Dr Destino",
                Sexo.HOMEM,
                1.88,
                10
        );


        Vilao v2 = new Vilao(
                "Lex",
                Sexo.HOMEM,
                1.92,
                7
        );


        Civil c = new Civil(
                "João",
                Sexo.HOMEM,
                1.75,
                "Professor"
        );


        Civil c2 = new Civil(
                "Ana",
                Sexo.MULHER,
                1.70,
                "Médica"
        );

        Batalha batalha = new Batalha();

        batalha.adicionar(h);
        batalha.adicionar(h2);
        batalha.adicionar(v);
        batalha.adicionar(v2);
        batalha.adicionar(c);
        batalha.adicionar(c2);

        System.out.println("-- BATALHA --");
        batalha.iniciar();

        System.out.println("\n-- HERÓIS --");
        for (SuperHeroi heroi : batalha.listarHerois()) {
            System.out.println(heroi.getNomeDeGuerra());
        }

        System.out.println("\n-- MAIS ALTO --");
        Personagem maisAlto = batalha.maisAlto();

        if (maisAlto != null) {
            System.out.println(
                    maisAlto.getNome() + " - " +
                            maisAlto.getAltura() + "m"
            );
        }

        System.out.println("\n-- REMOÇÃO --");
        batalha.removerDerrotado("Lis");

        System.out.println("Heróis após remoção:");
        for (SuperHeroi heroi : batalha.listarHerois()) {
            System.out.println(heroi.getNomeDeGuerra());
        }
    }
}