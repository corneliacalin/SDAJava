package fundamentals.oop1;

import java.util.*;
import java.time.*;


public class Product {
    private String nameProduct;
    /**
     *	The price of the product can be change but only with a difference of max 14% of the original price.
     */
    private double price;
    private Date expirationDate;


    public Product(String nameProduct, double price, Date expirationDate){
        this.nameProduct=nameProduct;
        this.price=price;
        this.expirationDate=expirationDate;


    }
    public Product(){
        this.nameProduct="apa";
        this.price=10;
        this.expirationDate=Date(2020,1,12);
    }
    public void modifyPrice(double newprice){
        if (newprice-this.price>this.price*14/100){
            System.out.println("The price can be with a difference of max 14% of the original price ");
            return;
        }
        this.price=newprice;
        System.out.println("the new price is "+ this.price);

    }




    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }
}
