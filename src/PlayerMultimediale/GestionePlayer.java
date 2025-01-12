package PlayerMultimediale;

import java.util.Scanner;

public class GestionePlayer {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        elementiMultimediali[] lista = new elementiMultimediali[5];


        for (int i = 0; i < lista.length; i++) {
            System.out.println("Quale elemento vuoi creare(video, audio, immagine)?: ");
            String tipo = sc.nextLine();

            System.out.println("Inserisci il titolo: ");
            String titolo = sc.nextLine();

            switch (tipo.toLowerCase()) {
                case "video":
                    System.out.println("Inserisci la durata (in minuti): ");
                    int durata = sc.nextInt();
                    System.out.println("Inserisci la luminosità (0-10): ");
                    int luminosità = sc.nextInt();
                    System.out.println("Inserisci il volume (0-10): ");
                    int volume = sc.nextInt();
                    sc.nextLine();
                    lista[i] = new Video(titolo, durata, luminosità, volume);
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
            } else if (scelta >= 1 && scelta <= lista.length) {
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
                System.out.println("elemento non valido. Riprova.");
            }
            System.out.println("digita un numero da 1 a " + lista.length + " per riprodurlo oppure 0 per terminare:");
        }


    }
}












