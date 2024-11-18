import java.net.InetAddress;
import java.net.Socket;

public class Client{
    public static void main(String args[]){
        try{
            Socket socket =
                    new Socket(
                            InetAddress.getByName(args[0]),
                            4322);
            int in;
            while( (in=System.in.read()) >= 0 )
                socket.getOutputStream().write(
                        (char) in
                );
            socket.close();
        } catch(Exception e)
        { System.err.println(e); }
    }
}
