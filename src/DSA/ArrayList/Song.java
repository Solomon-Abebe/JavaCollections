package DSA.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

class Song {
    String title;
    String artist;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    @Override
    public String toString() {
        return title + " - " + artist;
    }
}

 class MusicPlaylist {
    private ArrayList<Song> playlist;

    public MusicPlaylist() {
        this.playlist = new ArrayList<>();
    }

    // Method to add a song to the playlist
    public void addSong(String title, String artist) {
        playlist.add(new Song(title, artist));
    }

    // Method to remove a song from the playlist
    public boolean removeSong(String title, String artist) {
        Iterator<Song> iterator = playlist.iterator();
        while (iterator.hasNext()) {
            Song song = iterator.next();
            if (song.title.equals(title) && song.artist.equals(artist)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    // Method to display the playlist
    public void displayPlaylist() {
        System.out.println("Music Playlist:");
        for (Song song : playlist) {
            System.out.println("- " + song);
        }
    }

    public static void main(String[] args) {
        // Create a playlist
        MusicPlaylist playlist = new MusicPlaylist();

        // Add songs to the playlist
        playlist.addSong("The Thrill Is Gone", "B.B. King");
        playlist.addSong("Mannish Boy", "Muddy Waters");
        playlist.addSong("I'd Rather Go Blind", "Etta James");

        // Display the playlist
        playlist.displayPlaylist();

        // Remove a song from the playlist
        playlist.removeSong("Mannish Boy", "Muddy Waters");

        // Display the updated playlist
        System.out.println("\n Playlist after removing 'Mannish Boy' by Muddy Waters:\n");
        playlist.displayPlaylist();
    }
}
