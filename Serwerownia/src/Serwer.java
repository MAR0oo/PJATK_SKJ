import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Serwer {
    public static void main(String[] args) throws IOException {
        int port = 787;
        ArrayList<Integer> list = new ArrayList<>();
        int licznikPolaczen = 0;

        ServerSocket serverSocket = new ServerSocket(port);

        while (true){

            Socket socket = serverSocket.accept();
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            String line = null;

            if(licznikPolaczen<5) {
                line = bufferedReader.readLine();
                list.add(Integer.valueOf(line));
                licznikPolaczen++;
            }

            if(licznikPolaczen == 4){

                int gcd = 1;
                for(int i = 1; i <= list.get(0) && i <= list.get(1)
                        && i <= list.get(2) && i <= list.get(3); i++)
                {
                    if(list.get(0)%i==0 && list.get(1)%i==0 && list.get(2)%i==0 && list.get(3)%i==0)
                        gcd = i;
                }
                printWriter.println(gcd);
            }

            // zliczanie ile wiadomości doszło od klienta
//            line = bufferedReader.readLine();
//            System.out.println(line);

            if(licznikPolaczen<=6){
                licznikPolaczen++;
            }
            if(licznikPolaczen==6){
                printWriter.println(licznikPolaczen);
                printWriter.println(787);
            }


            bufferedReader.readLine();



        }
    }
}
