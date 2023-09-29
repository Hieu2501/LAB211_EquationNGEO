
package controller;


import common.Algorithms;
import common.Library;
import java.util.ArrayList;
import java.util.List;
import view.Menu;

/**
 *
 * @author ACER
 */
public class SquationNGeo extends Menu<String> {

    static String[] mc = {"Calculate Superlative Equation", "Calculate Quadratic Equation", "Exit"};

    protected Library library;
    protected Algorithms algorithm;

    public SquationNGeo() {
        super("PROGRAMMING", mc);
        library = new Library();
        algorithm = new Algorithms();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1: {
                
                System.out.println("----- Calculate Equation -----");
                float a = library.getFloat("Enter A: ");
                float b = library.getFloat("Enter B: ");
                List<Float> result = algorithm.calculateEquation(a, b);
                List<Float> list = new ArrayList<>();
                list.add(a);
                list.add(b);
                if(result == null) {
                    System.out.println("Solution: No solution");
                } else if(result.isEmpty()) {
                    System.out.println("Solution: Infinitely many solutions");
                } else {
                    System.out.println("Solution: x = " + result.get(0));
                    list.add(result.get(0));
                }
                System.out.print("Number is odd: ");
                for (int i = 0; i < list.size(); i++) {
                    if(algorithm.isOddNumber(list.get(i))) {
                        System.out.print(list.get(i) + " ");
                    }
                }
                System.out.println("");
                System.out.print("Number is even: ");
                for (int i = 0; i < list.size(); i++) {
                    if(!algorithm.isOddNumber(list.get(i))) {
                        System.out.print(list.get(i) + " ");
                    }
                }
                System.out.println("");
                System.out.print("Number is Perfect Square: ");
                for (int i = 0; i < list.size(); i++) {
                    if(algorithm.isSquareNumber(list.get(i))) {
                        System.out.print(list.get(i) + " ");
                    }
                }
                System.out.println("");
                break;
            }
            case 2:
                System.out.println("----- Calculate Quadratic Equation -----");
                float a = library.getFloat("Enter A: ");
                float b = library.getFloat("Enter B: ");
                float c = library.getFloat("Enter C: ");
                List<Float> result = algorithm.calculateQuadraticEquation(a, b, c);
                List<Float> list = new ArrayList<>();
                list.add(a);
                list.add(b);
                list.add(c);
                if(result == null) {
                    System.out.println("Solution: No solution");
                } else {
                    System.out.print("Solution: ");
                    for (Float x : result) {
                        list.add(x);
                        System.out.print(x + " ");
                    }
                    System.out.println("");
                }
                System.out.print("Number is odd: ");
                for (int i = 0; i < list.size(); i++) {
                    if(algorithm.isOddNumber(list.get(i))) {
                        System.out.print(list.get(i) + " ");
                    }
                }
                System.out.println("");
                System.out.print("Number is even: ");
                for (int i = 0; i < list.size(); i++) {
                    if(!algorithm.isOddNumber(list.get(i))) {
                        System.out.print(list.get(i) + " ");
                    }
                }
                System.out.println("");
                System.out.print("Number is Perfect Square: ");
                for (int i = 0; i < list.size(); i++) {
                    if(algorithm.isSquareNumber(list.get(i))) {
                        System.out.print(list.get(i) + " ");
                    }
                }
                System.out.println("");
                break;
            case 3:
                System.exit(0);
                break;
        }
    }
    
}
