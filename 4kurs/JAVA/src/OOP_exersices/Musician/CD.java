package Musician;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class CD extends MusicCarrier{

    private HashMap<String,Float> albumSongsLengths;

    private HashMap<String,String> album;

    public CD(Group group, String albumName) {
        super(group, albumName);
        this.albumSongsLengths = new HashMap<String,Float>(30);
        this.album = new HashMap<String, String>(30);
    }

    @Override
    public ArrayList<String> getTracks() {
        ArrayList<String> tracksArrangeByKey = new ArrayList<>(album.keySet());
        Collections.sort(tracksArrangeByKey);
        return tracksArrangeByKey;
    }

    @Override
    public float getLength() {
        float albumLength = 0;
        for (float songLength : albumSongsLengths.values()) {
            albumLength += songLength;
        }
        return albumLength;
    }

    public HashMap<String, String> getAlbum() {
        return album;
    }

    public void setAlbum(HashMap<String, String> album) {
        this.album = album;
    }

    public HashMap<String, Float> getAlbumSongsLengths() {
        return albumSongsLengths;
    }

    public void setAlbumSongsLengths(HashMap<String, Float> albumSongsLengths) {
        this.albumSongsLengths = albumSongsLengths;
    }
}
