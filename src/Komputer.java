public class Komputer {
    private final int numer;
    private final boolean czyDziala;




    public Komputer(int numer, boolean czyDziala) {
        this.numer = numer;
        this.czyDziala = czyDziala;
    }

    public int getNumer() {
        return numer;
    }

    public boolean isCzyDziala() {
        return czyDziala;
    }
}
