package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * MaxTest.
 *
 * @author Samorodov MA
 * @version $Id$
 * @since 0.1
 */


public class MaxTest {

    @Test
    public void whenFirstMoreSecond() {
        Max maxim = new Max();
        int result = maxim.max(30, 20);
        assertThat(result, is(30));

    }







}
