package NonNull;

import lombok.NonNull;

public class LombokClient {

    private String clientName;

    private String clientTel;


    public LombokClient(@NonNull String clientName, String clientTel) {

        this.clientName = clientName;
        this.clientTel = clientTel;
    }
}

