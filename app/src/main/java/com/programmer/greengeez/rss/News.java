package com.programmer.greengeez.rss;

/**
 * Created by Sasha on 19.07.2017.
 */

public class News {
    private String name;
    private String description;

    public static final News[] news = {
            new News("The Limb Loosener",
                    "5 Handstand push-ups\n10 1-legged squats\n15 Pull-ups"),
            new News("Core Agony",
                    "100 Pull-ups\n100 Push-ups\n100 Sit-ups\n100 Squats"),
            new News("The Wimp Special",
                    "5 Pull-ups\n10 Push-ups\n15 Squats"),
            new News("Strength and Length",
                    "500 meter run\n21 x 1.5 pood kettleball swing\n21 x pull-ups")
    };

    private News(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "News{" +
                "name='" + name + '\'' +
                '}';
    }
}
