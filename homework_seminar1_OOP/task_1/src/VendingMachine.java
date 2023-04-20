
import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    List<Product> listProducts = new ArrayList<>();

    public int getAmount() {
        return amount;
    }

    private int amount = 0;
    public VendingMachine addProduct(Product product){
        listProducts.add(product);
        return this;
    }
//    public void addProduct(Product product){
//        list.add(product);
//}

    public List<Product> getList() {
        return listProducts;
    }

    public Product findProduct(String string){
        for (int i = 0; i < getList().size(); i++) {
            if (getList().get(i).getName().equals(string)){
                return getList().get(i);
            }
        }
        return null;
    }

    public VendingMachine showProduct(){
        for (var item:listProducts
        ) {
            System.out.println(item);
        }
        return this;
    }

    public Product sellProduct(Product product){
        try{
            Product prodFound = findProduct(product.getName());
            getList().remove(prodFound);
            amount += prodFound.getCost();
            return prodFound;

        } catch(Exception ex) {
            throw new RuntimeException("Product not found");

        }
    }
}

