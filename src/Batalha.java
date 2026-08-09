import java.util.ArrayList;
import java.util.List;

public class Batalha {

    private List<Personagem> participantes;

    public Batalha() {
        participantes = new ArrayList<>();
    }

    public void adicionar(Personagem p) {
        if (p == null) {
            return;
        }

        if (!participantes.contains(p)) {
            participantes.add(p);
        }
    }

    public void iniciar() {
        for (Personagem p : participantes) {
            p.agir();
        }
    }

    public List<SuperHeroi> listarHerois() {
        List<SuperHeroi> herois = new ArrayList<>();

        for (Personagem p : participantes) {
            if (p instanceof SuperHeroi) {
                herois.add((SuperHeroi) p);
            }
        }

        return herois;
    }

    public Personagem maisAlto() {
        if (participantes.isEmpty()) {
            return null;
        }

        Personagem maisAlto = participantes.get(0);

        for (Personagem p : participantes) {
            if (p.getAltura() > maisAlto.getAltura()) {
                maisAlto = p;
            }
        }

        return maisAlto;
    }

    public void removerDerrotado(String nomeDeGuerra) {
        for (int i = 0; i < participantes.size(); i++) {
            Personagem p = participantes.get(i);

            if (p instanceof SuperHeroi) {
                SuperHeroi heroi = (SuperHeroi) p;

                if (heroi.getNomeDeGuerra().equals(nomeDeGuerra)) {
                    participantes.remove(i);
                    return;
                }
            }
        }
    }
}