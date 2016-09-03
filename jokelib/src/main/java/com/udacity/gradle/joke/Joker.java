package com.udacity.gradle.joke;

import java.util.Random;

public class Joker {

    String[] jokes = {
            "Offered lift to a friend on way to home, he politely refused \"sorry man, in a hurry today\" and continued walking\n" +
                    "\n" +
                    " #BangaloreTraffic",
            "Hi everyone! A dear friend of mine bought tickets to the IPL final in Bangalore next Sunday...The problem is, that he completely forgot that Sunday is his wedding day... coz' he bought the tickets a few months before agreeing to the wedding date....Now he wants to know if anyone is interested in getting married...\uD83D\uDE03\uD83D\uDE03",
            "Guide: I welcome you all to\n" +
                    "Niagara Falls..\n" +
                    "These are the world's largest\n" +
                    "waterfalls & the sound intensity of the waterfall is so high, even 20 supersonic planes passing by can't be heard. Now I request the indian ladies to keep quiet \n" +
                    "so that \n" +
                    "we can hear the Niagara\n" +
                    "Falls..!"
    };

    public String getJoke() {

        Random random = new Random();
        int index = random.nextInt(3);

        return jokes[index];
    }
}
