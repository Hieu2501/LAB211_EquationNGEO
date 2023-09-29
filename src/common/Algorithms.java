
package common;

import java.util.ArrayList;
import java.util.List;
public class Algorithms {

    public List<Float> calculateEquation(float a, float b) {
        List<Float> result = new ArrayList<>();
        if (a == 0) {
            if (b == 0) {
                return result;
            }
            return null;
        }
        result.add(-b / a);
        return result;
    }
    
    public List<Float> calculateQuadraticEquation(float a, float b, float c) {
        List<Float> result = new ArrayList<>();
        float delta = (float)(Math.pow(b, 2) - 4 * a * c);
        if(delta < 0) {
            return null;
        } else if(delta == 0) {
            result.add(-b / (2 * a));
            result.add(-b / (2 * a));
            return result;
        }
        result.add((float)((-b + Math.sqrt(delta)) / (2 * a)));
        result.add((float)((-b - Math.sqrt(delta)) / (2 * a)));
        return result;
        
    }
    
    public boolean isSquareNumber(float x) {
        if(x <= 0)
            return false;
        for (int i = 1; i <= Math.sqrt(x); i++) {
            if(Math.pow(i, 2) == x)
                return true;
        }
        return false;
    }
    
    public boolean isOddNumber(float x) {
        return x % 2 != 0;
    }
    
    
}
