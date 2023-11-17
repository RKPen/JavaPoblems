import java.util.*;

import javax.xml.transform.Source;

import java.io.*;
public class Main {
    public static void main(String[] args) {
        int total = 0;
        HabbitMakhlouta[] habbitMakhlouta = new HabbitMakhlouta[4];
        habbitMakhlouta[0] = new ElFesto2("ElFesto2", 13, false);
        habbitMakhlouta[1] = new ElBezer("ElBezer", 20, "Latkin");
        habbitMakhlouta[2] = new ElFesto2("ElFesto2", 18, true);
        habbitMakhlouta[3] = new ElBezer("ElBezer", 15, "Battikh");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the HabbitMakhlouta you want to search for: ");
        String name = sc.nextLine();
        if (name.equals("ElBezer")) {
            for (int i = 0; i < habbitMakhlouta.length; i++) {
                if (habbitMakhlouta[i] instanceof ElBezer) {
                    System.out.println(habbitMakhlouta[i].toString());
                    
                }
            }
        } else if (name.equals("ElFesto2")) {
            for (int i = 0; i < habbitMakhlouta.length; i++) {
                if (habbitMakhlouta[i] instanceof ElFesto2) {
                    System.out.println(habbitMakhlouta[i].toString());
                    
                }
                
            }
            System.out.println("After a 30% discount, the price of the first HabbitMakhlouta is: " + habbitMakhlouta[0].getPrice() * 0.7);
            System.out.println("After a 30% discount, the price of the second HabbitMakhlouta is: " + habbitMakhlouta[2].getPrice() * 0.7);
        } else {
            System.out.println("No HabbitMakhlouta with this name");
        }
        
        System.out.println("Would you like to sort all available items by price?" + "(1 for yes, 0 for no)");
        int c= sc.nextInt();
        if (c== 1) {
            Arrays.sort(habbitMakhlouta, new Comparator<HabbitMakhlouta>() {
                @Override
                public int compare(HabbitMakhlouta o1, HabbitMakhlouta o2) {
                    return o1.getPrice() - o2.getPrice();
                }
            });
        }
        for (int i = 0; i < habbitMakhlouta.length; i++) { 
                    System.out.println(habbitMakhlouta[i].toString());
                    habbitMakhlouta[i].consume();
        }
        for (int i = 0; i < habbitMakhlouta.length; i++){
        if (habbitMakhlouta[i] instanceof ElBezer){
            System.out.println("The source of the HabbitMakhlouta is: " + ((ElBezer) habbitMakhlouta[i]).getSource());
        }
    }
        for (int i = 0; i < habbitMakhlouta.length; i++){
            total += habbitMakhlouta[i].getPrice();
        }
            
            System.out.println("The total price of all Nuts & is: " + total);
        
        
        
        
    }
}
