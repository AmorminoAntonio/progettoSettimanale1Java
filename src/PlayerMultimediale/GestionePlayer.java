package PlayerMultimediale;

import java.util.Scanner;

public class GestionePlayer {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        elementiMultimediali[] lista = new elementiMultimediali[2];


        for (int i = 0; i < lista.length; i++) {
            System.out.println("Quale elemento vuoi creare(video, audio, immagine)?: ");
            String tipo = sc.nextLine();

            System.out.println("Inserisci il titolo: ");
            String titolo = sc.nextLine();

            switch (tipo.toLowerCase()) {
                case "video":
                    System.out.println("Inserisci la durata (in minuti): ");
                    int durataVideo = sc.nextInt();
                    System.out.println("Inserisci la luminosità (0-10): ");
                    int luminositàVideo = sc.nextInt();
                    System.out.println("Inserisci il volume (0-10): ");
                    int volumeVideo = sc.nextInt();
                    sc.nextLine();
                    lista[i] = new Video(titolo, durataVideo, luminositàVideo, volumeVideo);
                    break;

                case "audio":
                    System.out.println("Inserisci la durata (in minuti): ");
                    int durataAudio = sc.nextInt();
                    System.out.println("Inserisci il volume (0-10): ");
                    int volumeAudio = sc.nextInt();
                    sc.nextLine();
                    lista[i] = new RegistrazioneAudio(titolo, durataAudio, volumeAudio);
                    break;

                case "immagine":
                    System.out.println("Inserisci la luminosità (0-10): ");
                    int luminositàImmagine = sc.nextInt();
                    sc.nextLine();
                    lista[i] = new Immagine(titolo, luminositàImmagine);
                    break;

                default:
                    System.out.println("Tipo non riconosciuto, prova di nuovo.");
                    i--;
                    break;
            }
        }

        System.out.println("digita un numero da 1 a " + lista.length + " per riprodurlo oppure 0 per terminare:");

        while (true) {
            int scelta = sc.nextInt();
            sc.nextLine();

            if (scelta == 0) {
                System.out.println("Programma chiuso!");
                sc.close();
                break;
            }
            if (scelta >= 1 && scelta <= lista.length) {
                elementiMultimediali elementoScelto = lista[scelta - 1];


                switch (elementoScelto.getClass().getSimpleName().toLowerCase()) {
                    case "video":
                        (elementoScelto).playVideo();
                        break;
                    case "registrazioneaudio":
                        (elementoScelto).playAudio();
                        break;
                    case "immagine":
                        (elementoScelto).showImg();
                        break;
                    default:
                        System.out.println("Tipo di elemento non riconosciuto.");
                        break;

                }
            } else {
                System.out.println("Numero non valido. Riprova.");
            }
            System.out.println("digita un numero da 1 a " + lista.length + " per riprodurlo oppure 0 per terminare:");
        }


    }
}












