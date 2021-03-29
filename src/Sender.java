import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Sender {
    public static void main(String[] args) {

        try {
            InetAddress address = InetAddress.getByName("localhost");
            String message = "REGISTER, 192.168.1.100, 6000, Node1";
            DatagramPacket packet = new DatagramPacket(message.getBytes(), message.getBytes().length, address, 4000);
            DatagramSocket socket = new DatagramSocket(10000);

            socket.send(packet);
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
