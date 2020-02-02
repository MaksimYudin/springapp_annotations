package ru.maks.springcource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClassicalMusic implements Music {

    @Autowired
    @Qualifier("classicalMusicList")
    private List<String> musickList;

    @Override
    public String getSong() {
        return "Classical music";
    }

    public List<String> getSongList() {
        return musickList;
    }
}
