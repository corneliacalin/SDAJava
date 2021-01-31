package fundamentals.oop;


import java.sql.SQLOutput;

/**
 * BankAccount which is consists of:
 * i.	constructor: with arguments: type and currency ( for initializing the fields and the  balance will be initialized with 0 in the constructor)
 * ii.	fields: type of the account (SAVING or SPENDING),  balance ( the amount of money), currency ( USD, EUR),
 * iii.	methods:
 * 1.	addMoney ( adds money to the balance, - if the account is of type SPENDING the amount of money that is added needs to be bigger than 10% of balance otherwise print a suggestive  error message)
 * 2.	withdrawMoney ( withdraws  money from the balance - if the account is of type SAVING the remaining balance can not be < 0 otherwise print a suggestive  error message ),
 * 3.	covertMoneyToCurrency ( that takes 2 arrguments: amountOfMoney to convert, and the currency to convert to and returns the result = the money in the input currency)
 */
public class BankAccount {
    public static final double USD_TO_EUR = 0.25;
    public static final double EUR_TO_USD = 1.23;

    /**
     * Type of the account :SAVING or SPENDING
     */
    private String type;
    /**
     * Balance of the account
     */
    private double balance;
    /**
     * Currency: USD or EUR
     */
    private String currency;

    public BankAccount(String type, String currency) {
        this.type = type;
        this.currency = currency;
        this.balance = 0;
    }

    public BankAccount() {
        this.type = "SAVING";
        this.currency = "USD";
        this.balance = 0;
    }

    /**
     * addMoney ( adds money to the balance, - if the account is of type SPENDING the amount of money that is added needs to be bigger than 10% of balance otherwise print a suggestive  error message)
     *
     * @return
     */
    public void addMoney(double newMoney) {
        if (this.type == "SPENDING" && newMoney <= this.balance / 10) {

            System.out.println("Please at least 10% of actual balance");

            return;
        }


        this.balance += newMoney;
        System.out.println("Your new balance " + this.balance);

    }

    public void withDrawMoney(double newMoney) {
        if (this.type == "SAVING" && this.balance - newMoney < 0) {
            System.out.println("your balance can be negative ");
            return;
        }
        this.balance -= newMoney;
        System.out.println("your new balace is" + this.balance);
    }

    public static double convertMoney(double money, String inputCurrency, String outputCurrency) {
        if (inputCurrency == "EUR" && outputCurrency == "USD") {
            return money * EUR_TO_USD;
        }
        return money * USD_TO_EUR;

    }

    public String toString() {
        return "Account type " + this.type + "Currency: " + this.currency + " Balance " + this.balance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * Return the balance of the account
     *
     * @return Balance
     */
    public double getBalance() {
        return balance;
    }

//    public void setBalance(double balance) {
//        this.balance = balance;
//    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
