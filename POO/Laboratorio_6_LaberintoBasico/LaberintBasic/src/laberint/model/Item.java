package laberint.model;

/** Atributs i mètodes dels items. */
public class Item {

    // Atributs
    private String name;
    private int value;
    private int encumbrance;
    private String description;
    
    
    // Mètode constructor
    public Item(String name, String description){
    }
    
    // Resta de mètodes
    
    public String getName(){
        return null;
    }
    
    public void setValue(int value){
    }
    
    public void setEncumbrance(int enc){
    }
    
    public int getEncumbrance(){
        return 1;
    }
    
    
    /** Retorna una String amb el valor dels atributs de l'Item.
     * @return la descripció textual de l'Item
     */
    @Override
    public String toString(){
        return "[" + this.name + ", valor " + this.value + ", car " + this.encumbrance + "] " + this.description;
    }
}
