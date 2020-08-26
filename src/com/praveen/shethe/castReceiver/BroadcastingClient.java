package com.praveen.shethe.castReceiver;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * Created by Praveenkumar on 8/21/2020.
 */
public class BroadcastingClient {
    private static DatagramSocket socket = null;

    public static void main(String[] args) throws IOException {
        broadcast("Hello", InetAddress.getByName("255.255.255.255"));
    }

    public static void broadcast(
            String broadcastMessage, InetAddress address) throws IOException, IOException {
        socket = new DatagramSocket();
        socket.setBroadcast(true);

        byte[] buffer = broadcastMessage.getBytes();

        DatagramPacket packet
                = new DatagramPacket(buffer, buffer.length, address, 4445);
        socket.send(packet);
        socket.close();
    }
}
