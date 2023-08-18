package harjutused.playlist;

import java.util.*;

public class Main {
    /*
    Teeme programm, mis imiteerib laulude playlisti
    Song klass - nimi ja pikkus (double)
    Album - nimi, artist, list lauludest
    Laule erinevatest albumistest saab lisada playlisti
    Kui laulud on lisatud, siis menüü

     */

    private static List<Album> albums = new ArrayList<>();

    public static void main(String[] args) {

        Album album = new Album("Album 1", "Juku");
        album.addSong("a1", 1);
        album.addSong("a2", 2);
        album.addSong("a3", 3);
        album.addSong("a4", 4);
        album.addSong("a5", 5);
        album.addSong("a6", 6);
        albums.add(album);

        album = new Album("Album 2", "Juhan");
        album.addSong("B1", 1);
        album.addSong("B2", 2);
        album.addSong("B3", 3);
        album.addSong("B4", 4);
        album.addSong("B5", 5);
        album.addSong("B6", 6);
        albums.add(album);

        List<Song> playList = new LinkedList<>();
        albums.get(0).addToPlaylist("a1", playList);
        albums.get(0).addToPlaylist("a3", playList);
        albums.get(0).addToPlaylist(2, playList);
        albums.get(0).addToPlaylist(4, playList);

        albums.get(1).addToPlaylist("B2", playList);
        albums.get(1).addToPlaylist("B4", playList);
        albums.get(1).addToPlaylist(5, playList);
        albums.get(1).addToPlaylist(6, playList);

        albums.get(0).addToPlaylist("C1", playList);
        albums.get(1).addToPlaylist(9, playList);


        play(playList);

    }

    private static void play(List<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = false;
        ListIterator<Song> songListIterator = playList.listIterator();

        if (playList.isEmpty()) {
            System.out.println("Playlist on tühi");
            return;
        } else {
            System.out.println("hetkel mängib " + songListIterator.next().toString());
            //.toString() pole vajalik, tuleb automaatslt

        }
        printMenu();

        while (!quit) {
            System.out.println("Sisesta valik:");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("lõpetab mängimise");
                    quit = true;
                    break;
                case 1: // edasi
                    if (!forward) {
                        if (songListIterator.hasNext()) {
                            songListIterator.next();
                        }
                        forward = true;
                    }
                    if (songListIterator.hasNext()) {
                        System.out.println("Hetkel mängib " + songListIterator.next());
                    } else {
                        System.out.println("Jõudsime listi lõppu");
                        forward = false;
                    }
                    break;
                case 2:
                    if (forward) {
                        if (songListIterator.hasPrevious()) {
                            songListIterator.previous();
                        }
                        forward = false;
                    }
                    if (songListIterator.hasPrevious()) {
                        System.out.println("Hetkel mängib " + songListIterator.previous());
                    } else {
                        System.out.println("Jõudsime algusesse");
                        forward = true;
                    }
                    break;
                case 3: //replay
                    if (forward) {
                        //viide eelmisele
                        if (songListIterator.hasPrevious()) {
                            System.out.println("hetkel mängib " + songListIterator.previous());
                            forward = false;
                        } else {

                            System.out.println("Jõudsime algusesse");
                        }
                    } else {
                        if (songListIterator.hasNext()) {
                            System.out.println("taasesitab " + songListIterator.next());
                            forward = true;
                        } else {
                            System.out.println("olema listi lpus");
                        }
                        // viide järgmisele
                    }
                    break;

                case 4: //kuvab listis olevad lood
                    printList(playList);
                    break;

                case 5: //prinib menüü
                    printMenu();
                    break;

                case 6: //remove
                    if (playList.size() > 0) {
                        songListIterator.remove();
                        System.out.println("Lugu kustutatud");
                        if (songListIterator.hasNext()) {
                            System.out.println("Käib lugu: " + songListIterator.next());
                        } else if (songListIterator.hasPrevious()) {
                            System.out.println("Käib lugu " + songListIterator.previous());
                        } else {
                            System.out.println("Kustutati viimane lugu, list on tühi");
                        }

                    } else {
                        System.out.println("Ei saa kustutada, list on tühi. Väljun");
                        quit = true;
                    }
                    break;

            }
        }

    }

    private static void printMenu() {
        System.out.println("""
                Valikud:
                0 - välju
                1 - järgmine lugu
                2 - eelmine lugu
                3 - korda lugu
                4 - kuva listis olevad lood
                5 - prindi valikud
                6 - kustuta lugu
                """);
    }

    private static void printList(List<Song> playList) {
        Iterator<Song> iterator = playList.iterator();
        System.out.println("==========================");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("=========================");
    }
}
