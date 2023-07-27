package ua.com.goit.javacore.modulethree.task24;

import java.util.Arrays;

public class QuadraticEquationSolver {
    public double[] solve(int a, int b, int c){
          double discriminant = Math.pow(b,2)-4*a*c;
          if(discriminant == 0){
            double xOne = (-b + Math.sqrt(discriminant))/(2*a);
            return new double[]{xOne};
          }
          if (discriminant > 0){
              double xOne = (-b + Math.sqrt(discriminant))/(2*a);
              double xTwo = (-b - Math.sqrt(discriminant))/(2*a);
              return new double[]{xOne, xTwo};
          }
        return new double[0];
    }

    public static void main(String[] args) {
        QuadraticEquationSolver qes = new QuadraticEquationSolver();
        System.out.println("qes.solve(1,-2,-3) = " + Arrays.toString(qes.solve(1, -2, -3)));
        System.out.println("qes.solve(1,12,36) = " + Arrays.toString(qes.solve(1, 12, 36)));
        System.out.println("qes.solve(5,3,7) = " + Arrays.toString(qes.solve(5, 3, 7)));
    }
}
