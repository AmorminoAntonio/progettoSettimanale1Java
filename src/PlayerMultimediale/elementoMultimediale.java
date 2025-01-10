package PlayerMultimediale;

public abstract class elementoMultimediale {

    protected int durata;
    protected String titolo;


    public elementoMultimediale(String titolo, int durata) {
        this.titolo = titolo;
        this.durata = durata;
    }

    public elementoMultimediale(String titolo) {
        this.titolo = titolo;
    }


}
