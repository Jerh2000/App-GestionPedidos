//Bean en Java*****************************************************************************************************************************************
package com.Beans;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.SelectItem;
import javax.faces.model.SelectItemGroup;

/**
 *
 * @author Jairo
 */
@ManagedBean
@RequestScoped
public class BeanPedido {

    private String Name;
    private String orderType;
    private String sandwichDay;
    private boolean freeGluten;
    private String freeGlutenOrder;
    private String snack;
    private String drink;
    private boolean largeDrink;
    private String largeDrinkOrder;
    private double total;
    
    public BeanPedido() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getSandwichDay() {
        return sandwichDay;
    }

    public void setSandwichDay(String sandwichDay) {
        this.sandwichDay = sandwichDay;
    }

    public boolean isFreeGluten() {
        return freeGluten;
    }

    public void setFreeGluten(boolean freeGluten) {
        this.freeGluten = freeGluten;
    }

    public String getSnack() {
        return snack;
    }

    public void setSnack(String snack) {
        this.snack = snack;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public boolean isLargeDrink() {
        return largeDrink;
    }

    public void setLargeDrink(boolean largeDrink) {
        this.largeDrink = largeDrink;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getFreeGlutenOrder() {
        return freeGlutenOrder;
    }

    public void setFreeGlutenOrder(String freeGlutenOrder) {
        this.freeGlutenOrder = freeGlutenOrder;
    }

    public String getLargeDrinkOrder() {
        return largeDrinkOrder;
    }

    public void setLargeDrinkOrder(String largeDrinkOrder) {
        this.largeDrinkOrder = largeDrinkOrder;
    }

    
    
    public String RealizarPedido(){
        double base = 9.95;
        if(largeDrink && freeGluten){
            total = base + 2*0.75;
            largeDrinkOrder = "Large drink extra";
            freeGlutenOrder = "Free gluten bread";
        }else if(largeDrink){
          total = base + 0.75;
          largeDrinkOrder = "Large drink extra";
        }else if(freeGluten){
             total = base + 0.75;
             freeGlutenOrder = "Free gluten bread";
        }else{
            total = base;
        }
        if(getDrink().equals("Bubble Tea")){
            total = total + 1.50;
        }
        return "Pedido";
    }
    
}
//Bean en Java*****************************************************************************************************************************************