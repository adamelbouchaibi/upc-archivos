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
        this.name=name;
        this.description=description;
        this.value=0;
        this.encumbrance=0;
    }
    
    // Resta de mètodes
    
    public String getName(){
        return this.name;
    }
    
    public void setValue(int value){
    }
    
    public void setEncumbrance(int enc){
    }
    
    public int getEncumbrance(){
        return this.encumbrance;
    }
    
    
    /** Retorna una String amb el valor dels atributs de l'Item.
     * @return la descripció textual de l'Item
     */
    @Override
    public String toString(){
        return "[" + this.name + ", valor " + this.value + ", car " + this.encumbrance + "] " + this.description;
    }
}
