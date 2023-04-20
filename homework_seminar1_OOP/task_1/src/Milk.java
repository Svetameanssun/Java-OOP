public class Milk extends Product{
    private final String size;

    public Milk(String name, Integer cost, String size){
        super(name,cost);
        this.size = size;
    }

    @Override
    public String toString() {
        return super.toString()+", "+size;
    }
}
