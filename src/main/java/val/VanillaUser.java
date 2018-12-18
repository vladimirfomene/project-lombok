package val;

import java.util.ArrayList;
import java.util.List;

public class VanillaUser {

    public List<String> createUsers(){
        List<String> users = new ArrayList<String>();

        users.add("vladimir");
        users.add("fomene");
        users.add("bruno");
        users.add("krebs");

        return users;

    }

    public void logUsers(List<String> users){

        for(String user: users){
            System.out.println("I'm " + user);
        }

    }
}
