package workFiles;

import java.io.IOException;

public class ServerStarter {
    public static void main(String[] args) throws IOException {
        int port = 22814;
        Server server = new Server();
        System.out.println("Serv started on the port: " + port);
        server.start(port);
    }
}
