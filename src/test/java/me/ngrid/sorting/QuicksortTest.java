package me.ngrid.sorting;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

/**
 *
 */
@RunWith(Parameterized.class)
public class QuicksortTest extends SortTest{

    private Sortable s1, s2, s3;

    public QuicksortTest(String test, Integer[] i) {
        super(test, i);
        this.s1 = Quicksort.createNaiveRecursive(Arrays.copyOf(i, i.length));
        this.s2 = Quicksort.createRecursive(Arrays.copyOf(i, i.length));
        this.s3 = Quicksort.createIterative(Arrays.copyOf(i, i.length));
    }

    @Test
    public void naiveRecursive() throws Exception {
        assertSorted(s1.sort());
    }

    @Test
    public void randomRecursive() throws Exception {
        assertSorted(s2.sort());
    }

    @Test
    public void randomIterative() throws Exception {
        assertSorted(s3.sort());
    }
}
