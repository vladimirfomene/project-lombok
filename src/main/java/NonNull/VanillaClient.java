package NonNull;

public class VanillaClient {

    private String clientName;

    private String clientTel;


    public VanillaClient(String clientName, String clientTel) {

        if (clientName == null) {
            throw new NullPointerException("ClientName cannot be null");
        }

        this.clientName = clientName;
        this.clientTel = clientTel;
    }
}
