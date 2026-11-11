//3_6 palindrom XD?


import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    var scanner = new Scanner(System.in);

    String ciag;
    do {
      System.out.println("Podaj ciag znakow: ");
      ciag = scanner.nextLine();
    } while (ciag.length() < 10);

    String normalizowany_ciag = ciag.trim().toLowerCase();

    String odwrocony_normalizowany_ciag = new StringBuilder(normalizowany_ciag).reverse().toString();
    
    String odwrocony_ciag = new StringBuilder(ciag).reverse().toString();

    System.out.println("Odwrocony ciag: " + odwrocony_ciag);

    if(normalizowany_ciag.equals(odwrocony_normalizowany_ciag)) {
      System.out.println("Podany ciag jest palindromem");
    } else {
      System.out.println("Podany ciag nie jest palindromem");
    }

    System.out.println("Ilosc znakow: " + ciag.length());
    

  }
}