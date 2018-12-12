package Stuff;

public class Card {
    public static String rank;
    public static String suit;
    public static int positiveValue;
    public Card(String rank,String suit,int positiveValue) {
        this.rank = rank;
        this.suit = suit;
        this.positiveValue = positiveValue;
    }
    public boolean equals(Card firstCard, Card otherCard) {
        if (firstCard == otherCard) {
            return true;
        }
        else {
            return false;
        }
    }
    public  String toString() {
        String returned = "rank" + rank + "suit" + suit + String.valueOf(positiveValue);
        return returned;
    }
}
