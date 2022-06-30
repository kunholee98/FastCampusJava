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
import com.company.design.strategy.*;

import java.util.concurrent.atomic.AtomicLong;

public class Main {

    public static void main(String[] args) {
        Encoder encoder = new Encoder();

        // base64
        EncodingStrategy base64 = new Base64Strategy();

        // normal
        EncodingStrategy normal = new NormalStrategy();

        String message = "hello java";
        encoder.setEncodingStrategy(base64);
        String base64Result = encoder.getMessage(message);
        System.out.println(base64Result);

        encoder.setEncodingStrategy(normal);
        String normalResult = encoder.getMessage(message);

        System.out.println(normalResult);

        encoder.setEncodingStrategy(new AppendStrategy());
        String appendResult = encoder.getMessage(message);
        System.out.println(appendResult);
    }


    public static void connect(Electronic110V electronic110V){
        electronic110V.powerOn();
    }

}

