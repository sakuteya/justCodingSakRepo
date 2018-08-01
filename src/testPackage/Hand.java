package testPackage;

import java.util.Set;

public class Hand {

    /**
     * 手札。５枚のカード
     */
    //private Set<Card> Cards = new TreeSet<>();
    private Set<Card> Cards;

    public Hand() {

    }

    public Hand(Set<Card> pCards) {
        Cards = pCards;
    }


    /**
     * この手札の役
     * とりあえずジョーカーは考えない。
     * @return
     */
    public Role parseRole() {

        if(isFlush()) {
            return Role.FLUSH;
        }

        return Role.FOUR_OF_A_KIND;
    }

    private boolean isFlush() {
        final int INCREMENT = 1;
        Card tmpCard = null;
        //ソートで隣り合ったカードのナンバーを比較し、１ずつ順番であるかどうか。
        for (Card aCard : Cards) {
            if(tmpCard != null) {
                if(INCREMENT != aCard.num.compareTo(tmpCard.num)) {
                    return false;
                }
            }
            tmpCard = aCard;
        }
        return true;
    }

    @Override
    public String toString() {
        return Cards.toString();

    }

}
