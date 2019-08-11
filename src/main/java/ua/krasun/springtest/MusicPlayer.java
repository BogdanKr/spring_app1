package ua.krasun.springtest;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MusicPlayer {
    private List<Music> musicList;
    private String name;
    private int volume;

    @Autowired
    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public MusicPlayer() {
    }


    public String playMusic() {
        musicList.stream().forEach(music -> System.out.println("Playing " + music.getSong()) );
        return ":)";
        //System.out.println("Playing " + );
    }
}
