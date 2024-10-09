package org.example;

public class Klient {
    private int clientId;
    private String name;
    private String surname;
    private int age;
    private String mail;

    public Klient(int clientId, String imie, String nazwisko, int wiek, String mail) {
        this.clientId = clientId;
        this.name = imie;
        this.surname = nazwisko;
        this.age = wiek;
        this.mail = mail;
    }

    public void wyswietlenie() {
        System.out.println("Client ID: " + clientId);
        System.out.println("Name:" + name);
        System.out.println("Surname:" + surname);
        System.out.println("Age:" + age);
        System.out.println("Mail:" + mail);
    }
    public int getClientId() {
        return clientId;}
    public String getImie() {
        return name;
    }

    public String getNazwisko() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return mail;
    }
}