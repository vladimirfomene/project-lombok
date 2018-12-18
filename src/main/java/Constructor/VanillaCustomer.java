package Constructor;

public class VanillaCustomer {

    public String name;

    public String tel;

    public String gender;


    public VanillaCustomer(String name, String tel, String gender){
        this.name = name;
        this.tel = tel;
        this.gender = gender;
    }

    public VanillaCustomer(){

    }

    @Override
    public String toString() {
        return "VanillaCustomer{" +
                "name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
