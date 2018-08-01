package testPackage;

import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String args[]) {
        //特定のカードを作る
        Card aCard = new Card(Mark.HEARTS, Num.SEVEN);
        System.out.println(aCard);

        //手札
        Set<Card> aCards = new TreeSet<>();
        aCards.add(new Card(Mark.CLUBS, Num.SEVEN));
        aCards.add(new Card(Mark.DIAMONDS, Num.FOUR));
        aCards.add(new Card(Mark.SPADES, Num.SIX));
        aCards.add(new Card(Mark.HEARTS, Num.NINE));
//        aCards.add(new Card(Mark.HEARTS, Num.EIGHT));
        aCards.add(new Card(Mark.CLUBS, Num.FIVE));
        Hand aHand = new Hand(aCards);
        System.out.println(aHand.parseRole());
        System.out.println(aHand);

    }
}
