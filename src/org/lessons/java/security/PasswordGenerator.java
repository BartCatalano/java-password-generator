package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
public static void main(String[] args) {
    // creazione automatica password
    String nome = "Aldo";
    String cognome = "Baglio";
    String colore = "Marrone";
    int giorno = 24; 
    int mese = 9;
    int anno = 1985;
    int somma = giorno + mese + anno;
    System.out.println( "la tua password è " + nome + "-" + cognome + "-" +  colore + "-" + somma);
// creazione password con input utente
Scanner in = new Scanner(System.in); 
System.out.print("inserisci il nome ");
 String nomeUtente = in.nextLine();
 System.out.print("inserisci il cognome ");
 String cognomeUtente = in.nextLine();
 System.out.print("inserisci il colore preferito ");
 String coloreUtente = in.nextLine();
 System.out.print("inserisci il giorno di nascita ");
 int giornoUtente = in.nextInt();
 System.out.print("inserisci il mese dinascita ");
 int meseUtente = in.nextInt();
 System.out.print("inserisci anno di nascita ");
 int annoUtente = in.nextInt();

 int sommaUtente = giornoUtente + meseUtente + annoUtente;

System.out.print("la tua password è " + nomeUtente + "-" + cognomeUtente + "-" +  coloreUtente + "-" + sommaUtente);

}
}
