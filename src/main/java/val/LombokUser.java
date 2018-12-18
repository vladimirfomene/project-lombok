package val;

import lombok.val;

import java.util.ArrayList;
import java.util.List;

public class LombokUser {

    public List<String> createUsers(){
        val users = new ArrayList<String>();

        users.add("vladimir");
        users.add("fomene");
        users.add("bruno");
        users.add("krebs");

        return users;

    }

    public void logUsers(List<String> users){

        for(val user: users){
            System.out.println("I'm " + user);
        }

    }
}
