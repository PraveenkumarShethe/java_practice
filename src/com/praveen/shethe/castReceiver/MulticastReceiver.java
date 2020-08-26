package com.praveen.shethe.castReceiver;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

/**
 * Created by Praveenkumar on 8/21/2020.
 */
public class MulticastReceiver extends Thread {
    protected MulticastSocket socket = null;
    protected byte[] buf = new byte[256];

    public void run() {
        InetAddress group = null;
        try {
            socket = new MulticastSocket(4446);
            group = InetAddress.getByName("230.0.0.0");
            socket.joinGroup(group);
        } catch (IOException e) {
            e.printStackTrace();
        }
        while (true) {
            try {
                DatagramPacket packet = new DatagramPacket(buf, buf.length);
                try {
                    socket.receive(packet);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                String received = new String(
                        packet.getData(), 0, packet.getLength());
                if ("end".equals(received)) {
                    break;
                }
            } finally {
                System.out.println("finally");
            }
        }
        try {
            socket.leaveGroup(group);
        } catch (IOException e) {
            e.printStackTrace();
        }
        socket.close();
    }
}