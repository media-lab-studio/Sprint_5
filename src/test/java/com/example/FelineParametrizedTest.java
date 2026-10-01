package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineParametrizedTest {

    private final int kittensCount;

    public FelineParametrizedTest(int kittensCount) {
        this.kittensCount = kittensCount;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getData() {
        return Arrays.asList(new Object[][]{
                {0},
                {1},
                {5},
                {10}
        });
    }

    @Test
    public void getKittensWithCountReturnsCount() {
        Feline feline = new Feline();
        assertEquals(kittensCount, feline.getKittens(kittensCount));
    }

}
