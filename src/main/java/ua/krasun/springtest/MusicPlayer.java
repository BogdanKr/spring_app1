package ua.krasun.springtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class MusicPlayer {
    private List<Music> musicList;
    @Value("${musicPlayer.name}")
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
    }
}
