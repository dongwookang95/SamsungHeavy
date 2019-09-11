public class StockMarket{
    public static void main(String[] args){
        ReadFile r = new ReadFile();
        System.out.println(r.checkFile());
        System.out.println(r.checkRowNumber());
        r.convertToArray();
        r.printArray();
    }
}