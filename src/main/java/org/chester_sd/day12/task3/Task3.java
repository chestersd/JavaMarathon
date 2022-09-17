package org.chester_sd.day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand linkinPark = new MusicBand("Linkin Park", 1996);
        MusicBand limpBizkit = new MusicBand("Limp Bizkit", 1994);
        MusicBand metallica = new MusicBand("Metallica", 1981);
        MusicBand papaRoach = new MusicBand("Papa Roach", 1993);
        MusicBand tatu = new MusicBand("Tatu", 1999);
        MusicBand louna = new MusicBand("Louna", 2008);
        MusicBand nightwish = new MusicBand("Nightwish", 1996);
        MusicBand withinTemptation = new MusicBand("Within Temptation", 1996);
        MusicBand imagineDragons = new MusicBand("Imagine Dragons", 2009);
        MusicBand theSubways = new MusicBand("The Subways", 2002);
        MusicBand placebo = new MusicBand("Placebo", 1994);

        List<MusicBand> musicBands = new ArrayList<>();
        musicBands.add(linkinPark);
        musicBands.add(limpBizkit);
        musicBands.add(metallica);
        musicBands.add(papaRoach);
        musicBands.add(tatu);
        musicBands.add(louna);
        musicBands.add(nightwish);
        musicBands.add(withinTemptation);
        musicBands.add(imagineDragons);
        musicBands.add(theSubways);
        musicBands.add(placebo);

        System.out.println(musicBands);

        Collections.shuffle(musicBands);

        System.out.println(musicBands);

        List<MusicBand> musicBandsAfter2000 = new ArrayList<>();

            for (MusicBand band : musicBands) {
                if (band.getYear() > 2000)
                    musicBandsAfter2000.add(band);
            }

        System.out.println(musicBandsAfter2000);
    }
}
