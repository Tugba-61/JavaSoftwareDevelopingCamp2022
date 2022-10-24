public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Product product = new Product();
        product.id = 61;
        product.name = "Dolma Kalem";
        product.price = -50.67;
        productManager.add(product);
        DatabaseHelper.Crud.Delete();
        DatabaseHelper.Connection.createConnection();
    }
}