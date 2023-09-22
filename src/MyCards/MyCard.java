package MyCards;

public class MyCard {
   MyCardsValue myCards;
   MyCardsColor myCardsColor;

   public MyCard(MyCardsValue myCards, MyCardsColor myCardsColor){
    this.myCardsColor = myCardsColor;
    this.myCards = myCards;


   }

    public MyCard(int i, int i1) {
        int MyCardsColor;
        int MyCardsValue;


    }

    public MyCardsValue getMyCards() {
        return myCards;
    }
    public MyCardsColor getMyCardsColor() {
        return myCardsColor;
    }

    @Override
    public String toString() {
        return "TestMyCards{" +
                "myCards=" + myCards +
                ", myCardsColor=" + myCardsColor +
                '}';
    }
}
