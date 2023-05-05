public class BucklerShield implements Shield{

//    Здесь мы прописываем метод, который создали  в Shield
    @Override
    public int protection() {
        return 20;
    }

    @Override
    public String toString() {
        return String.format("Buckler Shield gives %d points of protection", protection());
    }
}
