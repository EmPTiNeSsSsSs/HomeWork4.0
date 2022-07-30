package com.example.homework40;

import java.io.Serializable;

public class AnimeModel implements Serializable {
    private final String animeName;
    private final String mainCharacter;
    private final Integer numberOfEpisodes;

    public AnimeModel(String animeName, String mainCharacter, Integer numberOfEpisodes) {
        this.animeName = animeName;
        this.mainCharacter = mainCharacter;
        this.numberOfEpisodes = numberOfEpisodes;
    }

    public String getAnimeName() {
        return animeName;
    }

    public String getMainCharacter() {
        return mainCharacter;
    }

    public Integer getNumberOfEpisodes() {
        return numberOfEpisodes;
    }
}
