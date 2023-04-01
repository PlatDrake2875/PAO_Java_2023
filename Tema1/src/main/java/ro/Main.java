package ro;

import ro.pao.model.abstracts.AbstractAudioContent;
import ro.pao.model.enums.AudioContentType;


import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        AbstractAudioContent audioContent = new AbstractAudioContent() {
            @Override
            public void play() {
                System.out.println("Playing audio content");
            }
        };

        audioContent.play();

        AbstractAudioContent audioContent1 = new AbstractAudioContent
                ("Title",
                new Date(26, Calendar.SEPTEMBER, 2019),
                LocalTime.of(0, 2, 30, 42),
                AudioContentType.SONG) {
            @Override
            public void play() {
                System.out.println("Playing audio content");
            }
        };

        audioContent1.play();


    }
}