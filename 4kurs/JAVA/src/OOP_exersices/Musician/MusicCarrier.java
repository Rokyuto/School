package Musician;

import java.util.ArrayList;
import java.util.List;

public abstract class MusicCarrier {
    private Group group;
    private String albumName;

    public MusicCarrier(Group group, String albumName) {
        this.group = group;
        this.albumName = albumName;
    }

    public abstract ArrayList<String> getTracks();
    public abstract float getLength();

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }
}
