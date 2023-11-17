import java.util.*;
public class AssassinManager {
    public AssassinNode killRingFront;
    public AssassinNode graveyardFront;
    public AssassinNode killRingBack;
    public AssassinNode graveyardBack;

    /** Constructs a new game of Assassin in which the given names are
        arranged in a ring. */
    public AssassinManager(ArrayList<String> names){
        killRingFront = new AssassinNode(names.get(0));
        killRingBack = killRingFront;
        for(int i = 1; i < names.size(); i++){
            killRingBack.next = new AssassinNode(names.get(i));
            killRingBack = killRingBack.next;
        }
    }

    /** Prints the names of the people in the kill ring. */
    public void printKillRing(){
        AssassinNode current = killRingFront;
        while(current != null){
            if(current.next != null){
                System.out.println("    " + current.name + " is stalking " + current.next.name);
            }else{
                System.out.println("    " + current.name + " is stalking " + killRingFront.name);
            }
            current = current.next;
        }
    }

    /** Prints the names of the people in the graveyard. */
    public void printGraveyard(){
        AssassinNode current = graveyardFront;
        while(current != null){
            System.out.println("    " + current.name + " was killed by " + current.killer);
            current = current.next;
        }
    }

    /** Returns true if the given name is in the kill ring and false
        if it is not. */
    public boolean killRingContains(String name){
        AssassinNode current = killRingFront;
        while(current != null){
            if(current.name.equalsIgnoreCase(name)){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    /** Returns true if the given name is in the graveyard and false
        if it is not. */
    public boolean graveyardContains(String name){
        AssassinNode current = graveyardFront;
        while(current != null){
            if(current.name.equalsIgnoreCase(name)){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    /** Returns true if the game is over and false if it is not. */
    public boolean isGameOver(){
        return killRingFront.next == null;
    }

    /** Returns the name of the winner of the game if the game is over,
        and null if the game is not over. */
    public String winner(){
        if(isGameOver()){
            return killRingFront.name;
        }else{
            return null;
        }
    }

    /** Record the name of the person who has just been killed, transfers them from the kill ring 
     * and  places them inside the graveyard */
    public void kill(String name){
        if(!killRingContains(name)){
            throw new IllegalArgumentException();
        }
        AssassinNode current = killRingFront;
        AssassinNode previous = null;
        while(current != null){
            if(current.name.equalsIgnoreCase(name)){
                if(current == killRingFront){
                    killRingFront = killRingFront.next;
                }else{
                    previous.next = current.next;
                }
                current.next = null;
                try{
                current.killer = previous.name;
                }catch(NullPointerException e){
                    current.killer = killRingBack.name;
                }

                if(graveyardFront == null){
                    graveyardFront = current;
                    graveyardBack = current;
                }else{
                    graveyardBack.next = current;
                    graveyardBack = current;
                }
                return;
            }
            previous = current;
            current = current.next;
        }
    }
}
