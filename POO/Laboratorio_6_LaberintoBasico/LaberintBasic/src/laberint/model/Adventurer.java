package laberint.model;

import java.util.Iterator;

/** Atributs i mètodes de l'Aventurer. */
public class Adventurer {
    
    // Atributs
    private Room room = null;
    private int encumbrance;
    private java.util.TreeMap<java.lang.String,Item> inventory;
    public static final int INVENTORY_IS_FULL = 2;
    private static final int MAX_ENCUMBRANCE = 15;
    private String name;
    public static final int NO_SUCH_EXIT=1;
    public static final int NO_SUCH_ITEM_IN_INVENTORY = 3;
    public static final int NO_SUCH_ITEM_IN_ROOM = 4;
    public static final int OK_ACTION = 0;
    
    // Mètode constructor
    public Adventurer(String name, Room startLocation){
        this.name=name;
        this.room=startLocation;
        this.encumbrance=0;
        this.inventory=new java.util.TreeMap<>();
    }
    
    // Mètodes
    public int move (String exitName){
        if(room.nextRoom(exitName)!=null){
            room = room.nextRoom(exitName);
            return OK_ACTION;
        }
        
        return NO_SUCH_EXIT;
    }
    public int pickUp(String itemName){
        Item n =room.retrieveItem(itemName);
        if(n != null){
            if(this.encumbrance+n.getEncumbrance()<=MAX_ENCUMBRANCE){
                this.encumbrance+=n.getEncumbrance();
                this.inventory.put(itemName, n);
                return OK_ACTION;
                
            }else {
                
            }
        }
    }
    
    public int drop (String itemName){
        return 1;
    }
    public Room getCurrentLocation(){
        return this.room;
    }
    
    /** Retorna un String amb les dades de tots els items de l'inventari de l'aventurer.
     * @return Iterador.
     */
    public String inventoryToString() {
        String text = "";
        Iterator<Item> itItems = this.inventory.values().iterator();
        if (itItems.hasNext() == false) {
            text = "No tens cap item.\n";
        } else {
            while (itItems.hasNext()) {
                Item item = itItems.next();
                text += item.toString() + "\n";
            }
        }
        return text;
    }
}
