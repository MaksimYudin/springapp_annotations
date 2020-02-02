package ru.maks.springcource;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.*;
import java.util.List;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        //AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

//        Music rockMusic = context.getBean("rockMusic", Music.class);
//        Music classicalMusic = context.getBean("classicalMusic", Music.class);

//        MusicPlayer rockMP = new MusicPlayer(rockMusic);
//        MusicPlayer classicalMP = new MusicPlayer(classicalMusic);
//
//        rockMP.playMusic();
//        classicalMP.playMusic();

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        System.out.printf(musicPlayer.playMusic());

//        Computer computer = context.getBean("computer", Computer.class);
//        System.out.printf(computer.getSong());

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.playMusic(MusicType.ROCK));
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        context.close();
        }
}
