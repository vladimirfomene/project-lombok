package var;

import java.util.HashMap;
import java.util.Map;

public class VanillaMath {


    public int add(int a, int b){
        int sum = a + b;

        return sum;
    }

    public HashMap<String, Character> addOperators(){
        HashMap<String, Character> operators = new HashMap<String, Character>();

        operators.put("add", '+');
        operators.put("subtract", '-');
        operators.put("divide", '/');
        operators.put("multiply", '*');

        return operators;
    }

    public void logOperators(HashMap<String, Character> operators){

        for(Map.Entry<String, Character> entry: operators.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
