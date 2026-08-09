import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        SuperHeroi heroi = new SuperHeroi(
                "Lisiane Reips",
                Sexo.MULHER,
                1.75,
                "Profa. Código",
                true,
                Arrays.asList("super força", "visão de raio-x", "voar"));

        Vilao vilao = new Vilao(
                "Doutor Código-Espaguete",
                Sexo.HOMEM,
                1.80,
                10);

        List<Personagem> personagens = new ArrayList<>();
        personagens.add(heroi);
        personagens.add(vilao);

        System.out.println("=== TESTANDO O POLIMORFISMO ===");

        for (Personagem p : personagens) {
            System.out.println(p.apresentar());
            p.agir();
            System.out.println(p.toString());
            System.out.println("---------------------------------");
        }

        System.out.println("=== TESTANDO SOBRECARGAS DO HERÓI ===");
        heroi.usarHabilidade();
        heroi.usarHabilidade(1);
        heroi.usarHabilidade(99);
        heroi.usarHabilidade("Sopro congelante");
    }
}