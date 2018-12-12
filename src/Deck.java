import java.util.ArrayList;

public class Deck {
    ArrayList<Card> Dealt;
    ArrayList<Card> unDealt;

    int[] point = new int[6];

    public Deck(String[] suit,String[] rank,int[] point) {
        Dealt = new ArrayList<Card>();
        unDealt = new ArrayList<Card>();
        for (int i = 0; i< suit.length;i++) {
            for ( int j = 0; j < rank.length;j++) {
                Card newCard = new Card(rank[j],suit[i],point[j]);
                unDealt.add(newCard);
            }
        }

    }
    public boolean isEmpty() {
        if (Dealt.size() == 0) {
            return true;
        }
        else {
            return false;
        }
    }
   public int size() {
        return unDealt.size();
   }
   public Card Deal(Card toDeal) {
        Dealt.add(toDeal);
       unDealt.remove(toDeal);
       return toDeal;
   }
   public void Shuffle() {
        for (int i = 0; i < Dealt.size(); i++) {
            unDealt.add(Dealt.get(i));
            Dealt.remove(i);
        }
        for (int j = 40;j > 0;j--) {
            Card place;
            int ran1 =  (int)Math.floor(Math.random() * unDealt.size()-1);
            int ran2 =  (int)Math.floor(Math.random() * unDealt.size()-1);
            //place =  unDealt.get(ran1);
           // unDealt.get(ran1) = unDealt.get(ran2);
           // unDealt.get(ran2) = place;
        }
   }
}
