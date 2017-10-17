package com.kbweb.kelsi.divinationinspiration;

/**
 * Created by Kelsi on 10/16/2017.
 */

public class Product {
    private String name;
    private String description;

    public static final Product[] products = {
            new Product("Hand Carved Rune Set",
                    "These hand-carved runes are sealed to perfection after being painted and" +
                            "stained to your liking. Set of 24."),
            new Product("Suprise Rune Bath Bomb",
                    "Bath bombs come in a plethora of different scents, and each one produces a " +
                            "surprise rune to give you a mini reading."),
            new Product("Suprise Rune Candle",
                    "Each soy candle has a surprise rune hidden inside. The candles come in" +
                            "different sizes and scents."),
            new Product("Rune Meanings",
                    "Soon there will be beautiful rune meanings here.")
    };

    //Each Product has a name and description
    private Product(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return this.name;
    }
}
