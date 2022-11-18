package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    private static ArrayList<Album> albums =new ArrayList<Album>();

    public static void main(String[] args) {
	// write your code here

        Album album =new Album("Strombringer","Deep Purple");
        album.addSong("Strombringer",4.06);
        album.addSong("A",4.26);
        album.addSong("V",3.46);
        album.addSong("C",2.56);
        album.addSong("D",5.43);
        album.addSong("T",2.46);
        albums.add(album);

        album=new Album("For those about","AC/DC");
        album.addSong("A",2.60);
        album.addSong("B",3.40);
        album.addSong("C",3.24);
        album.addSong("D",4.54);
        album.addSong("E",2.47);
        albums.add(album);


        LinkedList<Song> playList =new LinkedList<Song>();
        albums.get(0).addToPlayList("Strombringer",playList);
        albums.get(0).addToPlayList("A",playList);
        albums.get(0).addToPlayList("v",playList);
        albums.get(0).addToPlayList("c",playList);
        albums.get(0).addToPlayList(5,playList);
        albums.get(1).addToPlayList(1,playList);
        albums.get(2).addToPlayList(2,playList);
        albums.get(3).addToPlayList(3,playList);

        play(playList);
    }

    private static void play(LinkedList<Song> playList){
        ListIterator<Song>listIterator =playList.listIterator();
        if(playList.size()==0){
            System.out.println("No songs in playlist ");
            return;
        }
        else {
            System.out.println("Now Playing "+listIterator.next().toString());
        }
    }
}
