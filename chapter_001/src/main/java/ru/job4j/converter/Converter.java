package ru.job4j.converter;

/**
 *
 *  Converter.
 *
 *  @author Samorodov MA
 *  @version $Id$
 *  @since 0.1
 */
public class Converter {

/**
 * Конвертируем рубли в евро.
 *
 * @param value рубли.
 * @return Евро.
 */
public int rubleToEuro(int value) {
        return value / 70;
        }

/**
 * Конвертируем рубли в доллары.
 *
 * @param value рубли.
 * @return Доллары
 */
public int rubleToDollar(int value) {
        return value / 60;
        }


/**
 * Конвертируем доллары в рубли.
 * @param value доллары.
 * @return рубли
 */
public int DollarToRuble ( int value){
        return value * 60;
        }



/**
 * Конвертируем евро в рубли.
 * @param value евро.
 * @return рубли
 */
public int EuroToRuble ( int value){
        return value * 70;

        }



        }