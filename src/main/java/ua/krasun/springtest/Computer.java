package ua.krasun.springtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private int id=1;
    @Autowired
    private MusicPlayer musicPlayer;

    @Override
    public String toString() {
        return "Computer: "+ id +
                ", musicPlayer=" + musicPlayer.playMusic();
    }
}
