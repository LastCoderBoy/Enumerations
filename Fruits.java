package Enumerations;

public enum Fruits {
    APPLE(5), GRAPE(7), CHERRY(10), BLUEBERRY(12), BANANA(4), STRAWBERRY(20);
    private final int price;
    Fruits(int p){
        price = p;
    }
    public int getPrice() {
        return price;
    }
}
