package ru.maks.springcource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan("ru.maks.springcource")
@PropertySource("classpath:musicPlayer.properties")
public class Config {
    @Bean
    public List<String> rockMusicList() {
        return Arrays.asList("rock1", "rock2", "rock3");
    }

    @Bean
    public List<String> classicalMusicList() {
        return Arrays.asList("class1", "class2", "class3");
    }

    @Bean
    public JazzMusic jazzMusic() {
        return new JazzMusic();
    }

    @Bean
    public MusicPlayer2 musicPlayer2() {
        return new MusicPlayer2(jazzMusic());
    }
}
