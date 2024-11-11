public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Carte carte1 = new Carte("Java: The Complete Reference", "Herbert Schildt");
        Carte carte2 = new Carte("Python Crash Course", "Eric Matthes");
        Carte carte3 = new Carte("The C Programming Language", "Brian W. Kernighan, Dennis M. Ritchie");
        Carte carte4 = new Carte("JavaScript: The Good Parts", "Douglas Crockford");
        Carte carte5 = new Carte("Learning PHP, MySQL & JavaScript", "Robin Nixon");

        biblioteca.adaugaCarte(carte1);
        biblioteca.adaugaCarte(carte2);
        biblioteca.adaugaCarte(carte3);
        biblioteca.adaugaCarte(carte4);
        biblioteca.adaugaCarte(carte5);

        biblioteca.afiseazaCartiDisponibile();
        biblioteca.imprumutaCarte("Python Crash Course");
        biblioteca.afiseazaCartiDisponibile();
        biblioteca.returneazaCarte("Python Crash Course");
        biblioteca.afiseazaCartiDisponibile();
    }
}
