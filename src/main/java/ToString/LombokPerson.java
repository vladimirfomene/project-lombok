package ToString;

import lombok.ToString;

@ToString
public class LombokPerson {

    private String firstName;

    private String lastName;

    public LombokPerson(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


}
