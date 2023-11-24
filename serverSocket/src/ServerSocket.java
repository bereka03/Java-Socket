import java.io.*;
import java.net.Socket;

public class ServerSocket {

    private java.net.ServerSocket serverSocket;
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;

    public void startServer(int port) throws IOException {
        serverSocket = new java.net.ServerSocket(port);
        clientSocket = serverSocket.accept();
        out = new PrintWriter(clientSocket.getOutputStream(),  true);
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        String message = in.readLine();
        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\user\\IdeaProjects\\serverSocket\\src\\test.txt");
            fileWriter.write(message);
            fileWriter.close();
            out.println("message was write succesfully in file");
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    public void close() throws IOException{
        serverSocket.close();
        clientSocket.close();
        in.close();
        out.close();
    }
}
