public class Carte {
    private String titlu;
    private String autor;
    private boolean esteImprumutata;

    public Carte(String titlu, String autor) {
        this.titlu = titlu;
        this.autor = autor;
        this.esteImprumutata = false;
    }

    public String getTitlu() {
        return titlu;
    }

    public boolean isEsteImprumutata() {
        return esteImprumutata;
    }

    public void imprumuta() {
        if (!esteImprumutata) {
            esteImprumutata = true;
        }
    }

    public void returneaza() {
        if (esteImprumutata) {
            esteImprumutata = false;
        }
    }
}
