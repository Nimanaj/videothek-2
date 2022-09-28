package video_rental;

import video_rental.customer.Customer;
import video_rental.inventory.*;
import video_rental.material.*;
import video_rental.material.CD.MusicGenre;
import video_rental.material.DVD.FSKRating;
import video_rental.material.DVD.MoviGenre;

public class Main {
    public static void main(String[]args){
        Inventory inv = new Inventory();

        CD cd0 = new CD("LEGO, HARRY POTTER", 5.50, true, 4.00, true, MusicGenre.CLASSIK);
        CD cd1 = new CD("X-MEN, Der Letzte wiederstand", 5.50, false, 4.00, false, MusicGenre.RAP);
        CD cd2 = new CD("LEGO, Marvel SUPER HEROS", 6.50, false, 4.50, true,MusicGenre.TECHNO);
        /*
        CD cd3 = new CD("POKEMON: Der Aufstieg von Darkrai", 10.50, true, 10.00);
        CD cd4 = new CD("ted", 2.50, false, 1.00);
        CD cd5 = new CD("Percy Jackson: Sea of monsters", 5.50, false, 4.00);
        CD cd6 = new CD("MARVEL: AVENGERS AGE OF ULTRON", 9.50, false, 6.00);
        CD cd7 = new CD("MARVEL: AVENGERS", 8.00, true, 6.00);
        CD cd8 = new CD("Transformers: Die Rache", 9.50, false, 7.00);
        CD cd9 = new CD("WandaVision", 20.50, false, 15.00);
        CD cd10 = new CD("Das Hier möchte rein aber das Array ist voll", 666.00, true, 5.00);
        */

        cd0.setTitel("guardians of the galaxy");

        inv.addCD(cd0);
        inv.addCD(cd1);
        inv.addCD(cd2);
        /*
        inv.addCD(cd3);
        inv.addCD(cd4);
        inv.addCD(cd5);
        inv.addCD(cd6);
        inv.addCD(cd7);
        inv.addCD(cd8);
        inv.addCD(cd9);
        inv.addCD(cd10);
        */

        DVD dvd0 = new DVD("Inglourious Basterds", 4.00, false, 2.00, FSKRating.FSKEIGHTEEN, MoviGenre.AKTION);
        DVD dvd1 = new DVD("Spider Man 1", 5.00, true, 4.00, FSKRating.FSKSIX, MoviGenre.Fantasy);
        DVD dvd2 = new DVD("The Order", 10.00, false, 5.00, FSKRating.FSKZERO, MoviGenre.ROMANTIK);
        DVD dvd3 = new DVD("The wolf of Wallsstreet", 5.00, false, 4.00, FSKRating.FSKTWELVE, MoviGenre.ANIMATION);
        /*
        DVD dvd4 = new DVD("Now you see me", 10.00, true, 8.00);
        DVD dvd5 = new DVD("Mr Bean", 8.00, true, 5.00);
        DVD dvd6 = new DVD("John Wick", 15.00, false, 1.00);
        DVD dvd7 = new DVD("Fantastic Beasts and where to find them", 5.00, true, 3.00);
        DVD dvd8 = new DVD("RUSH Hour", 8.00, true, 5.00);
        DVD dvd9 = new DVD("IRON MAN", 6.99, true, 4.00);
        DVD dvd10 = new DVD("IRON MAN3 ", 6.99, true, 4.00);
        */

        Customer Anton = new Customer("Anton", "Mustermann", 53);
        Customer Emma = new Customer("Emma", "Mustermann", 12);

        inv.addDVD(dvd0);
        inv.addDVD(dvd1);
        inv.addDVD(dvd2);
        inv.addDVD(dvd3);
        /*
        inv.addDVD(dvd4);
        inv.addDVD(dvd5);
        inv.addDVD(dvd6);
        inv.addDVD(dvd7);
        inv.addDVD(dvd8);
        inv.addDVD(dvd9);
        inv.addDVD(dvd10);
        */


        

        System.out.println("**********");

        System.out.println(inv.str());


        System.out.println("**********");
        System.out.println("Einzelne CD");

        System.out.println(cd0.str());
        System.out.println(cd2.str());


        System.out.println("**********");
        System.out.println("Einzelne DVD");

        System.out.println(dvd0.str());
        System.out.println(dvd1.str());
        System.out.println(dvd2.str());

        System.out.println("**********");
        System.out.println("Das Genre DVD:");

        System.out.println(dvd0.getGenre().strGenre());

        System.out.println("Das Genre CD:");

        System.out.println(cd0.getGenre().strGenre());
        
        System.out.println("**********");
        System.out.println("Ausleihen");
        Anton.ausleihenDVD(dvd0);
        Emma.ausleihenCD(cd1);
        
        System.out.println("**********");
        System.out.println("alter verändern:");;
        System.out.println(dvd0.alter(16));
        System.out.println(dvd0.alter(18));

    }
}

/*
Die CD.java und die DVD.java sind in dem Ordner material. Diese gibt Ordnung unter den ganzen Klassen. 
CD.java und die DVD.java ähneln sich sehr, daher sind die in einem Ordner/Datei.
Bessere Strukturierung, da man weiß was in der Datei ist und somit gleich sein wird.
*/


/* 
Die Inventory.java ist in einer anderen Datei als CD.java und die DVD.java, weil die sich nicht ähneln!
Die Inventory Klasse hat andere aufgaben als die CD und DVD Klassen. Bessere Orientierung über die Klassen.
*/