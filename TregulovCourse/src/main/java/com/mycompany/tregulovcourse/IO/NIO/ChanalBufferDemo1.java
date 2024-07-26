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
public class ChanalBufferDemo1 {
    public static void main(String[] args) {
     try(RandomAccessFile file = new RandomAccessFile("test10.txt","rw");
             FileChannel channel = file.getChannel();
             ){
         ByteBuffer buffer = ByteBuffer.allocate(25);
         StringBuilder stix = new StringBuilder();
         
         int readByte = channel.read(buffer);
         while(readByte > 0){
             System.out.println("read byte "+readByte);
             buffer.flip();
             while(buffer.hasRemaining()){
                 stix.append((char)buffer.get());
             }
             buffer.clear();
             readByte = channel.read(buffer);
             
         }
         System.out.println(stix);
         String text = "\n Threre are only two vays to live your life."
                 + "One is as though nothing is a miracle. The other is as"
                 + "though everything is a miracle.";
//         ByteBuffer buffer2 = ByteBuffer.allocate(text.getBytes().length);
//         buffer2.put(text.getBytes());
//         buffer2.flip();
//         channel.write(buffer2);
        ByteBuffer buffer2 = ByteBuffer.wrap(text.getBytes());
        channel.write(buffer2);
                 
         
     }  catch (FileNotFoundException ex) {
            Logger.getLogger(ChanalBufferDemo1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ChanalBufferDemo1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
