package xd;

import io.xjar.boot.XBoot;

import java.io.File;

public class xd {
    public static void main(String[] args) throws Exception {
        String password = "pwd";
        File encrypted = new File("server.jar");
        File decrypted = new File("server-decry.jar");
        XBoot.decrypt(encrypted, decrypted, password);
    }
}
