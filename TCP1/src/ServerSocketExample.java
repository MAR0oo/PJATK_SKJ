import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketExample {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(12347);
        while (true){
            Socket socket = serverSocket.accept();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bufferedWriter.write("Napisz: \"END\" by zakończyć połączenie.");

            String line = bufferedReader.readLine();
            while (!line.contains("END")){
                bufferedWriter.write("Server says: ");
                bufferedWriter.write(line);
                bufferedWriter.write("\n");
                bufferedWriter.flush();
                line = bufferedReader.readLine();
            }
            socket.close();
        }
    }
}
