package oopWithNLayeredApp1.entities;



public class Product {
    private int id;
    private String name;
    private double unitPrice;

    public Product(int id,String name,int unitPrice){
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
    }
    public Product() {
    }

    public Product(int id) {
        this.id = id;
    }

    public Product(String name) {
        this.name = name;
    }

    public Product(double unitPrice) {
        this.unitPrice = unitPrice;
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

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}
