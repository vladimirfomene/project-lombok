package Accessor;

import lombok.Getter;
import lombok.Setter;

public class LombokAppUser {

    @Setter @Getter
    private String username;

    @Setter @Getter
    private String password;

    public LombokAppUser(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
