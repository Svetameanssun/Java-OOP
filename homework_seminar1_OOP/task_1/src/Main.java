public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
//        VendingMachine vend = new VendingMachine();
        VendingMachine v2 = vendingMachine.addProduct(new Product("Eden", 300));
        vendingMachine.addProduct(new Product("Paco", 330))
            .addProduct(new Product("Font Natura", 10))
            .addProduct(new Yogurt("Danone", 300, "sweet")).showProduct()
                .addProduct(new Milk("Happy Cow", 57,"2 liters"))
                .showProduct();

//        System.out.println(vendingMachine);
//        for (int i = 0; i < v2.getList().size(); i++) {
//            System.out.println(v2.getList().get(i));
//        }
        Product found = vendingMachine.findProduct("Eden");
        System.out.println("---------------------");
        System.out.printf("The product %s found\n",found);
        System.out.println("---------------------");
        System.out.println("Buying a product");
        Product sold = vendingMachine.sellProduct(found);
        System.out.println(sold);
        System.out.println("---------------------");
        System.out.println("The amount of money in the machine:");
        System.out.println(vendingMachine.getAmount());
        System.out.println("---------------------");
        System.out.println("Products left in the machine:");
        v2.showProduct();


    }
}