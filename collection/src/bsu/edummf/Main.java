package bsu.edummf;

import bsu.edummf.action.LeastSquares;
import bsu.edummf.exception.DataException;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        try{
            double u[]={1.2,2.1,1.7,3.8,5.1,1.3,4.1,9.1,3.6,7.2};
            double i[]={0.7,1.4,1.25,2.1,2.31,3.01,3.43,4.14,4.7,4.51};
            Queue<Double> I = new LinkedList<>();
            Stack<Double> U = new Stack<>();
            for(int j = 0; j < u.length; j++) {
                I.add(i[j]);
                U.add(u[j]);
            }
            double[] res = LeastSquares.computeMNK(U, I);
            System.out.println("R="+1.0/res[0]);
        } catch (DataException e) {
            System.out.println(e.getMessage());
        }


    }
}
