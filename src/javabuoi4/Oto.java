package javabuoi4;

public class Oto {
    private String name;
    private String hang;
    private int price;

    public Oto(String name, String hang, int price){
        this.name = name;
        this.hang = hang;
        this.price = price;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }





    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

