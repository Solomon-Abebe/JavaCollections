package DSA.Linkedlist;

class Song {
    private final String title;
    private final String artist;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public String toString() {
        return title + " by " + artist;
    }
}

class Playlist {
    private Node head;

    static private class Node {
        Song song;
        Node next;

        public Node(Song song) {
            this.song = song;
            this.next = null;
        }
    }


    public void addSong(Song song) {//insert at the end
        Node newNode = new Node(song);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void removeSong(String title) {
        if (head == null) {
            return;
        }
        if (head.song.getTitle().equals(title)) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.song.getTitle().equals(title)) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public boolean containsSong(String title) {
        Node current = head;
        while (current != null) {
            if (current.song.getTitle().equals(title)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void displayPlaylist() {
        Node current = head;
        while (current != null) {
            System.out.println(current.song);
            current = current.next;
        }
    }
}

 class PlaylistManager {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();

        // Adding songs to the playlist
        playlist.addSong(new Song("Song 1: Thrill is Gone", "Artis 1: B.B. King"));
        playlist.addSong(new Song("Song 2: Mannish Boy", "Artist 2: Muddy Waters"));
        playlist.addSong(new Song("Song 3: I'd Rather Go Blind", "Artist 3: Etta James"));

        // Displaying the playlist
        System.out.println("Playlist:");
        playlist.displayPlaylist();

        // Removing a song
        playlist.removeSong("Song 2: Mannish Boy");
        System.out.println("\nPlaylist after removing Song 2:\n");
        playlist.displayPlaylist();

        // Searching for a song
        String titleToSearch = "Song 3: I'd Rather Go Blind";
        System.out.println("\n Does the playlist contain " + titleToSearch + "? " + playlist.containsSong(titleToSearch));
    }
}
