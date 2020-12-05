import java.util.ArrayList;
import java.util.List;

public class GuestsList {
    public static void main(String[] args) {
    
        //Remplacez ?? par le code correct pour créer une liste de type String

        List<String> guests = new ArrayList<String>();

        //Ajoutez Joey, Martin et Marie à la liste

        guests.add("Joey"); // -> [Joey]
        guests.add("Martin"); // -> [Joey, Martin]
        guests.add("Marie"); // -> [Joey, Martin, Marie]

        //Complétez l'instruction en remplaçant ?? pour afficher la taille de la liste

        System.out.println(guests.size());
        
       // Remplacez Martin par John dans la liste

        guests.set(1,"John");

       // Retirez Joey de la liste
      
        guests.remove(0);

       //Affiche le contenu de la liste
       System.out.println("The guests are:");
       for(String guest: guests){
           System.out.println(guest);
       }
    }
}
