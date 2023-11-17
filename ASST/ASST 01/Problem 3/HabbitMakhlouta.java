import java.io.*;
import java.util.*;
import java.lang.*;
public abstract class HabbitMakhlouta {

    public HabbitMakhlouta(String name, int price) {
        super();
        Name = name;
        this.price = price;
    }

    private String Name;
    private int price;

    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public abstract void consume();
    
    public String toString(){
        return "HabbitMakhlouta [Name=" + Name + ", price=" + price + "]";
    }


}


 