package PlayerMultimediale;

public class RegistrazioneAudio extends elementoMultimediale implements regolazioneVolume {

    private int vol;

    public RegistrazioneAudio(String titolo, int durata) {
        super(titolo, durata);
        this.vol = 5;
    }

    public void play() {
        for (int i = durata; i > 0; i--) {
            System.out.println("TITOLO: " + titolo + " " + "DURATA: " + durata-- + "min");
            mostraVol();
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

    public void mostraVol() {
        System.out.println("vol: " + "!".repeat(vol));
    }
}
