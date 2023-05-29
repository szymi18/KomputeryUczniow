public class Osoba {
    private final String imie;
    private final String nazwisko;
    private final String PESEl;

    public Osoba(String imie, String nazwisko, String PESEl) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.PESEl = PESEl;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getPESEl() {
        return PESEl;
    }

    public String setImie() {
        return imie;
    }

    public String setNazwisko() {
        return nazwisko;
    }

    public String setPESEl() {
        return PESEl;
    }

}
