package pl.gajur;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Invocation {
    public static void main(String[] args) {
        ArrayList<Client> clients = new ArrayList<>();
        HashMap<Integer, Client> clientMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        Client client1 = new Client(1, "Jan", "Kowalski", 24, "jankowalski@gmail.com");
        Client client2 = new Client(2, "Marcin", "Nowak", 36, "marcin@gmail.com");
        Client client3 = new Client(3, "Maria", "Pietrzak", 44, "mpietrzak@gmail.com");

        clients.add(client1);
        clients.add(client2);
        clients.add(client3);

        clientMap.put(client1.getClientId(), client1);
        clientMap.put(client2.getClientId(), client2);
        clientMap.put(client3.getClientId(), client3);

       for(Client client : clients){
           client.display();
           System.out.println();
       }
        while (true) {
            System.out.print("Enter client ID to search or type 'exit' to finish: ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            int clientIdToFind = Integer.parseInt(input);

            Client foundClient = clientMap.get(clientIdToFind);
            if (foundClient != null) {
                System.out.println("Found client:");
                foundClient.display();
                System.out.println();
            } else {
                System.out.println("Client with ID " + clientIdToFind + " was not found.");
                System.out.println();
            }
        }
        scanner.close();
    }
}