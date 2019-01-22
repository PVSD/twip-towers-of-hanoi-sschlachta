package com.company;

/**
 * Created by ss772 on 1/14/19.
 */

public class Solve {


    public static void solveIt(int d, int peg1, int peg3, int peg2){

        if(d == 1){

            System.out.println("Please move disc from peg " + peg1 + " to " + peg3);

    } else {

            solveIt(d-1, peg1, peg2, peg3);
            solveIt(1, peg1, peg3, peg2);
            solveIt(d-1, peg2, peg3, peg1);

        }
    }

}
