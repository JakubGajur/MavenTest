package pl.gajur;

public class Client {
    private int clientId;
    private String name;
    private String surname;

    private int age;
    private String mail;


    public Client(int clientId, String name, String surname, int age, String email) {
        this.clientId = clientId;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.mail = email;
    }

    public void display() {
        System.out.println("Client ID: " + clientId);
        System.out.println("Name:" + name);
        System.out.println("Surname:" + surname);
        System.out.println("Age:" + age);
        System.out.println("Mail:" + mail);
    }
    public int getClientId() {
        return clientId;}
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return mail;
    }
}