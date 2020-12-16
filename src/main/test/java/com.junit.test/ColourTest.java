package com.junit.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import testing.Colour;

import static org.junit.jupiter.api.Assertions.*;

class ColourTest {

    public Colour colour;

    @DisplayName("test color value range")
    @Test
    public void testColorValueRange() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    colour = new Colour(Colour.DEFAULT_MODEL,-1, 0, 0);
                });
        assertThrows(IllegalArgumentException.class,
                () -> {
                    colour = new Colour(Colour.DEFAULT_MODEL,256, 0, 0);
                });
        assertThrows(IllegalArgumentException.class,
                () -> {
                    colour = new Colour(Colour.DEFAULT_MODEL,255, -1, 0);
                });
        assertThrows(IllegalArgumentException.class,
                () -> {
                    colour = new Colour(Colour.DEFAULT_MODEL,255, 256, 0);
                });
        assertThrows(IllegalArgumentException.class,
                () -> {
                    colour = new Colour(Colour.DEFAULT_MODEL,255, 255, -1);
                });
        assertThrows(IllegalArgumentException.class,
                () -> {
                    colour = new Colour(Colour.DEFAULT_MODEL,255, 255, 256);
                });
    }

}