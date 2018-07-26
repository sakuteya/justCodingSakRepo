package testPackage;

public class Card implements Comparable<Card>{

    //手品じゃないので、セッター不要。
    public final Mark mark;
    public final Num num;

    /**
     * @param args
     */
    public Card(Mark pMark, Num pNum) {
        mark = pMark;
        num = pNum;
    }

    @Override
    public String toString() {
        return mark.toString() + "_" + num.toString();
    }

    @Override
    public int compareTo(Card o) {
        if (this.num.compareTo(o.num) == 0) {
            return this.mark.compareTo(o.mark);
        } else {
            return this.num.compareTo(o.num);
        }
    }

}