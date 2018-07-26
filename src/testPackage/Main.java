package testPackage;

import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String args[]) {
        //特定のカードを作る
        Card aCard = new Card(Mark.HEARTS, Num.SEVEN);
        System.out.println(aCard);

        Set<Card> aCards = new TreeSet<>();
        aCards.add(new Card(Mark.CLUBS, Num.THIRTEEN));
        aCards.add(new Card(Mark.DIAMONDS, Num.FOUR));
        aCards.add(new Card(Mark.SPADES, Num.THIRTEEN));
        aCards.add(new Card(Mark.HEARTS, Num.EIGHT));
        aCards.add(new Card(Mark.CLUBS, Num.FIVE));
        Hand aHand = new Hand(aCards);
        System.out.println(aHand);

    }
}
