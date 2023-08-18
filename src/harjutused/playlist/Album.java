package harjutused.playlist;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private String name;
    private String artist;
    private SongList songList;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songList = new SongList();
    }
    public boolean addSong(String title, double duration){
       return this.songList.add(new Song(title, duration));

        /*if (findSong(title)== null){ // lugu pole veel listis olemas
            this.songList.add(new Song(title, duration));
            System.out.println(title + " lisatud edukalt albumisse: " + this.name);
            return true;
        } else {
            System.out.println("laul on juba albumis");
            //juhul kui pole null, st lugu on juba olemas
            return false;

         */
        }


    public boolean addToPlaylist (int trackNumber, List<Song> playList){
        int index = trackNumber - 1;
        if ((index>=0) && (index<=this.songList.songs.size())){
            playList.add(this.songList.songs.get(index));
            return true;
        }
        System.out.println("Seda laulu pole ");
        return false;
        //lisa lugu playlisti indeksi järgi ( ideaalis indeks +1 kuna inimene alustab lugemist 1-st)
    }

    public boolean addToPlaylist (String title, List<Song> playList){
        Song checkedSong = this.songList.findSong(title); // kui ei leia, siis null
        if (checkedSong != null){
            playList.add(checkedSong);
            return true;
        }
        System.out.println("Lugu ei leitud");
        return false;
        //lisa lugu playlisti nime järgi
    }



    private class SongList{

        private List<Song> songs;

        public SongList() {
            this.songs = new ArrayList<>();
        }

        public boolean add (Song song){
            if (songs.contains(song)){
                return false;
            }
            this.songs.add(song);
            return true;
        }
        private Song findSong (String title){
            for (Song checkedSong : this.songs){
                //enhanced for loop
                // for each
                if (checkedSong.getTitle().equals(title)){
                    return checkedSong;
                }
            }
            return null;
            //otsi lugu nime järgi
        }
    }
}
