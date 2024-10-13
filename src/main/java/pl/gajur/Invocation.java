package pl.gajur;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Invocation {
    public static void main(String[] args) {
        ArrayList<Client> Clients = new ArrayList<>();
        HashMap<Integer, Client> ClientMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        Client Client1 = new Client(1, "Jan", "Kowalski", 24, "jankowalski@gmail.com");
        Client Client2 = new Client(2, "Marcin", "Nowak", 36, "marcin@gmail.com");
        Client Client3 = new Client(3, "Maria", "Pietrzak", 44, "mpietrzak@gmail.com");

        Clients.add(Client1);
        Clients.add(Client2);
        Clients.add(Client3);

        ClientMap.put(Client1.getClientId(), Client1);
        ClientMap.put(Client2.getClientId(), Client2);
        ClientMap.put(Client3.getClientId(), Client3);

       for(Client Client : Clients){
           Client.Display();
           System.out.println();
       }
        while (true) {
            System.out.print("Enter client ID to search or type 'exit' to finish: ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            int clientIdToFind = Integer.parseInt(input);

            Client foundClient = ClientMap.get(clientIdToFind);
            if (foundClient != null) {
                System.out.println("Found client:");
                foundClient.Display();
                System.out.println();
            } else {
                System.out.println("Client with ID " + clientIdToFind + " was not found.");
                System.out.println();
            }
        }
        scanner.close();
    }
}