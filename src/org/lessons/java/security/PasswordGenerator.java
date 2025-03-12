package org.lessons.java.security;

public class PasswordGenerator {
public static void main(String[] args) {
    String nome = "Aldo";
    String cognome = "Baglio";
    String colore = "Marrone";
    int giorno = 24; 
    int mese = 9;
    int anno = 1985;
    int somma = giorno + mese + anno;
    System.out.println( "la tua password è " + nome + "-" + cognome + "-" +  colore + "-" + somma);;
}
}
