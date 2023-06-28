package example;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddresses {
    public static void main(String[] args){
        try {
            InetAddress address=InetAddress.getLocalHost();
            System.out.println(address.getHostAddress());
            System.out.println(address.getHostName());
            InetAddress address1=InetAddress.getByName("google.com");
            System.out.println(address1.getHostAddress());
            System.out.println(address1.getHostName());
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }
}
