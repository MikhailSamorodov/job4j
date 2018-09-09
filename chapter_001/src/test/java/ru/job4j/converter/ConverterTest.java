package ru.job4j.converter;

        import org.junit.Test;
        import static org.hamcrest.core.Is.is;
        import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Samorodov MA
 * @version $Id$
 * @since 0.1
 */


public class ConverterTest {
    @Test
    public void when60RubleToDollarThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToDollar(60);
        assertThat(result, is(1));
    }

    @Test
    public void when70RubleToEuroThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToEuro(700);
        assertThat(result, is(10));
    }


    @Test
    public void when1DollarToRubleThen60() {
        Converter converter = new Converter();
        int result = converter.dollarToRuble(11);
        assertThat(result, is(660));
    }

    @Test
    public void when1EuroToRubleThen70() {
        Converter converter = new Converter();
        int result = converter.euroToRuble(11);
        assertThat(result, is(770));
    }



}