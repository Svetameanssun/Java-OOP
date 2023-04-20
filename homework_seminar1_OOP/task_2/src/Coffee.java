public class Coffee {

    public String getName() {
        return name;
    }

    public static String getVolume() {
        return volume;
    }

    public Double getPrice() {
        return price;
    }

    public static String getTemperature() {
        return Temperature;
    }

    protected String name;
    protected static String volume = "50 ml";
    protected Double price;
    protected static String Temperature = "100 ℃";

    /**Constructor Coffee*/
    public Coffee(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%s - %f",this.name,this.price);
    }


}
