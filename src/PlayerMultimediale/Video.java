package PlayerMultimediale;

public class Video extends elementoMultimediale implements regolazioneVolume, regolazioneLuminosità {

    private int lumen;
    private int vol;

    public Video(String titolo, int durata) {
        super(titolo, durata);
        this.lumen = 5;
        this.vol = 5;
    }


    public void play() {
        for (int i = durata; i > 0; i--) {
            System.out.println("TITOLO: " + titolo + " " + "DURATA: " + durata-- + "min");
            mostraVol();
            mostraLumen();
        }
    }

    @Override
    public void alzaVolume() {
        if (vol > 0) {
            vol++;
        }
    }

    @Override
    public void abbassaVolume() {
        if (vol < 10) {
            vol--;
        }
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

    public void mostraVol() {
        System.out.println("vol: " + "!".repeat(vol));
    }
}
