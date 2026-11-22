package laberint.model;

import java.util.HashMap;
import java.util.Iterator;

/** Atributs i mètodes d'una sala del laberint. */
public class Room {
    
    // Atributs
    
    private String description;
    private HashMap<String,Item> items;
    private HashMap<String,Room> exits;
    private String name;
    
    //Mètode Constructor
    
    public Room (String name, String description){
    }
    
    // Altres Mètodes
    
    public String getName(){
        return this.name;
    }
    
    public void putItem(Item item){}
    
    public Item retrieveItem(String itemName){
        return null;
    }
    
    public void connect(Room destination, String exitName){
    }
    
    public Room nextRoom(String exitName){
        
        if(exits.get(exitName)!=null){
           return exits.get(exitName);
        }
        
        return null;
    }
    
    
    
    
    /** Retorna una String amb el valor actual dels atributs de la Room.
     * @return la String.
     */
    @Override
    public String toString(){
        String text = "[" + this.getName() + "]\n";
        text += this.description + "\n";
        Iterator<String> itemNames = this.items.keySet().iterator();
        if (itemNames.hasNext() == false) {
            text += "No hi ha cap item en aquesta sala.\n";
        } else {            
            while (itemNames.hasNext()) {
                String itName = itemNames.next();
                text += "Pots veure que hi ha un item [" + itName + "].\n";
            }
        }
        text += "Accessos:";
        Iterator<String> itExitNames = this.exits.keySet().iterator();
        while (itExitNames.hasNext()) {
            String exit = itExitNames.next();
            text += " " + exit;
        }
        text += "\n";
        return text;
    }
}
