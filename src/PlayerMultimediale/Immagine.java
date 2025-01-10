package PlayerMultimediale;

public class Immagine extends elementoMultimediale implements regolazioneLuminosità {

    private int lumen;

    public Immagine(String titolo, int lumen) {
        super(titolo, lumen);
        this.lumen = 5;
    }

    public void show() {
        System.out.println("TITOLO : " + titolo);
        mostraLumen();

    }

    @Override
    public void alzaLuminosità() {
        if (lumen > 0) {
            lumen++;
        }
    }

    @Override
    public void abbassaLuminosità() {
        if (lumen < 10) {
            lumen--;
        }
    }

    public void mostraLumen() {
        System.out.println("lumen: " + "*".repeat(lumen));
    }
}

