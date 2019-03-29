package Prototype;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GiftsSet gifts = new GiftsSet("Doll", "Lolypop", 100);

        List<Candy> candies = new ArrayList<>();

        candies.add(gifts.getCandy());
        candies.add(gifts.getCandy());
        candies.add(gifts.getCandy());

        for (Candy element : candies) {
            System.out.println( element.toString());
        }
    }
}
