package example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class EmailSocket {
    private static Socket smtpSocket;
    private static PrintWriter out;
    private static BufferedReader in;
    public static void main(String args[]){
        try {
            smtpSocket=new Socket("localhost",25);
            in=new BufferedReader(new InputStreamReader(smtpSocket.getInputStream()));
            out= new PrintWriter(smtpSocket.getOutputStream(),true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        if (smtpSocket !=null && out !=null && in !=null){
            try {


            String response;
            while ((response= in.readLine()) !=null){
                System.out.println("Server : "+response);
                if (response.indexOf("220") !=-1)break;
            }
            out.println("Hello "+ InetAddress.getLocalHost().getHostAddress());
                System.out.println("Hello "+ InetAddress.getLocalHost().getHostAddress());

                while ((response= in.readLine()) !=null){
                    System.out.println("Server : "+response);
                    if(response.indexOf("250") !=-1)break;
                }

                out.println("Mail from: xyz@gmail.com");
                while ((response= in.readLine()) !=null){
                    System.out.println("server : "+ response);
                    if (response.indexOf("250") !=-1)break;
                }
                out.println("Rcpt to : abc@gmail.com");
                while ((response= in.readLine()) !=null){
                    System.out.println("server : "+ response);
                    if (response.indexOf("250") !=-1)break;
                }

                out.println("DATA");
                while ((response= in.readLine()) !=null){
                    System.out.println("server : "+ response);
                    if (response.indexOf("354") !=-1)break;
                }

                out.println("X-Mailer: Java");
                out.println("From: mytest@test.com");
                out.println("To: jnetworkprogramming@gmail.com");
                out.println("Subject: TEST EMAIL");
                out.println();
                out.println("Subject: TEST EMAIL"); // message body
                out.println("This is a test message"); // message body
                out.println("Thanks,"); // message body
                out.println("Java Network Programming course"); // message body
                out.println();
                out.println(".");
                out.println();

                while ((response = in.readLine()) != null) {
                    System.out.println("Server: " + response);
                    if (response.indexOf("250") != -1) {
                        break;
                    }
                }

                /*
                STEP 7  Send Quit command
                */

                out.println("QUIT");

                while ((response = in.readLine()) != null) {
                    System.out.println("Server: " + response);
                    if (response.indexOf("221") != -1) {
                        break;
                    }
                }

                System.out.println("Email successfully sent!");

                //close the output stream
                // close the input stream
                // close the socket
                out.close();
                in.close();
                smtpSocket.close();



            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }
}

