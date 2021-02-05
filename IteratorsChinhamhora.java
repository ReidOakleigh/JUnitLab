package week1;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

/**************************************************************
 * Name        : Using Iterators
 * Author      : Rumbi Chinhamhora
 * Created     : 1/22/2021
 * Course      : CIS 152 Data Structures
 * Version     : 1.0
 * OS          : Windows 10
 * Copyright   : This is my own original work based on
 *               specifications issued by our instructor
 * Description : This program overall description here
 *               Input:  list and describe
 *               Output: list and describe
 * Academic Honesty: I attest that this is my original work.
 * I have not used unauthorized source code, either modified or
 * unmodified. I have not given other fellow student(s) access to
 * my program.
 ***************************************************************/
public class IteratorsChinhamhora {
// Named constants
    private static final int SIZE = 10;
    private static final int LOWER_BOUND = 5;
    private static final int UPPER_BOUND = 21;

    /**
     * Main method entry point
     * @param args : String[]
     * @return void
     */
    public static void main( String[] args ) {
        new IteratorsChinhamhora().go();
    }

    /**
     * Mainline logic
     * @return void
     */
    private void go() {
        List<Integer> numbers = new ArrayList<>(SIZE);
        Random random = new Random(Instant.now().toEpochMilli());
        for ( int i = 0; i < SIZE; i++ ) {
            numbers.add(random.nextInt(UPPER_BOUND) + LOWER_BOUND);
        }
        ListIterator<Integer> li = numbers.listIterator();
        while (li.hasNext()) {
            System.out.println(li.next());
        }
    }
}
