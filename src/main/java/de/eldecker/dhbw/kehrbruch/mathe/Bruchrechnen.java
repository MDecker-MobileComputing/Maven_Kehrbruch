package de.eldecker.dhbw.kehrbruch.mathe;

public class Bruchrechnen {

    public static BruchRecord kehrwert(BruchRecord bruch) {

        if (bruch.zaehler() == 0) {

            return null;
        }

        return new BruchRecord(
                        bruch.nenner(),
                        bruch.zaehler()
                   );
    }

}