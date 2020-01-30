package ru.maks.springcource;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.*;
import java.util.List;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

//        Music rockMusic = context.getBean("rockMusic", Music.class);
//        Music classicalMusic = context.getBean("classicalMusic", Music.class);

//        MusicPlayer rockMP = new MusicPlayer(rockMusic);
//        MusicPlayer classicalMP = new MusicPlayer(classicalMusic);
//
//        rockMP.playMusic();
//        classicalMP.playMusic();

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        System.out.printf(musicPlayer.playMusic());

        Computer computer = context.getBean("computer", Computer.class);
        System.out.printf(computer.getSong());

        }
}
