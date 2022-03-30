/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myutil;

/**
 *
 * @author FARHAD
 */
public class MealCard extends Student {

    
    private final static int DEFAULT_BALANCE = 100;
    private int itemValue;
    private int topUpValue;
    public int newBalance;

    // Getters and Setters
    public int getItemValue() {
        return itemValue;
    }

    public void setItemValue(int itemValue) {
        this.itemValue = itemValue;
    }


    public int getTopUpValue() {
        return topUpValue;
    }

    public void setTopUpValue(int topUpValue) {
        this.topUpValue = topUpValue;
    }

    // purchaseItem method for when students buy food
    public int purchaseItem() {
        newBalance = DEFAULT_BALANCE - itemValue;
        return newBalance;
    }

    // purchasePoints method for students topping up their meal card balance
    public int purchasePoints() {
        newBalance = DEFAULT_BALANCE + topUpValue;
        return newBalance;
    }

    // Overriden toString method
    @Override
    public String toString() {
        return super.toString() + "Meal Card Balance: " + this.newBalance ;
    }

}