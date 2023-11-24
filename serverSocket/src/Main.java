import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket();
        serverSocket.startServer(4000);

        serverSocket.close();
    }
}