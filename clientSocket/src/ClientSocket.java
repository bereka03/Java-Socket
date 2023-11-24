import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ClientSocket {
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;

    public void startConnection(String ip, int port) throws IOException {
        clientSocket = new Socket(ip, port);

        out = new PrintWriter(clientSocket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
    }

    public void sendMessage(String message) throws IOException {
        out.println(message);
        String inMessage = in.readLine();
        System.out.println(inMessage);
    }

    public void close() throws IOException {
        clientSocket.close();
        in.close();
        out.close();
    }


}