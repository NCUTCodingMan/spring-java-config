package com.rain.business;

import org.springframework.stereotype.Component;

/**
 * @author rain
 * created on 2018/3/28
 */
@Component
public class SgtPeppers implements CompactDisc {
    private String title = "red...";
    private String artist = "taylor swift";

    @Override
    public void play() {
        System.out.println(title + "\t" + artist);
    }
}