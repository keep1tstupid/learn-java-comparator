package Classes;


public class Shirt {
    private int inventory;
    private String shirt_ID;
    private String description;
    private String color;
    private String size;

    public int getInventory(){
        return inventory;
    }

    public void setInventory(int inventory){
        inventory = inventory;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String desc){
        description = desc;
    }

    public String getShirt_ID(){
        return shirt_ID;
    }

    public void setShirt_ID(String shirt_id){
        shirt_ID  = shirt_id;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String col){
        color = col;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String sz){
        size = sz;
    }


}
