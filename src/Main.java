import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> habilidadesIniciais = Arrays.asList("super força", "visão de raio-x", "voar", "super velocidade",
                "sopro congelante");

        SuperHeroi h = new SuperHeroi(
                "Lisiane Reips",
                Sexo.MULHER,
                1.75,
                true,
                habilidadesIniciais
        );

        System.out.println(h.apresentar());
        System.out.println(h.getIdentidade());
        System.out.println(h.revelarIdentidade());
        System.out.println(h.getHabilidades());

        List<String> habilidades = h.getHabilidades();

        habilidades.add("teletransporte");

        System.out.println("Lista alterada externamente: " + habilidades);
        System.out.println("Lista do herói: " + h.getHabilidades());
    }
}