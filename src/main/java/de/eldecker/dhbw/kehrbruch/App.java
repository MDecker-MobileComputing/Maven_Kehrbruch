package de.eldecker.dhbw.kehrbruch;

import static de.eldecker.dhbw.kehrbruch.mathe.Bruchrechnen.kehrwert;

import de.eldecker.dhbw.kehrbruch.mathe.BruchRecord;

/**
 * Einsteigsklasse für Programmausführung.
 */
public class App {

  /**
   * Methode versucht Kehrbruch (Kehrwert) von {@code bruch} zu
   * berechnen und auf die Konsole zu schreiben.
   *
   * @param bruch Bruch, von dem der Kehrbruch auf die Konsole
   *              geschrieben werden soll
   */
  private static void berechneKehrbruch(BruchRecord bruch) {

        BruchRecord ergebnisBruch = kehrwert(bruch);
        if (ergebnisBruch != null) {
    
            System.out.println("Kehrbruch von " + bruch + " ist: " + ergebnisBruch);
    
        } else {
    
            System.out.println("Kehrbruch von " + bruch + " kann nicht berechnet werden.");
        }
  }

  /**
   * Einstiegsmethode.
   *
   * @param args Wird nicht ausgewertet
   */
  public static void main(String[] args) {
      
      System.out.println();

      BruchRecord bruch1 = new BruchRecord( 2, 3 );
      berechneKehrbruch(bruch1);

      BruchRecord bruch2 = new BruchRecord( 0, 5 );
      berechneKehrbruch(bruch2);
      
      System.out.println();
  }

}