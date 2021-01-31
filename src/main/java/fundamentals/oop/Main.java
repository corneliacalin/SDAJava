package fundamentals.oop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main (String[] arg){
        Scanner scanner =new Scanner(System.in);
BankAccount bankAccount=new BankAccount();
//bankAccount.setBalance(100);
//bankAccount.setCurrency("EUR");
//bankAccount.getBalance();
        System.out.println( "Type " + bankAccount.getType());
        System.out.println("Currency " + bankAccount.getCurrency());
// dam un cont bancar din exterior
        Client client1 = new Client("Cornelia", "12456665",bankAccount);
        System.out.println(client1);
//        System.out.println(client1.toString()); acelasi lucru ca linia de mai sus
        client1.getBankAccount().addMoney(12);

        System.out.println(client1);
        client1.getBankAccount().addMoney(5);
        client1.getBankAccount().withDrawMoney(5);
        System.out.println("Client name: ");
        String name = scanner.next();
        System.out.println("Client cnp: ");
        String cnp = scanner.next();
// clientul are deja asignat un cont bancar
        Client client2 = new Client(name,cnp);
        System.out.println(client2);
        double x =BankAccount.convertMoney(100,"USD","EUR");
        System.out.println(x);
        System.out.println(BankAccount.convertMoney(100,"USD","EUR"));
        BankAccount bankAccount2=new BankAccount("SPENDIG", "USD"); //INITIALIZARE BANK ACCOUNT
        BankAccount bankAccount1=new BankAccount("SAVING", "USD"); //INITIALIZARE BANK ACCOUNT
        BankAccount[] banksArray = {bankAccount1,bankAccount2};
        client1.setBankAccounts(banksArray);
        System.out.println(banksArray[0]);
        System.out.println("Primul cont din array" + client1.getBankAccounts()[0]);
            System.out.println(client1);

    }
}
