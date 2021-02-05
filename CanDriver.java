package week1;

import java.util.ArrayList;
import java.util.List;

/**************************************************************
 * Name        : Basic OO and Encapsulation
 * Author      : Rumbi Chinhamhora
 * Created     : 1/22/2021
 * Course      : CIS 152 Data Structures
 * Language    : Java
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
public class CanDriver {
    /**
     * Main method entry point
     * @param args : String[]
     * @return void
     */
    public static void main( String[] args ) {
        new CanDriver().go();
    }

    /**
     * Mainline logic
     * @return void
     */
    private void go() {
        List<CanChinhamhora> cans = new ArrayList<>();
        cans.add(new CanChinhamhora("Field Day", "Black Beans", 13.0, 0.99));
        cans.add(new CanChinhamhora("S&W", "Peaches", 12.0, 2.39));
        cans.add(new CanChinhamhora("Green Giant", "Green Beans", 11.9, 1.79));
        cans.add(new CanChinhamhora("Del Monte", "Creamed Corn", 13.4, 2.49));
        for ( int i = 0; i < cans.size(); i++ ) {
            System.out.printf("Can %d: %s\n", (i+1), cans.get(i));
        }
    }
}
