package ru.maks.springcource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {

    private Music classicalMusic;
    private Music rockMusic;

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

//    @Autowired
//    public void setClassicalMusic(RockMusic rockMusic) {
//        this.music1 = rockMusic;
//    }

//    @Autowired
//    public MusicPlayer(@Qualifier("classicalMusic") Music music1, @Qualifier("rockMusic") Music music2) {
//        volume = 50;
//        this.music1 = music1;
//        this.music2 = music2;
//    }


    @Autowired
    public void setClassicalMusic(Music classicalMusic) {
        this.classicalMusic = classicalMusic;
    }

    @Autowired
    public void setRockMusic(Music rockMusic) {
        this.rockMusic = rockMusic;
    }

    public String playMusic(MusicType musicType) {
        String message = "no song";
        Random random = new Random();
        int index = random.nextInt(3);
        if (musicType.equals(MusicType.CLASSIC))
            message = "Playing classical music: " + ((ClassicalMusic) classicalMusic).getSongList().get(index);
        else if (musicType.equals(MusicType.ROCK))
            message = "Playing rock music: " + ((RockMusic) rockMusic).getSongList().get(index);

        return message;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    @PostConstruct
    public void doMyInit() {
        System.out.println("pre init");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("on destroy");
    }
}
