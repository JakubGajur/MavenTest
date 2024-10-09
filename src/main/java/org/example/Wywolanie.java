package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Wywolanie {
    public static void main(String[] args) {
        ArrayList<Klient> klienci = new ArrayList<>();
        HashMap<Integer, Klient> klientMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        Klient klient1 = new Klient(1, "Jan", "Kowalski", 24, "jankowalski@gmail.com");
        Klient klient2 = new Klient(2, "Marcin", "Nowak", 36, "marcin@gmail.com");
        Klient klient3 = new Klient(3, "Maria", "Pietrzak", 44, "mpietrzak@gmail.com");

        klienci.add(klient1);
        klienci.add(klient2);
        klienci.add(klient3);

        klientMap.put(klient1.getClientId(), klient1);
        klientMap.put(klient2.getClientId(), klient2);
        klientMap.put(klient3.getClientId(), klient3);

       for(Klient klient : klienci){
           klient.wyswietlenie();
           System.out.println();
       }
        while (true) {
            System.out.print("Podaj ID klienta do wyszukania lub wpisz 'exit' aby zakończyć: ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            // Konwersja wejścia na liczbę
            int clientIdToFind = Integer.parseInt(input);

            Klient foundClient = klientMap.get(clientIdToFind);
            if (foundClient != null) {
                System.out.println("Znaleziony klient:");
                foundClient.wyswietlenie();
                System.out.println();
            } else {
                System.out.println("Klient o ID " + clientIdToFind + " nie został znaleziony.");
                System.out.println();
            }
        }
        scanner.close();
    }
}