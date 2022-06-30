package com.company.design;

import com.company.design.adapter.*;
import com.company.design.aop.AopBrowser;
import com.company.design.decorator.*;
import com.company.design.facade.Ftp;
import com.company.design.facade.Reader;
import com.company.design.facade.Sftp;
import com.company.design.facade.Writer;
import com.company.design.observer.Button;
import com.company.design.observer.IButtonListener;
import com.company.design.proxy.BrowserProxy;
import com.company.design.proxy.IBrowser;

import java.util.concurrent.atomic.AtomicLong;

public class Main {

    public static void main(String[] args) {
        Ftp ftpClient = new Ftp("www.ohou.se", 22, "/home/etc");
        ftpClient.connect();
        ftpClient.moveDirectory();

//        Writer writer = new Writer("text.tmp");
//        writer.fileConnect();
//        writer.fileWrite();
//
//        Reader reader = new Reader("text.tmp");
//        reader.fileConnect();
//        reader.fileRead();
//
//        reader.fileDisconnect();
//        writer.fileDisconnect();
//        ftpClient.disConnect();

        Sftp sftpClient = new Sftp("www.ohou.se", 22, "/home/etc", "text.tmp");
        sftpClient.connect();

        sftpClient.write();
        sftpClient.read();

        sftpClient.disConnect();

    }


    public static void connect(Electronic110V electronic110V){
        electronic110V.powerOn();
    }

}

