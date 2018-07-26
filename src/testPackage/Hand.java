package testPackage;

import java.util.Set;

public class Hand {

    /**
     * 手札。５枚のカード
     */
    //private Set<Card> Cards = new TreeSet<>();
    private Set<Card> Cards;;

    public Hand() {

    }

    public Hand(Set<Card> pCards) {
        Cards = pCards;
    }

    @Override
    public String toString() {
        return Cards.toString();

    }

}
