/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.IO.NIO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Victor
 */
public class ChannelBufferDemo2 {

    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("test5.txt", "r"); FileChannel channel = file.getChannel();) {
            ByteBuffer buffer = ByteBuffer.allocate(5);
            channel.read(buffer);
            buffer.flip();

            System.out.println((char) buffer.get());
            System.out.println((char) buffer.get());
            System.out.println((char) buffer.get());
            buffer.rewind();
            System.out.println((char) buffer.get());
            System.out.println("====================");

            buffer.compact();
            channel.read(buffer);
            buffer.flip();
            while (buffer.hasRemaining()) {
                System.out.println((char) buffer.get());
            }
            System.out.println("===================");
            buffer.clear();
            channel.read(buffer);
            buffer.flip();
            System.out.println((char)buffer.get());
            buffer.mark();
            System.out.println("after buffer.mark()");
            System.out.println((char)buffer.get());
            System.out.println((char)buffer.get());
            System.out.println("=======================");
            buffer.reset();
            while(buffer.hasRemaining()){
                System.out.println((char)buffer.get());
            }
                
            

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ChannelBufferDemo2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ChannelBufferDemo2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
