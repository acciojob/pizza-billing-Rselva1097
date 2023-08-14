package com.driver;

public class Pizza {

    private int price;
    final Boolean isVeg;
    private String bill;
    private boolean extraTopping;
    private boolean extraCheese;
    private boolean takeAway;
    private int basePrice;
    private int toppingPrice;
    private int cheesePrice;
    private int bagPrice;
    private boolean isBillgenerated;
    public boolean isTakeAway() {
        return takeAway;
    }

    public void setTakeAway(boolean takeAway) {
        this.takeAway = takeAway;
    }



    public boolean isExtraTopping() {
        return extraTopping;
    }

    public void setExtraTopping(boolean extraTopping) {
        this.extraTopping = extraTopping;
    }

    public boolean isExtraCheese() {
        return extraCheese;
    }

    public void setExtraCheese(boolean extraCheese) {
        this.extraCheese = extraCheese;
    }

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(this.isVeg == true){
            this.basePrice=300;
            this.toppingPrice=70;
        }
        else{
            this.basePrice=400;
            this.toppingPrice=120;
        }
        this.cheesePrice=80;
        this.bagPrice=20;
        this.price=this.basePrice;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;

    }

    public void addExtraCheese(){
        // your code goes here
        if(this.extraCheese == false){
            this.price+=this.cheesePrice;
            this.extraCheese=true;
            return;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(this.extraTopping == false){
            this.price+=this.toppingPrice;
            this.extraTopping=true;
            return;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(this.takeAway == false){
         this.price+=this.bagPrice;
         this.takeAway=true;
         return;
        }
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "price=" + price +
                ", bill='" + bill + '\'' +
                '}';
    }

    public String getBill() {
        // your code goes here
        if (this.isBillgenerated == false) {

        this.bill = "Base price of the pizza: " + this.basePrice + "\n";

        if (this.extraCheese == true) {
            this.bill += "Extra cheese added: " + this.cheesePrice + "\n";
        }

        if (this.extraTopping == true) {
            this.bill += "Extra topping added: " + this.toppingPrice + "\n";
        }
        if (this.takeAway == true) {
            this.bill += "PaperBag added: " + this.basePrice + "\n";
        }
        this.bill += "Total price: " + this.price;
        this.isBillgenerated=true;
    }

            return this.bill;
    }
}
