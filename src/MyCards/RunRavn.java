package MyCards;
import java.util.Random;


public class RunRavn {
    public static void main(String[] args) {
        new RunRavn().run();
    }

    void run() {
        Random random = new Random();
        MyCardsColor[] colors = MyCardsColor.values();
        MyCardsValue[] values = MyCardsValue.values();

        MyCardsColor randomColor = colors[random.nextInt(colors.length)];
        MyCardsValue randomValue = values[random.nextInt(values.length)];

        MyCard card2 = new MyCard(randomValue, randomColor);
        System.out.println(card2);
    }
}
