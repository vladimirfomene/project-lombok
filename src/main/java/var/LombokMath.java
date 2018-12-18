package var;

import lombok.var;

import java.util.HashMap;

public class LombokMath {

    public int add(int a, int b){
        var sum = a + b;

        return sum;
    }

    public HashMap<String, Character> addOperators(){
        var operators = new HashMap<String, Character>();

        operators.put("add", '+');
        operators.put("subtract", '-');
        operators.put("divide", '/');
        operators.put("multiply", '*');

        return operators;
    }

    public void logOperators(HashMap<String, Character> operators){

        for(var entry: operators.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}