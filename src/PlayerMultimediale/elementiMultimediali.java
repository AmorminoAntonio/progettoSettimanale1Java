package PlayerMultimediale;

public abstract class elementiMultimediali implements regolazioneVolume, regolazioneLuminosità {

    protected int durata;
    protected String titolo;
    protected int luminosità;
    protected int volume;


    //video
    public elementiMultimediali(String titolo, int durata, int luminosità, int volume) {
        this.titolo = titolo;
        this.durata = durata;
        this.luminosità = luminosità;
        this.volume = volume;
    }

    //audio
    public elementiMultimediali(String titolo, int durata, int vol) {
        this.titolo = titolo;
        this.durata = durata;
        this.volume = volume;
    }

    //immagine
    public elementiMultimediali(String titolo, int luminosità) {
        this.titolo = titolo;
        this.luminosità = luminosità;
    }

    public void showImg() {
        System.out.println("TITOLO : " + titolo + " " + "LUMINOSITA': " + "*".repeat(luminosità));
    }

    public void playVideo() {
        for (int i = durata; i > 0; i--) {
            if (durata != 0) {
                System.out.println("TITOLO: " + titolo + " " + "DURATA: " + durata-- + "min" + " " + "LUMINOSITA': " + "*".repeat(luminosità) + " " + "VOLUME: " + "!".repeat(volume));
            } else {
                break;
            }

        }
    }

    public void playAudio() {
        for (int i = durata; i > 0; i--) {
            if (durata != 0) {
                System.out.println("TITOLO: " + titolo + " " + "DURATA: " + durata-- + "min" + " " + "VOLUME: " + "!".repeat(volume));
            } else {
                break;
            }

        }
    }

    public void stampaElementoImg() {
        System.out.println("TITOLO : " + titolo + " " + "LUMINOSITA': " + "*".repeat(luminosità));
    }

    public void stampaElementoVideo() {
        System.out.println("TITOLO: " + titolo + " " + "DURATA: " + durata-- + "min" + " " + "LUMINOSITA': " + "*".repeat(luminosità) + " " + "VOLUME: " + "!".repeat(volume));
    }

    public void stampaElementoAudio() {
        System.out.println("TITOLO: " + titolo + " " + "DURATA: " + durata-- + "min" + " " + "VOLUME: " + "!".repeat(volume));
    }

    @Override
    public void alzaVolume() {
        if (volume < 10) {
            volume++;
        } else if (volume == 10) {
            System.out.println("volume al già MASSIMO.");
        }
    }

    @Override
    public void abbassaVolume() {
        if (volume > 0) {
            volume--;
        } else if (volume == 0) {
            System.out.println("volume già al MINIMO.");
        }
    }


    @Override
    public void alzaLuminosità() {
        if (luminosità < 10) {
            luminosità++;
        } else if (luminosità == 10) {
            System.out.println("luminosità già al MASSIMO.");
        }
    }

    @Override
    public void abbassaLuminosità() {
        if (luminosità > 0) {
            luminosità--;
        } else if (luminosità == 0) {
            System.out.println("luminosità già al MINIMO.");
        }
    }
}
