package workFiles;

import java.io.IOException;

public class ClientStarter {
    public static void main(String[] args) throws IOException {
        Client client = new Client();
        client.startConnection("127.0.0.1", 22814);
        String opa_opa = client.sendMessage("opa opa");
        System.out.println("" + opa_opa);
        client.sendMessage("exit");
        client.stopConnection();
    }
}
