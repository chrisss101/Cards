import Stuff.Card;
import Stuff.Deck;

public class Runner {
    public static void main(String[] args) {
        String[] suits = new String[5];
        String[] ranks = new String[5];
        int[] points = new int[5];
        suits[0] = "a";
        suits[1] = "b";
        suits[2] = "a";
        suits[3] = "a";
        suits[4] = "b";
        ranks[0] = "cat";
        ranks[1] = "dog";
        ranks[2] = "cow";
        ranks[3] = "pig";
        ranks[4] = "horse";
        points[0] = 0;
        points[1] = 1;
        points[2] = 2;
        points[3] = 3;
        points[4] = 4;
        Deck Deck1 = new Deck(suits,ranks,points);

        for (int i = 0; i < Deck.Dealt.size(); i++) {
            Deck.Deal(Deck.unDealt.get(i));
        }

    }
}
