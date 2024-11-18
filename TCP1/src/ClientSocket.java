import java.io.*;
import java.net.Socket;

public class ClientSocket {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.168.1.1", 12347);

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bufferedWriter.write("SYN");
        bufferedWriter.write("192.168.1.10");
        bufferedWriter.flush();


        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line = reader.readLine();


        while (line != null){
            System.out.println(line);
            System.out.flush();
            line = reader.readLine();
        }
    }
}
