package org.launchcode;

import java.sql.SQLOutput;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        //TODO: Declare hashmap to hold contents for each CD/DVD object...
        HashMap<String, Double> toolAlbum = new HashMap<>();
        HashMap<String, Double> beetlejuice = new HashMap<>();

        //TODO: Add songs to the album
        toolAlbum.put("Vicarious", 7.06);
        toolAlbum.put("Jambi", 7.28);
        toolAlbum.put("Wings for Marie (Pt 1)", 6.11);
        toolAlbum.put("10,000 Days (Wings Pt 2)", 11.13);
        toolAlbum.put("The Pot", 6.21);
        toolAlbum.put("Lipan Conjuring", 1.11);
        toolAlbum.put("Lost Keys (Blame Hofmann)", 3.46);
        toolAlbum.put("Rosetta Stoned", 11.11);
        toolAlbum.put("Intension", 7.21);
        toolAlbum.put("Right in Two", 8.55);
        toolAlbum.put("Viginti Tres", 5.02);
        //TOTAL LENGTH: 75.45

        //TODO: Add movie to the hashmap
        beetlejuice.put("Beetlejuice", 92.0);


        // TODO: Declare/Initialize a CD
        CD cd1 = new CD("Tool - 10,000 Days", "CD",  75.45, toolAlbum);


        //TODO: Declare/Initialize a blank CD
        CD burnCopy = new CD( "CD");


        //TODO: Declare/Initialize a DVD
        DVD movie1 = new DVD("Beetlejuice", "DVD", 92.0, beetlejuice);

        //TODO: Declare/Initialize a blank DVD
        DVD blankDVD = new DVD("DVD");


        // TODO: Call each CD method to verify that they work as expected.
        System.out.println("CHECK THE DISCOGRAPHY/INFO... ");
        cd1.getDiscography(toolAlbum);
        System.out.println();

        System.out.println("TAKE BLANK CD AND BURN IT. THEN CHECK DISCOGRAPHY/INFO...");
        burnCopy.burnDisc(toolAlbum);
        System.out.println();
        burnCopy.getDiscography(toolAlbum);
        System.out.println();

        System.out.println("CHECK IF THE CD SPINS AND READS...");
        cd1.spinDisc();
        cd1.readDisc();
        System.out.println();
        System.out.println("CHECK IF PLAY/PAUSE IS WORKING...");
        cd1.pauseDisk();
        cd1.playDisc();
        cd1.pauseDisk();
        System.out.println();

        burnCopy.playDisc();
        burnCopy.readDisc();
        burnCopy.spinDisc();
        burnCopy.playDisc();
        burnCopy.readDisc();
        burnCopy.playDisc();
        burnCopy.pauseDisk();


        //TODO: DVD testing...
        System.out.println();
        System.out.println("CHECK IF THE MOVIE INFO ON DVD...");
        movie1.discInformation(beetlejuice);

        System.out.println("TAKE BLANK DVD AND BURN IT. THEN CHECK MOVIE INFO ON DVD...");
        blankDVD.burnDisc(beetlejuice);
        System.out.println();
        blankDVD.discInformation(beetlejuice);
        System.out.println();


        System.out.println("CHECK IF THE DVD SPINS AND READS...");
        movie1.spinDisc();
        movie1.readDisc();
        System.out.println();
        System.out.println("CHECK IF PLAY/PAUSE IS WORKING...");
        movie1.pauseDisk();
        movie1.playDisc();
        movie1.pauseDisk();
        System.out.println();

        blankDVD.playDisc();
        blankDVD.readDisc();
        blankDVD.spinDisc();
        blankDVD.playDisc();
        blankDVD.readDisc();
        blankDVD.playDisc();
        blankDVD.pauseDisk();




    }
}