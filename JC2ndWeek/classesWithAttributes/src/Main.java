public class Main {
    public static void main(String[] args) {

Product product = new Product();
product.setName("Laptop");
product.setId("3425478");
product.setDescription("Dizüstü");
product.setStockAmount(1000);
product.setPrice(5000);
//System.out.println(product.name);

ProductManager productManager = new ProductManager();
productManager.Add(product);
//single responsibility : bir class bir iş yapar(attribute tutma veya operasyon)

    System.out.println(product.getKod());

    }
}