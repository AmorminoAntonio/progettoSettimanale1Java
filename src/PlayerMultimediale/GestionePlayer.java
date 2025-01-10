package PlayerMultimediale;

public class GestionePlayer {
    public static void main(String[] args) {

//immagini
        /*System.out.println("IMMAGINI section");
        Immagine img2 = new Immagine("la laconda sul mare", 2);
        img2.show();
        img2.alzaLuminosità();
        img2.alzaLuminosità();
        img2.show();
        System.out.println();
        System.out.println();*/

//video
        System.out.println("VIDEO  section");
        Video video2 = new Video("la macarena", 6);
        video2.abbassaLuminosità();
        video2.abbassaVolume();
        video2.play();



//registrazione audio
        /*System.out.println("reg. AUDIO section");
        RegistrazioneAudio audio1 = new RegistrazioneAudio("veni vidi vici", 8);
        audio1.play();
        audio1.alzaVolume();
        audio1.alzaVolume();*/




       /* elementoMultimediale img1 = new Immagine("cavallo in montagna",3);
        img1.show();

        elementoMultimediale video1 = new Video("Cosmopolitan",5);
        video1.play();

        elementoMultimediale audio1 = new RegistrazioneAudio("Lamentino",4);
        audio1.play();

        elementoMultimediale[] lista = new elementoMultimediale[5];
       System.out.println(Arrays.toString(lista));*/
    }
}
