import java.util.Scanner;
import java.util.*; 
public class Driver {
    public static void main(String[] args){
        int n;
        int x;
        int count = 0;  
        Scanner sc=new Scanner(System.in);  
        System.out.print("Enter the number of elements you want to store: ");  
        n=sc.nextInt();
        Tossable[] ball = new Tossable[n];
        for(int i=0; i<n; i++){
            System.out.print("Enter the brand name of the ball: ");
            String brandName = sc.next();
            System.out.print("Enter the type of ball (case sensitive): ");
            String type = sc.next();
            if(type.equals("Baseball")){
                ball[i] = new Baseball(brandName);
            }
            else if(type.equals("Football")){
                ball[i] = new Football(brandName);
            }
             else if (type.equals("Rock")){
                ball[i] = new Rock();
            }
            
            else{
                System.out.println("Invalid type of ball");
                i--;
            }
        }
        for(int i=0; i<n; i++){
            if(ball[i] instanceof Rock){
                count++;
            }
        }
        System.out.println("There are " + count + " Rock(s) in the array");
        for(int i=0; i<n; i++){
            if(ball[i] instanceof Football){
                System.out.println("Football:");
                ball[i].bounce();
                ball[i].toss();
            }
            else if(ball[i] instanceof Baseball){
                System.out.println("Baseball:");
                ball[i].toss();

            }
        }

    }
    
}
