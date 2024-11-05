package pra1;

public class GOODS {
   private int id;
    private String name;
   private int price;
    public GOODS(String name, int price, int id) {
        this.name = name;
        this.id = id;
        this.price = price;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String toString() {

        return "{id="+id+",name="+name+",price="+price+"}";
    }
    public boolean equals(String name) {
        return this.name.equals(name);
    }
}
