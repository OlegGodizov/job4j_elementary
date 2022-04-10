package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap3to4() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int source = 3;
        int dest = input.length - 2;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 3, 5, 4, 6};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap2to5() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8};
        int source = 2;
        int dest = input.length - 3;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 6, 4, 5, 3, 7, 8};
        Assert.assertArrayEquals(expected, result);
    }
}