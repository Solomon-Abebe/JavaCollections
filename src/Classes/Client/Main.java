package Classes.Client;

import Classes.Account.Account;

public class Main {
    public static void main(String[] args) {
        Client[] clients = new Client[2];
        clients[0] = new Client(100,"Solomon","0912303082");
        clients[0].addAccount(new Account(1, 5000,7.5,new Client(200,"Solomon", "0912303082")));
        clients[0].addAccount(new Account(2,10000,7.5, new Client(200,"Solomon", "0912303082")));

        clients[1] =new Client(200, "Selam","0912855057");
        clients[1].addAccount(new Account(1,7000, 9, new Client(200,"Selam", "0912855057")));
        clients[1].addAccount(new Account(2, 8000, 9, new Client(200,"Selam", "0912855057")));
        clients[1].addAccount(new Account(3,9000,9, new Client(200,"Selam", "0912855057")));

        System.out.println(clients[0].toString());
        System.out.println(clients[1].toString());
    }


}
