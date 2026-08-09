import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> habilidadesIniciais = Arrays.asList("super força", "visão de raio-x", "voar", "super velocidade",
                "sopro congelante");

        SuperHeroi h = new SuperHeroi(
                "Lisiane Reips",
                Sexo.MULHER,
                1.75,"Lis",
                true,
                habilidadesIniciais
        );

        Vilao v = new Vilao("Dr Destino",Sexo.HOMEM,1.88,10);

        System.out.println(h.apresentar());
        System.out.println(v.apresentar());

        System.out.println(h.getIdentidade());
        System.out.println(h.revelarIdentidade());
        System.out.println(h.getHabilidades());


    }
}