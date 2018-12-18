import Accessor.LombokAppUser;
import Accessor.VanillaAppUser;
import Builder.LombokCourse;
import Builder.VanillaCourse;
import Cleanup.LombokIO;
import Cleanup.VanillaIO;
import Constructor.LombokCustomer;
import Constructor.VanillaCustomer;
import Data.User;
import EqualsAndHashCode.LombokLecture;
import EqualsAndHashCode.VanillaLecture;
import Log.LombokLog;
import Log.VanillaLog;
import NonNull.LombokClient;
import NonNull.VanillaClient;
import ToString.LombokPerson;
import ToString.VanillaPerson;
import Value.LombokStudent;
import Value.VanillaStudent;
import val.LombokUser;
import val.VanillaUser;
import var.LombokMath;
import var.VanillaMath;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class TestLombok {

    public static void main(String[] args){

        //testVal();
        //testVar();
        //testToString();
        //testLog();
        //testAccessor();
        //testConstructor();
        //testEqualsAndHashCode();
        //testNonNull();
        //testData();
        //testBuilder();
        //testValue();
        //testCleanup();

    }

    public static void testVal(){

        //LombokUser lombokUser = new LombokUser();
        VanillaUser vanillaUser = new VanillaUser();
        List<String> users = vanillaUser.createUsers();

        vanillaUser.logUsers(users);
    }

    public static void testVar(){

        //LombokMath lombokMath = new LombokMath();
        VanillaMath vanillaMath = new VanillaMath();

        int sum = vanillaMath.add(2018, 1);
        System.out.println("The sum is " + sum);
        HashMap<String, Character> operators = vanillaMath.addOperators();
        vanillaMath.logOperators(operators);
    }

    public static void testToString(){

        LombokPerson lombokPerson = new LombokPerson("vladimir", "fomene");
        VanillaPerson vanillaPerson = new VanillaPerson("vladimir", "fomene");

        //lombok version
        System.out.println(lombokPerson.toString());

        //Vanilla version
        System.out.println(vanillaPerson.toString());
    }

    public static void testLog(){

        VanillaLog vanillaLog = new VanillaLog();
        LombokLog lombokLog = new LombokLog();

        //vanilla version
        vanillaLog.log();

        //lombok version
        lombokLog.log();
    }

    public static void testAccessor(){
        VanillaAppUser vanillaAppUser = new VanillaAppUser("exampleuser", "password");
        LombokAppUser lombokAppUser = new LombokAppUser("exampleuser", "password");

        System.out.println("Username: " + vanillaAppUser.getUsername() + ", " + "Password: " + vanillaAppUser.getPassword());
        System.out.println("Username: " + lombokAppUser.getUsername() + ", " + "Password: " + lombokAppUser.getPassword());
    }


    public static void testConstructor(){

        VanillaCustomer vanillaCustomer = new VanillaCustomer("Vladimir Fomene", "+237xxxxxxxxx", "male");
        LombokCustomer lombokCustomer = new LombokCustomer("Vladimir Fomene", "+237xxxxxxxxx", "male");

        //vanilla version
        System.out.println(vanillaCustomer.toString());

        //lombok version
        System.out.println(lombokCustomer.toString());
    }

    public static void testEqualsAndHashCode(){

        VanillaLecture vanillaLecture = new VanillaLecture("Intro to Computer Science", "cs50");
        LombokLecture lombokLecture = new LombokLecture("Operating Systems", "cs121");

        System.out.println(vanillaLecture.hashCode());
        System.out.println("Are these two objects equals?" + vanillaLecture.equals(lombokLecture));

        System.out.println(lombokLecture.hashCode());
        System.out.println("Are these two objects equals?" + lombokLecture.equals(vanillaLecture));

    }

    public static void testNonNull(){

        //VanillaClient vanillaClient = new VanillaClient(null, "+237xxxxxxxxx");
        LombokClient lombokClient = new LombokClient(null, "+237xxxxxxxxx");
    }

    public static void testData(){

        User user = new User("exampleuser", "password");

        System.out.println(user.hashCode());
        System.out.println("Are these two objects equals?" + user.equals(user));

        System.out.println(user.toString());

        System.out.println("User: " + user.getUsername() + ", " + "password: " + user.getPassword());

        user.setPassword("xxxxxxxxxxxxxxx");
        user.setUsername("newUsername");

        System.out.println("User: " + user.getUsername() + ", " + "password: " + user.getPassword());


    }

    public static void testBuilder(){
        VanillaCourse vanillaCourse = VanillaCourse.builder().courseName("Intro to CS").courseCode("cs50").build();

        LombokCourse lombokCourse = LombokCourse.builder().courseName("Intro to CS").courseCode("cs50").build();

        System.out.println(vanillaCourse.toString());
        System.out.println(lombokCourse.toString());
    }

    public static void testValue(){
        VanillaStudent vanillaStudent = new VanillaStudent();

        System.out.println("Student Name: " + vanillaStudent.getStudentName() + ", " + "Student Id: " + vanillaStudent.getStudentID());
        System.out.println(vanillaStudent.hashCode());
        System.out.println("Are these two objects equals?" + vanillaStudent.equals(vanillaStudent));

        LombokStudent lombokStudent = new LombokStudent();
        System.out.println("Student Name: " + lombokStudent.getStudentName() + ", " + "Student Id: " + lombokStudent.getStudentID());
        System.out.println(lombokStudent.hashCode());
        System.out.println("Are these two objects equals?" + lombokStudent.equals(lombokStudent));
    }

    public static void testCleanup(){

        try{
            VanillaIO vanillaIO = new VanillaIO();
            //LombokIO lombokIO = new LombokIO();
        }catch(IOException ex){
            ex.printStackTrace();
        }

    }


}
