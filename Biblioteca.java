import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Carte> carti;

    public Biblioteca() {
        carti = new ArrayList<>();
    }

    public void adaugaCarte(Carte carte) {
        carti.add(carte);
    }

    public void imprumutaCarte(String titlu) {
        for (Carte carte : carti) {
            if (carte.getTitlu().equalsIgnoreCase(titlu) && !carte.isEsteImprumutata()) {
                carte.imprumuta();
                System.out.println("Cartea \"" + titlu + "\" a fost împrumutată.");
                return;
            }
        }
        System.out.println("Cartea \"" + titlu + "\" nu este disponibilă.");
    }

    public void returneazaCarte(String titlu) {
        for (Carte carte : carti) {
            if (carte.getTitlu().equalsIgnoreCase(titlu) && carte.isEsteImprumutata()) {
                carte.returneaza();
                System.out.println("Cartea \"" + titlu + "\" a fost returnată.");
                return;
            }
        }
        System.out.println("Cartea \"" + titlu + "\" nu este înregistrată ca împrumutată.");
    }

    public void afiseazaCartiDisponibile() {
        System.out.println("Cărți disponibile:");
        for (Carte carte : carti) {
            if (!carte.isEsteImprumutata()) {
                System.out.println("- " + carte.getTitlu());
            }
        }
    }
}
