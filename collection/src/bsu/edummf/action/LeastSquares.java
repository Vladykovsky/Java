package bsu.edummf.action;

import bsu.edummf.exception.DataException;

import java.util.Queue;
import java.util.Stack;

import static java.lang.Math.abs;

public class LeastSquares {
    public static double[] computeMNK(Stack<Double> X, Queue<Double> Y) throws DataException {
        if (X.size() != Y.size()) {
            throw new DataException("The structures have different sizes");
        }
        int n = X.size();
        double sx2 = 0,sx = 0,sy = 0,sxy = 0;
        double a,b,d,da,db;
        int i;
        for (i=0; i< n ; i++)
        {
            sx+=X.peek();
            sy+=Y.peek();
            sx2+=X.peek()*X.peek();
            sxy+=X.pop()*Y.poll();
        }
        d=((double) n)*sx2-sx*sx;
        da=((double) n)*sxy-sx*sy;
        db=sx2*sy-sx*sxy;
        a=abs(da/d);
        b=abs(db/d);
        double [] res=new double[2];
        res[0]=a;
        res[1]=b;
        return res;
    }
}
