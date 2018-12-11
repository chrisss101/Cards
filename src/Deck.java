import java.util.ArrayList;

public class Deck {
    ArrayList<Card> Dealt;
    public Deck(Card suit,Card rank,Card point) {
        Card newCard = new Card(suit,rank,point);
    }
    public boolean isEmpty() {
        if (Dealt.size() == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
