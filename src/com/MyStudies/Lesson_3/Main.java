package com.MyStudies.Lesson_3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class Main {

    public static void main(String[] args) {

        try {
            URL website = new URL("http://rumiantsev.art");
            ReadableByteChannel rbc = Channels.newChannel(website.openStream());
            FileOutputStream file = new FileOutputStream("data.html");
            file.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
        } catch (IOException e) {
            e.printStackTrace();
        }

//        Elements obj_1 = new Elements();
//        obj_1.start();
//
//        Elements obj_2 = new Elements();
//        obj_2.start();
//        Thread obj_3 = new Thread((new NewTest()));
//        obj_3.start();
//        Thread obj_4 = new Thread((new NewTest()));
//        obj_4.start();

    }
}
