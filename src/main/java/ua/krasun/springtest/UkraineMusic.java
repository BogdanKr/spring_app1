package ua.krasun.springtest;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class UkraineMusic implements Music{
//    private UkraineMusic(){}
//
//    public static UkraineMusic factoryMethod(){
//        System.out.println("Factory method");
//        return new UkraineMusic();
//    }
    @PostConstruct
    private void initMethod(){
        System.out.println("Init Ukraine music bean");
    }
    @PreDestroy
    private void destroyMethod(){
        System.out.println("Destroy method");
    }

    @Override
    public String getSong() {
        return "This is Ukraine music";
    }
}
