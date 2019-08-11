package ua.krasun.springtest;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
    private RockMusic(){}
    @Override
    public String getSong() {
        return "Rock Music";
    }
}
