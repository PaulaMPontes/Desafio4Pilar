import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> habilidadesIniciais = Arrays.asList("super força", "visão de raio-x", "voar", "super velocidade",
                "sopro congelante");

        SuperHeroi h = new SuperHeroi("Lisiane Reips", Sexo.MULHER, -300, true, habilidadesIniciais);

    }
}